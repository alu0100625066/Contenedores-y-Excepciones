## Contenedores y Excepciones
Realización de la práctica 3 de la asignatura de Programación de Aplicaciones Interactivas, en la que usaremos contenedores y 
excepciones.

### * Ejercicio 1: la clase Serpiente
Diseñar una nueva clase llamada Serpiente con un atributo **numSerpientes** de tipo entero que se inicialice en el constructor.
Incorporarle un metodo **reptar()** que imprima que número de Serpiente está reptando. Crear un ArrayList y añadir una serie de 
objetos Serpientes a la lista. A continuación, usar el metodo **get()** para recorrer la lista e invocar a reptar() para cada 
Serpiente

### *  Ejercicio 2: Modificar clase Serpiente
Modificar el Ejercicio 1 de modo que se utilice un **Iterator** para recorrer la lista, mientras se invoca a **reptar()**.

### * Ejercicio 3: Mapas
Tomar la clase Serpiente del Ejercicio 1 y ponerla en un *Mapa*, asociando el nombre de la Serpiente como una *String (la clave)* 
con cada *Serpiente (el valor)* que se introduzca en la tabla. Conseguir un iterador para el **keySet()** y utilizarlo para recorrer 
el *Mapa*, buscando la Serpiente para cada clave, imprimiendo la clave y ordenando a la Serpiente reptar().

### * Ejercicio 4
Escriba una aplicacion que cuente el número de ocurrencias de cada palabra dentro de un fichero de texto. El nombre del fichero 
de texto debera ser pasado como parámetro en la línea de comandos. Las palabras estaran delimitadas por espacios, signos de 
puntuación **( ´ , ; : . ?)**, comillas **"** y parentesis. Las palabras se contabilizarán sin atender a si estan escritas en 
mayúsculas o minúsculas (la palabra **Bueno** se considerara igual que **buENo**). No se contabilizara una palabra si su primer 
caracter no es una letra. Muestre la salida en orden alfabético de palabras con cada palabra precedida por su contador de ocurrencias.
El programa **Contador.class**, disponible en el aula virtual de la asignatura, tiene el comportamiento que se propone.

### * Ejercicio 5: Excepciones
El siguiente programa **Log1.java**:
```
class Log1 {
  public s t a t i c void main ( String args [ ] ) {
    double aDouble = Double . parseDouble ( args [ 0 ] ) ;
    System . out . println ( Math . log ( aDouble ) ) ;
  }
}
```
toma un numero como parámetro, y como salida muestra el logaritmo de dicho número. Sin embargo, en ningún momento comprueba si se 
ha proporcionado algún parametro, ni si ese parámetro es un número. Se pide: 
* Compilar el programa y ejecutadlo de tres formas distintas:
  
a) Sin parametros
  *java Log1*

b) Poniendo un parametro no numérico
  *java Log1 pepe*

c) Poniendo un parametro numérico
  *java Log1 30*

Anote las excepciones que se lanzan en cada caso (si se lanzan)
* Modificar el codigo de main para que capture las excepciones producidas y muestre los errores correspondientes en cada caso:
Para comprobar si no hay parametros se capturará una excepción de tipo *ArrayIndexOutOfBoundsException* (para ver si el array de 
*String* que se pasa en el *main* tiene algun elemento). Para comprobar si el parametro es numérico, se capturara una excepción 
de tipo *NumberFormatException*. Así, tendremos en el *main* algo como:
```
try {
// Tomar parametro y asignarlo a un double
} catch ( ArrayIndexOutOfBoundsException e1 ) {
// Codigo a realizar si no hay parametros
} catch ( NumberFormatException e2 ) {
// Codigo a realizar con parametro no numerico
}
```
Pruebe de nuevo el programa igual que en el caso anterior comprobando que las excepciones son capturadas y tratadas.
Pretendemos trabajar ahora con las excepciones del metodo **Math.log** y no con las del *main*. Escriba un nuevo programa 
**Log2.java** similar al anterior, de modo que en la función que calcula el logaritmo se compruebe si el valor introducido es menor 
o igual que 0, ya que para estos valores la funcion logaritmo no está definida. Se pide: 
1. Buscar entre las excepciones de Java la mas adecuada para lanzar en este caso, que indique que a un metodo se le ha pasado un 
argumento ilegal. **(Pista: Buscar entre las clases derivadas de *Exception*. En este caso la mas adecuada se encuentra entre las derivadas de *RuntimeException*)**.

2. Una vez elegida la excepcion adecuada, añadir código (en el método logaritmo) para que en el caso de haber introducido un parametro
incorrecto se lance dicha excepción. 
```
throw new . . . // excepcion elegida
```
Probar el programa para comprobar el efecto que tiene el lanzamiento de la excepcion.

3. Al no ser una excepcion del tipo checked no hará falta que la capturemos ni que declaremos que puede ser lanzada. Vamos a crear
nuestro propio tipo de excepcion derivada de *Exception* (de tipo *checked*) para ser lanzada en caso de introducir un valor no valido 
como parámetro. La excepción se llamará *WrongParameterException* y tendra la siguiente forma: 
```
public class WrongParameterException extends Exception {
  public WrongParameterException ( String msg ) {
    super( msg ) ;
  }
}
```
Deberemos lanzarla en lugar de la escogida en el punto anterior.
```
throw new WrongParameterException ( . . . ) ;
```
Intentar compilar el programa y observar los errores que aparecen. ¿Por que ocurre esto? Añadir los elementos necesarios al código 
para que compile y probarlo.

4. Por el momento controlamos que no se pase un numero negativo como entrada. ¿Pero que ocurre si la entrada no es un número válido?
En ese caso se producirá una excepción al convertir el valor de entrada y esa excepción se propagara automágicamente al nivel 
superior. Ya que tenemos una excepción que indica cuando el parametro de entrada de nuestra función es incorrecto, sería conveniente
que siempre que esto ocurra se lance dicha excepción, independientemente de si ha sido causada por un número negativo o por algo que
no es un número, pero siempre conservando la información sobre la causa que produjo el error. Utilizar excepciones anidadas para
realizar esto. **Ayuda: Deberemos anadir un nuevo constructor a *WrongParameterException* en el que se proporcione la excepción que causo el error. En la función logaritmo capturaremos cualquier excepción que se produzca al convertir la cadena a número, y lanzaremos una excepción *WrongParameterException* que incluya la excepcion causante.** 
