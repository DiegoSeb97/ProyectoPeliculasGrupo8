console.log("Entro a GetRequest");
document.addEventListener("DOMContentLoaded", function() {

  const movieSection = document.getElementById("pelisdb");
  const movies = [];

  function loadMovieList() {
    console.log("Entro a loadMovieList");
    fetch("/ejemploproyectofinal/movies?action=getAll")
      .then(response => response.json())
      .then(data => {
        console.log("data : " + data);
        data.forEach(movie =>{
          movies.push(movie);
          movieSection.innerHTML += `
            <tr>
              <td>${movie.id}</td>
              <td>${movie.nombre}</td>
              <td>${movie.descripcion}</td>
              <td>${movie.genero}</td>
              <td>${movie.calificacion}</td>
              <td>${movie.director}</td>
              <td>${movie.anio}</td>
            </tr>
          `
        });
      });
  }
  loadMovieList();
});