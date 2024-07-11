document.addEventListener('DOMContentLoaded', function () {
    flatpickr("#datetimepicker1", {
        enableTime: false,
        dateFormat: "d-m-Y", // hora H:i
        locale: "es"
    });
});

