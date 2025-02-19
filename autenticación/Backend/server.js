const express = require('express');
const mysql = require('mysql2/promise');
const cors = require('cors');
const authRoutes = require('./routes/auth');
const taskRoutes = require('./routes/tasks');

const app = express();
const PORT = process.env.PORT || 5000;

// Configuración de la conexión a MySQL
const pool = mysql.createPool({
  host: 'localhost',
  user: 'alumno',
  password: 'Ale050819*+',
  database: 'Prueba',
  waitForConnections: true,
  connectionLimit: 10,
  queueLimit: 0
});

app.use(cors());
app.use(express.json());

// Middleware para pasar la conexión de la base de datos a las rutas
app.use((req, res, next) => {
  req.db = pool;
  next();
});

app.use('/api/auth', authRoutes);
app.use('/api', taskRoutes);

app.listen(PORT, () => {
  console.log(`Servidor corriendo en http://localhost:${PORT}`);
});
