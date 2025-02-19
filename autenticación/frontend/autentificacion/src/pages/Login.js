import axios from 'axios';
import React, { useState } from 'react';
import './Login.css'; // Asegúrate de crear este archivo CSS

function Login() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://localhost:5000/api/auth/login', { username, password });
      console.log(response.data);
      // Manejar la respuesta, como almacenar el token y redirigir
    } catch (error) {
      console.error('Error en el inicio de sesión:', error);
      // Manejar el error, como mostrar un mensaje de error
    }
  };

  return (
    <div className="login-container">
      <form onSubmit={handleSubmit} className="login-form">
        <h2>Inicio de Sesión</h2>
        <div className="form-group">
          <label htmlFor="username">Usuario</label>
          <input
            id="username"
            type="text"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Contraseña</label>
          <input
            id="password"
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </div>
        <button type="submit" className="submit-btn">Iniciar Sesión</button>
      </form>
    </div>
  );
}

export default Login;