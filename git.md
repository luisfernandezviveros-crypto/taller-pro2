
# Introducción a Git

## 1. ¿Qué es un repositorio en Git?
Un repositorio en Git es el espacio donde se almacenan los archivos de un proyecto junto con
el registro completo de todas las modificaciones realizadas a lo largo del tiempo.

---

## 2. ¿Cuáles son las áreas principales de Git?
Git maneja tres zonas fundamentales:
- El **working directory**, donde se crean y modifican los archivos.
- El **staging area**, donde se preparan los cambios que se desean guardar.
- El **repository**, donde se conservan los cambios confirmados mediante commits.

---

## 3. ¿Cómo representa Git los cambios internamente?
Git organiza la información usando distintos tipos de objetos. Algunos almacenan el contenido
de los archivos, otros la estructura de directorios y otros registran los cambios del proyecto.

---

## 4. ¿Cómo se crea un commit y qué información guarda?
Un commit se genera al confirmar los cambios con un mensaje descriptivo. Este almacena la
información de qué se modificó, quién realizó el cambio, la fecha y el estado previo del proyecto.

---

## 5. ¿Cuál es la diferencia entre git pull y git fetch?
`git fetch` obtiene los cambios del repositorio remoto sin aplicarlos al proyecto local.
`git pull`, en cambio, descarga los cambios y los fusiona automáticamente.

---

## 6. ¿Qué es un branch en Git?
Un branch es una rama que permite desarrollar nuevas funcionalidades sin alterar la versión
principal del proyecto. Git controla cada rama mediante referencias a commits específicos.

---

## 7. ¿Cómo se realiza un merge y qué problemas pueden surgir?
El merge se utiliza para combinar los cambios de distintas ramas. Pueden presentarse conflictos
cuando dos modificaciones afectan la misma parte de un archivo. Estos se solucionan revisando
los cambios y decidiendo cuáles mantener.

---

## 8. ¿Cómo funciona el área de staging?
El área de staging permite seleccionar los cambios que se incluirán en el próximo commit.
Si no se utiliza `git add`, dichos cambios no serán guardados.

---

## 9. ¿Qué es el archivo .gitignore?
El archivo `.gitignore` especifica qué archivos o carpetas deben ser ignorados por Git, como
archivos temporales o configuraciones locales que no deben subirse al repositorio.

---

## 10. ¿Cuál es la diferencia entre un commit amend y un nuevo commit?
El uso de `--amend` permite modificar el último commit, ya sea para corregir el mensaje o
agregar archivos faltantes. Un nuevo commit crea una entrada adicional en el historial.

---

## 11. ¿Cómo se usa git stash y para qué sirve?
`git stash` permite guardar cambios de forma temporal sin crear un commit, lo cual es útil
cuando se necesita cambiar de rama sin perder el trabajo actual.

---

## 12. ¿Qué opciones ofrece Git para deshacer cambios?
Git proporciona varias herramientas para deshacer cambios, como restaurar archivos,
revertir commits o regresar a versiones anteriores del proyecto.

---

## 13. ¿Cómo funcionan los repositorios remotos?
Un repositorio remoto es una copia del proyecto alojada en una plataforma externa. Generalmente
se denomina `origin` y se utiliza para enviar y recibir cambios del proyecto.

---

## 14. ¿Cómo se puede revisar el historial de cambios?
Git permite consultar el historial del proyecto, comparar versiones y analizar los detalles
de cada commit para comprender la evolución del código.
