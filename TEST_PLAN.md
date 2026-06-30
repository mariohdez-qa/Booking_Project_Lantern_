# Plan de Pruebas Automatizadas - Booking 11 (Workday Recruiting)

Este es el documento centralizado del Plan de Pruebas para la suite automatizada de **Booking_Project_Lantern**. Cualquier miembro de la comunidad puede proponer cambios, añadir nuevos escenarios o modificar prioridades editando este archivo.

## 1. Objetivos del Proyecto
* Automatizar los flujos críticos del módulo de **Recruiting** en el entorno de pruebas **Booking 11** de Workday.
* Garantizar la estabilidad de la plataforma ante actualizaciones y configuraciones del sistema.
* Mantener un framework robusto, escalable y basado en buenas prácticas de QA (Page Object Model).

## 2. Tecnologías y Herramientas
* **Lenguaje:** Java 21 (JDK)
* **Framework de Automatización:** Selenium WebDriver (v4.21.0)
* **Motor de Pruebas:** JUnit 5
* **Gestor de Dependencias:** Maven
* **Control de Versiones:** GitHub

## 3. Matriz de Casos de Prueba (Test Cases)

A continuación se listan los escenarios de prueba planificados. Los colaboradores pueden marcar las casillas a medida que se automaticen.

### Suite de Autenticación (LoginSuite)
- [ ] **TC-001:** Inicio de sesión exitoso con credenciales válidas en Booking 11.
- [ ] **TC-002:** Intento de inicio de sesión fallido con contraseña incorrecta (Validar mensaje de error).
- [ ] **TC-003:** Cierre de sesión (Logout) y redirección correcta a la pantalla de acceso.

### Suite de Reclutamiento (RecruitingSuite)
- [ ] **TC-004:** Crear y publicar una nueva oferta de empleo (*Job Posting*).
- [ ] **TC-005:** Buscar un candidato existente por nombre en el *Dashboard*.
- [ ] **TC-006:** Avanzar a un candidato de la fase de *Review* a la fase de *Interview*.
- [ ] **TC-007:** Adjuntar un currículum (PDF) al perfil de un candidato simulado.

## 4. Guía para Colaboradores (¿Cómo añadir pruebas?)
Si quieres modificar este plan de pruebas o reportar que has automatizado un caso:
1. Haz un `Fork` o crea una nueva rama (`branch`) desde este repositorio.
2. Modifica este archivo cambiando el espacio `[ ]` por una `[x]` si el test ya está listo en el código.
3. Si vas a añadir un nuevo escenario, usa la nomenclatura `TC-XXX` siguiendo el orden cronológico.
4. Sube tus cambios mediante un **Pull Request**.