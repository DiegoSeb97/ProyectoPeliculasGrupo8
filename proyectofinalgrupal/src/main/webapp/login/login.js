function validarDatos(){
    //usuario prueba
    var userMailDefault = 'admin@admin.com';
    var userPwDefault = 'admin';

    //datos ingresados
    var userMailIngr = document.getElementById('inputEmail4').value;
    var userPwIngr = document.getElementById('inputPassword4').value;

    if(userMailIngr == userMailDefault && userPwDefault == userPwIngr){
        alert('Credenciales correctas, redirigiendo a pagina principal...');
        /*redirect a pagina de bienvenida, index.html*/
        location.href = "../index.html";
    }else{
        alert('Email y/o contraseña incorrecta, ingrese nuevamente sus datos.');
    }
}