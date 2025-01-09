# bk_openedugo

## Tabla de contenido
1. [Descripción](#descripción)
2. [Estructura del proyecto](#estructura-del-proyecto)
3. [Requisitos previos](#requisitos-previos)
4. [Instalación](#instalación)
   - [Windows](#windows)
   - [Linux](#linux)
5. [Recursos y documentación](#recursos-y-documentación)

---

## Descripción

**bk_openedugo** es un sistema de seguimiento de notas diseñado bajo una arquitectura de microservicios (microlito). Este proyecto incluye los siguientes componentes principales:

- **Backend**: Desarrollado en Java utilizando JDK 17 y Spring Boot, encargado de gestionar la lógica de negocio y las operaciones relacionadas con las notas.
- **Pruebas**: Implementadas con **Mockito**, asegurando la calidad y el correcto funcionamiento de los servicios RESTful.
- **Base de datos**: Gestionada con **MySQL**, utilizando contenedores Docker para simplificar su configuración y despliegue.

---

## Estructura del proyecto

```plaintext
bk_openedugo/
├── backend/
│   ├── src/
│   ├── pom.xml
│   └── README.md
├── pruebas/
│   ├── test/
│   ├── mockito/
│   └── README.md
└── docker/
    ├── docker-compose.yml
    ├── mysql/
    │   ├── init.sql
    │   └── Dockerfile
```

---

## Requisitos previos

Antes de comenzar, asegúrate de tener instaladas las siguientes herramientas:

- **Java JDK 17**: Para compilar y ejecutar el backend.
- **Docker**: Para gestionar los contenedores de MySQL.
- **MySQL**: Para trabajar con la base de datos local si no se usa Docker.
- **IDEs**:
  - Para backend: NetBeans, IntelliJ IDEA o Visual Studio Code.
  - Para base de datos: MySQL Workbench o DBeaver.

---

## Instalación

### Windows

1. **Instalar Java JDK 17**:
   - Descarga desde la [página oficial de Oracle](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
   - Sigue las instrucciones del instalador y configura la variable de entorno `JAVA_HOME`.

2. **Instalar Docker Desktop**:
   - Descarga desde la [página oficial de Docker](https://www.docker.com/products/docker-desktop/).
   - Sigue las instrucciones del instalador.

3. **Configurar MySQL en Docker**:
   - Ejecuta los siguientes comandos en tu terminal:
     ```bash
     docker pull mysql:8.0
     docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=admin -d -p 3306:3306 mysql:8.0
     ```

4. **Instalar IDEs y herramientas de base de datos**:
   - Descarga e instala **IntelliJ IDEA**, **NetBeans** o **Visual Studio Code** desde sus sitios oficiales.
   - Para la base de datos, instala **MySQL Workbench** o **DBeaver**.

### Linux

1. **Instalar Java JDK 17**:
   - En distribuciones basadas en Debian/Ubuntu:
     ```bash
     sudo apt update
     sudo apt install openjdk-17-jdk
     ```
   - En distribuciones basadas en CentOS/Fedora:
     ```bash
     sudo yum install java-17-openjdk
     ```

2. **Instalar Docker**:
   - Sigue las instrucciones oficiales para tu distribución en [Docker Docs](https://docs.docker.com/engine/install/).

3. **Configurar MySQL en Docker**:
   - Ejecuta los siguientes comandos en tu terminal:
     ```bash
     docker pull mysql:8.0
     docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=admin -d -p 3306:3306 mysql:8.0
     ```

4. **Instalar IDEs y herramientas de base de datos**:
   - Instala **IntelliJ IDEA**, **NetBeans** o **Visual Studio Code** desde sus repositorios oficiales.
   - Para la base de datos, instala **MySQL Workbench** o **DBeaver**.

---

## Recursos y documentación

- [Documentación de JDK 17](https://docs.oracle.com/en/java/javase/17/)
- [Documentación de Spring Boot](https://spring.io/projects/spring-boot)
- [Guía de Mockito](https://site.mockito.org/)
- [Documentación de Docker](https://docs.docker.com/)
- [Documentación de MySQL](https://dev.mysql.com/doc/)
- [Documentación de IntelliJ IDEA](https://www.jetbrains.com/idea/documentation/)
- [Documentación de Visual Studio Code](https://code.visualstudio.com/docs/)
- [Documentación de NetBeans](https://netbeans.apache.org/kb/index.html)
- [Documentación de MySQL Workbench](https://dev.mysql.com/doc/workbench/en/)
- [Documentación de DBeaver](https://dbeaver.io/documentation/)

---
