# Pruebas Unitarias en Spring Boot

Este proyecto tiene como objetivo practicar la implementación de pruebas unitarias con JUnit 5 y Mockito en una aplicación Spring Boot.

## Objetivo

Validar el correcto funcionamiento de la capa de servicio, simulando el repositorio con mocks para comprobar:

- la recuperación de datos mediante `findAll`
- la persistencia de nuevos registros mediante `create`
- la verificación de atributos y comportamiento esperado

## Tecnologías utilizadas

- Java 21
- Spring Boot 4.1.2
- Maven
- JUnit 5
- Mockito
- AssertJ

## Estructura del proyecto

- `src/main/java` : código de la aplicación
- `src/test/java` : pruebas unitarias
- `Evidencia_captura/` : capturas de la ejecución de pruebas

## Ejecutar las pruebas

Desde la raíz del proyecto, ejecutar:

```bash
mvn test
```

## Evidencia

La evidencia visual de la ejecución exitosa de las pruebas se encuentra en la carpeta:

```text
Evidencia_captura/
```

Allí se puede revisar la captura de la consola con el resultado de la ejecución de `mvn test`.

## Resultado esperado

La suite de pruebas debe ejecutarse correctamente y mostrar un reporte limpio con:

- `Tests run: 3`
- `Failures: 0`
- `Errors: 0`
- `BUILD SUCCESS`
