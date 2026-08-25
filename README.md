# Desarrollo de una API REST para gestión de productos

La empresa necesita una API REST para gestionar productos en su plataforma de comercio electrónico. La API debe permitir la creación, lectura, actualización y eliminación de productos, así como la consulta de productos por categoría. Los productos tienen atributos como nombre, precio, stock y categoría. La API debe garantizar que no se permitan precios negativos ni nombres duplicados. Además, debe manejar adecuadamente los errores y proporcionar documentación OpenAPI.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición y modelado de la API

**Objetivo:** Definir y modelar la estructura de la API REST, incluyendo los endpoints y los atributos de los productos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los endpoints necesarios para la gestión de productos (crear, leer, actualizar, eliminar, consultar por categoría).
- Definir los atributos de los productos (nombre, precio, stock, categoría) y sus restricciones (precio positivo, nombre único).

**Entregable:** Diagrama de la API REST con los endpoints y atributos de los productos, incluyendo las restricciones.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las mejores prácticas para el diseño de APIs REST.
- Piensa en cómo garantizar la unicidad del nombre y la positividad del precio.

</details>

### Fase 2: Implementación de la API REST

**Objetivo:** Implementar los endpoints de la API REST, asegurando que se cumplan las restricciones definidas en la fase anterior.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Implementar los endpoints para crear, leer, actualizar y eliminar productos.
- Asegurar que la creación y actualización de productos respeten las restricciones de precio positivo y nombre único.
- Implementar la consulta de productos por categoría.

**Entregable:** API REST funcional con los endpoints implementados y las restricciones aplicadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar los errores de validación.
- Piensa en cómo estructurar la base de datos para garantizar la unicidad del nombre y la positividad del precio.

</details>

### Fase 3: Documentación OpenAPI

**Objetivo:** Documentar la API REST utilizando OpenAPI, proporcionando una descripción clara y detallada de los endpoints y sus parámetros.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Generar la documentación OpenAPI para la API REST.
- Asegurar que la documentación incluya una descripción clara y detallada de cada endpoint, sus parámetros y posibles respuestas.

**Entregable:** Documentación OpenAPI de la API REST.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo hacer que la documentación sea clara y fácil de entender para los usuarios de la API.
- Piensa en cómo describir los posibles errores y respuestas de la API.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una API REST y cuáles son sus características principales?
- **paraQueSirve**: ¿Para qué sirve la API REST en el contexto de la gestión de productos?
- **comoSeUsa**: ¿Cómo se utilizan los endpoints de la API REST para gestionar productos?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al implementar una API REST y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones de diseño implica la implementación de una API REST para garantizar la unicidad del nombre y la positividad del precio?

## Criterios de Evaluacion

- Definición y modelado correcto de la API REST.
- Implementación funcional de los endpoints con las restricciones aplicadas.
- Documentación clara y detallada de la API REST utilizando OpenAPI.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
