"use strict";

clima = document.getElementById("clima");
clima.addEventListener('click', function () {
  obtenerDatos();
});

function obtenerDatos() {
  console.log("diste click");
  var url = 'https://api.weatherapi.com/v1/forecast.json?key=3984a02db1cb4e96875131610243105&q=Mendoza, Mendoza.&days=7&aqi=yes&alerts=yes';
  var api = new XMLHttpRequest();
  api.open('GET', url, true);
  api.send();

  api.onreadystatechange = function () {
    if (this.status == 200 && this.readyState == 4) {
      var respuesta = JSON.parse(this.responseText);
      console.log(respuesta);
    }
  };
}