# Palíndromo Cheker en Java
Este pequeño java verifica si una palabra es palíndromo. Un palíndromo es una secuencia de caractéres que se lee igual hacia adelante y hacia atrás.
## Contenido
-Un java en el que está el método.
-Un java en el que se encuentran los tests.
-Una carpeta en la que hemos creado excepciones para los casos extremos
## Excepciones
-LowNumberException: Caso en el que la palabra tenga menos de 2 caracteres.
-DigitException: Caso en el que introduces un número.

# 📚 Documentación
Al principio el .java que recibimos parecía funcionar bien. Tras varios test iniciales nos percatamos que teniamos varias cosas que cambiar. Para empezar hicimos unos test de True y False que funcionaban correctamente.
Tras ello se nos ocurrio que el siguiente test sería en caso en el que el String esté vacío. Para ello creamos una excepcion que tambíen usamos para cuando te escribe una palabra de una letra, la excepción es la LowNumberException.
El siguiente caso que hicimos fue en el que si escribes un número. Un palíndromo es una palabra por lo que no puede incluir números. Para ello creamos otra excepción, llamada DigitException, y para usarla tuvimos que añadir un for en el método que verifica si es palíndromo.
