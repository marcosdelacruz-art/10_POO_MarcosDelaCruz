# Agenda de Contactos MVC

## Descripción
Aplicación de consola desarrollada en Java aplicando el patrón de arquitectura **Modelo-Vista-Controlador (MVC)**. Este proyecto evoluciona la solución inicial para gestionar contactos en memoria utilizando la colección `ArrayList`.

## Funcionalidades
- **1. Registrar contacto:** Permite agregar un nuevo contacto especificando ID, nombres, apellidos, dirección, teléfono y correo.
- **2. Listar contactos:** Visualiza en consola la lista completa de contactos almacenados.
- **3. Buscar contacto:** Búsqueda dinámica filtrando por nombre o apellido.
- **4. Eliminar contacto:** Permite remover contactos indicando su ID único.
- **5. Salir:** Finaliza la ejecución del programa.

## Arquitectura del Proyecto (MVC)
- `vallegrande.edu.pe.model`: Clase `Contacto` (atributos, constructor, getters, setters).
- `vallegrande.edu.pe.controller`: Clase `AgendaController` (gestión del `ArrayList`, lógica de búsqueda y eliminación).
- `vallegrande.edu.pe.view`: Clase `AgendaView` (menú de consola e interacción con `Scanner`).
- `vallegrande.edu.pe.app`: Clase `Main` (método principal, carga de 5 contactos de muestra y ejecución).

## Carga Mínima de Pruebas
El sistema cuenta con **5 contactos precargados** desde el inicio para probar de inmediato las operaciones de búsqueda y eliminación.

## Integrantes
- [Marcos De la Cruz Peláez]