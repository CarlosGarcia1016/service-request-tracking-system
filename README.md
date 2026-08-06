# Sistema de Seguimiento para Solicitudes de Servicio Interno

## Resumen Ejecutivo

El Sistema de Seguimiento para Solicitudes de Servicio Interno es una propuesta de aplicación desarrollada para mejorar la administración de solicitudes dentro de GE HealthCare.

Actualmente, gran parte de las solicitudes internas son gestionadas mediante correos electrónicos y archivos de Excel, lo que dificulta conocer el estado de cada requerimiento, identificar a los responsables y mantener un historial organizado de las actividades realizadas.

La solución propone una aplicación desarrollada en Java utilizando Spring Boot y MySQL para centralizar la información, facilitar el seguimiento de las solicitudes y mejorar la productividad del proceso. Además, el proyecto incorpora GitHub para el control de versiones y GitHub Actions con JUnit para validar automáticamente el código mediante integración continua.

---

# Descripción

Este proyecto consiste en el desarrollo de un sistema web para registrar, consultar y administrar solicitudes de servicio interno.

La aplicación permite centralizar la información de los requerimientos y facilitar su seguimiento mediante una interfaz sencilla para los usuarios y administradores.

El proyecto fue desarrollado como parte de la materia **Taller de Productividad Basado en Herramientas Tecnológicas** de la Universidad Tecmilenio.

El proyecto fue diseñado para implementarse utilizando Java y está preparado para evolucionar hacia una arquitectura basada en Spring Boot y MySQL en futuras versiones.

---

# Problema identificado

Actualmente las solicitudes internas se administran mediante diferentes herramientas como:

- Correos electrónicos.
- Archivos de Microsoft Excel.
- Comunicación entre departamentos.

Esta situación provoca diversos problemas:

- Duplicidad de información.
- Pérdida de solicitudes.
- Falta de seguimiento.
- Dificultad para identificar responsables.
- Ausencia de historial de cambios.
- Retrasos en la atención de requerimientos.

---

# Solución

La solución consiste en una aplicación web que permite:

- Registrar solicitudes.
- Consultar solicitudes existentes.
- Asignar responsables.
- Actualizar el estado de cada solicitud.
- Mantener un historial de cambios.
- Centralizar toda la información en una base de datos.
- Validar automáticamente el código mediante GitHub Actions y pruebas JUnit.

---

# Arquitectura

La arquitectura del sistema está dividida en cuatro componentes principales.

```
Usuario

↓

Interfaz Web
HTML
CSS
Bootstrap

↓

Servidor Web
Apache Tomcat

↓

Servidor de Aplicación
Java
Spring Boot

↓

Base de datos
MySQL
```

Herramientas utilizadas:

- GitHub
- GitHub Actions
- Maven
- JUnit

---

# Tabla de Contenidos

- [Resumen Ejecutivo](#resumen-ejecutivo)
- [Descripción](#descripción)
- [Problema identificado](#problema-identificado)
- [Solución](#solución)
- [Arquitectura](#arquitectura)
- [Requerimientos](#requerimientos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Uso](#uso)
- [Manual de Usuario](#manual-de-usuario)
- [Manual de Administrador](#manual-de-administrador)
- [Contribución](#contribución)
- [Roadmap](#roadmap)
- [Video de demostración](#video-de-demostración)
- [Producto](#producto)

---

# Requerimientos

## Hardware

- Procesador Intel Core i5 o superior.
- 8 GB de memoria RAM.
- 5 GB de espacio disponible en disco.

## Software

- Java JDK 17
- Apache Maven 3.9 o superior
- Git
- GitHub
- IntelliJ IDEA Community

## Servidores

Servidor Web

- Apache Tomcat Embedded

## Dependencias

- Hibernate
- Maven
- JUnit 5

---

# Instalación

## Clonar el repositorio

```bash
git clone https://github.com/CarlosGarcia1016/service-request-tracking-system.git
```

Entrar al proyecto

```bash
cd service-request-tracking-system
```

Instalar dependencias

```bash
mvn clean install
```

Ejecutar la aplicación

```bash
mvn spring-boot:run
```

Abrir el navegador

```
http://localhost:8080
```

---

## Pruebas Manuales

1. Registrar una nueva solicitud.
2. Consultar la lista de solicitudes.
3. Cambiar el estado de una solicitud.
4. Verificar que la información permanezca almacenada.

## Pruebas Automatizadas

Ejecutar:

```bash
mvn test
```

GitHub Actions ejecutará automáticamente las pruebas al realizar un Push o Pull Request.

---

## Implementación

### Ambiente Local

Compilar:

```bash
mvn clean package
```

Se generará el archivo:

```
service-request-tracking-system.jar
```

Ejecutar:

```bash
java -jar service-request-tracking-system.jar
```

### Implementación en la nube

El proyecto puede implementarse en plataformas como:

- Railway
- Render
- Heroku

Conectando el repositorio de GitHub y configurando las variables de entorno correspondientes.

---

# Configuración

El archivo principal de configuración es:

```
application.properties
```

Configuración de ejemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/service_requests

spring.datasource.username=root

spring.datasource.password=********

spring.jpa.hibernate.ddl-auto=update
```

---

# Uso

## Usuario Final

El usuario puede:

- Registrar solicitudes.
- Consultar solicitudes.
- Actualizar estados.
- Buscar solicitudes.
- Consultar historial.

---

# Manual de Usuario

1. Iniciar sesión.
2. Seleccionar **Nueva Solicitud**.
3. Capturar:

- Título.
- Descripción.
- Categoría.
- Prioridad.

4. Guardar la información.
5. Consultar las solicitudes registradas.
6. Actualizar el estado cuando sea necesario.

---

# Manual de Administrador

El administrador tiene permisos para:

- Administrar usuarios.
- Asignar responsables.
- Gestionar prioridades.
- Consultar historial completo.
- Supervisar todas las solicitudes.
- Configurar el sistema.

---

# Contribución

Para contribuir al proyecto:

## 1. Clonar el repositorio

```bash
git clone https://github.com/CarlosGarcia1016/service-request-tracking-system.git
```

## 2. Crear un nuevo branch

```bash
git checkout -b feature/nueva-funcionalidad
```

## 3. Realizar los cambios

Guardar los archivos modificados.

## 4. Commit

```bash
git add .

git commit -m "Descripción de los cambios"
```

## 5. Push

```bash
git push origin feature/nueva-funcionalidad
```

## 6. Crear un Pull Request

Crear un Pull Request hacia el branch **develop**.

## 7. Esperar revisión

Esperar la aprobación del código.

## 8. Merge

Realizar el Merge una vez aprobado el Pull Request.

---

# Roadmap

## Versión 2

- Notificaciones automáticas por correo.
- Exportación a Excel.
- Exportación a PDF.

## Versión 3

- Dashboard con indicadores.
- Reportes avanzados.
- API REST.

## Versión 4

- Aplicación móvil.
- Integración con Microsoft Teams.
- Inteligencia Artificial para clasificación automática de solicitudes.

---

# Video de demostración

Enlace al video:

**(Agregar aquí el enlace de YouTube, Google Drive o OneDrive)**

El video incluye:

- Descripción del proyecto.
- Arquitectura.
- README.
- GitHub.
- Issues.
- Pull Requests.
- Branches.
- GitHub Actions.
- Pruebas JUnit.
- Funcionamiento del sistema.

---

# Producto

Repositorio GitHub:

https://github.com/CarlosGarcia1016/service-request-tracking-system

```
service-request-tracking-system.jar
```

---

# Tecnologías utilizadas

- Java 17
- Maven
- Git
- GitHub
- GitHub Actions
- JUnit

---

# Licencia

Este proyecto fue desarrollado con fines académicos para la Universidad Tecmilenio.
