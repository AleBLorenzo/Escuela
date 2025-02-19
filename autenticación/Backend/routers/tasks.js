const express = require('express');
const router = express.Router();
const authMiddleware = require('../middleware/authMiddleware');

// Obtener todas las tareas
router.get('/tasks', authMiddleware, async (req, res) => {
  try {
    const [rows] = await req.db.query('SELECT * FROM tasks WHERE user_id = ?', [req.user.id]);
    res.json(rows);
  } catch (error) {
    res.status(500).json({ message: 'Error al obtener las tareas' });
  }
});

// Crear una nueva tarea
router.post('/tasks', authMiddleware, async (req, res) => {
  const { text } = req.body;
  try {
    const [result] = await req.db.query('INSERT INTO tasks (text, user_id) VALUES (?, ?)', [text, req.user.id]);
    res.status(201).json({ id: result.insertId, text });
  } catch (error) {
    res.status(500).json({ message: 'Error al crear la tarea' });
  }
});

// Actualizar una tarea
router.put('/tasks/:id', authMiddleware, async (req, res) => {
  const { id } = req.params;
  const { text } = req.body;
  try {
    await req.db.query('UPDATE tasks SET text = ? WHERE id = ? AND user_id = ?', [text, id, req.user.id]);
    res.json({ message: 'Tarea actualizada' });
  } catch (error) {
    res.status(500).json({ message: 'Error al actualizar la tarea' });
  }
});

// Eliminar una tarea
router.delete('/tasks/:id', authMiddleware, async (req, res) => {
  const { id } = req.params;
  try {
    await req.db.query('DELETE FROM tasks WHERE id = ? AND user_id = ?', [id, req.user.id]);
    res.json({ message: 'Tarea eliminada' });
  } catch (error) {
    res.status(500).json({ message: 'Error al eliminar la tarea' });
  }
});

module.exports = router;