
    function navigateToSiguiente() {
        window.location.href = 'https://gruposjaveriana.dynaco.co/grupo27/diagrama/componentes';
    }

    function navigateToAtras() {
        window.location.href = 'https://gruposjaveriana.dynaco.co/grupo27/diagrama/contexto';
    }

    function navigateToHomePage() {
        window.location.href = 'https://gruposjaveriana.dynaco.co/grupo27/homescreen';
    }

    function toggleGetRequest() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/reqfuncionales";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 && xhr.status < 300) {
                document.getElementById('response-container0').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function toggleGetRequest1() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/reqnofuncionales";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 && xhr.status < 300) {
                document.getElementById('response-container').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function toggleGetRequest2() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/diagrama/contexto";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 && xhr.status < 300) {
                document.getElementById('response-container1').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function toggleGetRequest3() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/diagrama/contenedor";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 && xhr.status < 300) {
                document.getElementById('response-container2').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function toggleGetRequest4() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/diagrama/componentes";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 && xhr.status < 300) {
                document.getElementById('response-container3').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function toggleGetRequest5() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/diagrama/entidad";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 && xhr.status < 300) {
                document.getElementById('response-container4').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function toggleGetRequest6() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/endpoints";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 && xhr.status < 300) {
                document.getElementById('response-container5').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function toggleGetRequest7() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/pruebas/frontend";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 and xhr.status < 300) {
                document.getElementById('response-container6').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function toggleGetRequest8() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/pruebas/backend";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 && xhr.status < 300) {
                document.getElementById('response-container7').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function toggleGetRequest9() {
        var xhr = new XMLHttpRequest();
        var url = "https://gruposjaveriana.dynaco.co/grupo27/pruebas/despliegue";

        xhr.open('GET', url, true);

        xhr.onload = function () {
            if (xhr.status >= 200 && xhr.status < 300) {
                document.getElementById('response-container8').innerHTML = xhr.responseText;
                window.location.href = url;
            } else {
                console.error('Request failed with status', xhr.status);
            }
        };

        xhr.send();
    }

    function closeModal() {
        document.getElementById('myModal').style.display = 'none';
    }

    document.getElementById('myForm').addEventListener('submit', function (event) {
        event.preventDefault();

        displaySuccessModal('Tu formulario ha sido enviado correctamente');

        var formData = {
            nombres: document.getElementById('nombres').value,
            apellidos: document.getElementById('apellidos').value,
            correo: document.getElementById('correo').value,
            semestre: parseInt(document.getElementById('semestre').value),
            descripcion: document.getElementById('descripcion').value
        };

        var apiEndpoint = 'https://gruposjaveriana.dynaco.co/grupo27/subirpregunta';

        fetch(apiEndpoint, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        })
        .then(response => {
            if (response.status === 200) {
                console.log('Resource created successfully');
                return response.json();
            } else {
                console.error('Request failed with status', response.status);
                throw new Error('Request failed');
            }
        })
        .then(data => {
            console.log('Success:', data);
            document.getElementById('myForm').reset();
        })
        .catch(error => {
            console.error('Error:', error);
        });

        return false;
    });

    function displaySuccessModal(message) {
        document.getElementById('successMessage').innerHTML = message;
        document.getElementById('myModal').style.display = 'block';
    }