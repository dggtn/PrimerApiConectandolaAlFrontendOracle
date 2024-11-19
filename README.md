<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trabajo Práctico Obligatorio - Curso OracleNextOne</title>
</head>
<body>

    <h1>Trabajo Práctico Obligatorio - Curso OracleNextOne</h1>

    <h2>Descripción</h2>
    <p>Este proyecto corresponde al trabajo práctico obligatorio del curso <strong>OracleNextOne</strong>. Se trata de una API RESTful construida con <strong>Spring Framework</strong> en <strong>Java</strong>, que implementa las mejores prácticas de desarrollo de aplicaciones web utilizando el patrón <strong>MVC (Model-View-Controller)</strong>.</p>

    <h2>Tecnologías Utilizadas</h2>
    <ul>
        <li><strong>Lenguaje</strong>: Java</li>
        <li><strong>Framework</strong>: Spring Boot</li>
        <li><strong>Patrón de arquitectura</strong>: MVC</li>
        <li><strong>Manejo de CORS</strong>: Configuración para permitir solicitudes entre dominios diferentes</li>
        <li><strong>DTO (Data Transfer Object)</strong>: Implementación para mejorar la transferencia de datos y aplicar buenas prácticas en el diseño de la API.</li>
    </ul>

    <h2>Características</h2>
    <ul>
        <li><strong>API REST</strong>: Exposición de datos mediante rutas HTTP utilizando Spring.</li>
        <li><strong>MVC</strong>: Separación clara entre la lógica de negocio (Modelo), la vista (no utilizada directamente en esta API, pero preparada para integrarse con Frontend) y el controlador (encargado de recibir y responder las solicitudes HTTP).</li>
        <li><strong>DTOs</strong>: Uso de objetos de transferencia de datos para separar la estructura interna de la base de datos de la API expuesta.</li>
        <li><strong>Manejo de CORS</strong>: Configuración adecuada para permitir que la API sea consumida desde diferentes orígenes.</li>
    </ul>

    <h2>Estructura del Proyecto</h2>
    <ul>
        <li><strong>Controller</strong>: Define las rutas y maneja las solicitudes HTTP.</li>
        <li><strong>Service</strong>: Contiene la lógica de negocio.</li>
        <li><strong>Repository</strong>: Acceso a la base de datos (si es necesario).</li>
        <li><strong>DTO</strong>: Define la estructura de los datos que se envían y reciben a través de la API.</li>
    </ul>

    <h2>Instalación y Ejecución</h2>

    <h3>Requisitos Previos</h3>
    <ul>
        <li><strong>Java 8+</strong> instalado en tu sistema.</li>
        <li><strong>Maven</strong> o <strong>Gradle</strong> para la gestión de dependencias.</li>
        <li><strong>IDE</strong> como IntelliJ IDEA, Eclipse, o VSCode con soporte para Java.</li>
    </ul>

    <h3>Pasos para ejecutar el proyecto:</h3>
    <ol>
        <li><strong>Clona el repositorio</strong>:
            <pre><code>git clone https://github.com/tu-usuario/tu-repo.git</code></pre>
        </li>
        <li><strong>Navega al directorio del proyecto</strong>:
            <pre><code>cd tu-repo</code></pre>
        </li>
        <li><strong>Compila e instala las dependencias</strong> (si estás utilizando Maven):
            <pre><code>mvn clean install</code></pre>
        </li>
        <li><strong>Ejecuta la aplicación</strong>:
            <p>Si estás usando Maven:</p>
            <pre><code>mvn spring-boot:run</code></pre>
            <p>O si estás utilizando Gradle:</p>
            <pre><code>gradle bootRun</code></pre>
        </li>
        <li>La API estará disponible en <a href="http://localhost:8080" target="_blank">http://localhost:8080</a>.</li>
    </ol>

    <h2>Endpoints de la API</h2>

    <h3>GET /api/ejemplo</h3>
    <p>Devuelve un ejemplo de datos.</p>
    <p><strong>Respuesta de ejemplo:</strong></p>
    <pre><code>{
    "id": 1,
    "nombre": "Ejemplo",
    "descripcion": "Este es un ejemplo de datos."
}</code></pre>

    <h3>POST /api/ejemplo</h3>
    <p>Recibe un objeto de tipo <code>Ejemplo</code> y lo guarda en la base de datos.</p>
    <p><strong>Body de la solicitud:</strong></p>
    <pre><code>{
    "nombre": "Nuevo Ejemplo",
    "descripcion": "Descripción del nuevo ejemplo."
}</code></pre>

    <p><strong>Respuesta de ejemplo:</strong></p>
    <pre><code>{
    "id": 2,
    "nombre": "Nuevo Ejemplo",
    "descripcion": "Descripción del nuevo ejemplo."
}</code></pre>

    <h3>Manejo de CORS</h3>
    <p>Si tu API se utiliza en un entorno donde el frontend se encuentra en un dominio diferente, puedes encontrarte con problemas relacionados con CORS (Cross-Origin Resource Sharing). Para solucionar esto, se han configurado los permisos de CORS en este proyecto, permitiendo que tu API sea accesible desde distintos orígenes.</p>

    <h2>Buenas Prácticas Implementadas</h2>
    <ul>
        <li><strong>Uso de DTOs</strong>: Separación entre las entidades del modelo y los objetos de transferencia de datos para evitar exponer detalles internos.</li>
        <li><strong>Control de Errores</strong>: Manejo adecuado de excepciones y errores HTTP para garantizar una correcta interacción con los usuarios de la API.</li>
        <li><strong>Documentación</strong>: Se ha documentado el código y los endpoints para una fácil comprensión y extensión futura.</li>
    </ul>

    <h2>Contribución</h2>
    <p>Si deseas contribuir a este proyecto, por favor sigue estos pasos:</p>
    <ol>
        <li>Haz un fork del repositorio.</li>
        <li>Crea una nueva rama (<code>git checkout -b feature/nueva-funcionalidad</code>).</li>
        <li>Realiza tus cambios y haz commits.</li>
        <li>Abre un pull request describiendo tus cambios.</li>
    </ol>

    <h2>Licencia</h2>
    <p>Este proyecto está bajo la licencia <strong>MIT</strong>. Consulta el archivo LICENSE para más detalles.</p>

</body>
</html>
