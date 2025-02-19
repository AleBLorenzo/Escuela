import React from 'react';
import { Link } from 'react-router-dom';
import './Home.css';

function Home() {
  return (
    <div className="home-container">
      <header className="home-header">
        <h1>Bienvenido a tu Lista de Tareas</h1>
        <p>Gestiona tus tareas de manera fácil y rápida</p>
      </header>
      <main className="home-main">
        <div className="home-content">
          <p>
            Organiza tu vida con nuestra aplicación de lista de tareas. 
            Crea, edita y elimina tareas con facilidad. 
            Regístrate para comenzar a usar todas nuestras funcionalidades.
          </p>
          <div className="home-buttons">
            <Link to="/register" className="home-button register">Registrarse</Link>
            <Link to="/login" className="home-button login">Iniciar Sesión</Link>
          </div>
        </div>
        <img src="https://via.placeholder.com/400x300" alt="To-Do List" className="home-image" />
      </main>
    </div>
  );
}

export default Home;