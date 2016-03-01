## Contenedores y Excepciones
Realización de la práctica 3 de la asignatura de Programación de Aplicaciones Interactivas, en la que usaremos contenedores y 
excepciones.

* Ejercicio 1: la clase Serpiente
Diseñar una nueva clase llamada Serpiente con un atributo **numSerpientes** de tipo entero que se inicialice en el constructor.
Incorporarle un metodo **reptar()** que imprima que número de Serpiente está reptando. Crear un ArrayList y añadir una serie de objetos Serpientes a la lista. A continuación, usar el metodo **get()** para recorrer la lista e invocar a reptar() para cada Serpiente

*  Ejercicio 2: Modificar clase Serpiente
Modificar el Ejercicio 1 de modo que se utilice un **Iterator** para recorrer la lista, mientras se invoca a **reptar()**.

* Ejercicio 3: Mapas
Tomar la clase Serpiente del Ejercicio 1 y ponerla en un Mapa, asociando el nombre de la Serpiente como una String (la clave) 
con cada Serpiente (el valor) que se introduzca en la tabla. Conseguir un iterador para el keySet() y utilizarlo para recorrer 
el Mapa, buscando la Serpiente para cada clave, imprimiendo la clave y ordenando a la Serpiente reptar().

* Ejercicio 4
Escriba una aplicacion que cuente el n ´ umero de ocurrencias de cada palabra dentro ´
de un fichero de texto. El nombre del fichero de texto debera ser pasado como par ´ ametro ´
en la l´ınea de comandos. Las palabras estaran delimitadas por espacios, signos ´
de puntuacion ( ´ , ; : . ?), comillas " y parentesis. Las palabras se contabilizar ´ an´
sin atender a si estan escritas en may ´ usculas o min ´ usculas (la palabra ´ Bueno se
considerara igual que ´ buENo). No se contabilizara una palabra si su primer caracter ´
no es una letra. Muestre la salida en orden alfabetico de palabras con cada palabra ´
precedida por su contador de ocurrencias.
El programa Contador.class, disponible en el aula virtual de la asignatura, tiene el
comportamiento que se propone.
