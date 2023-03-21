Testeo de interfaces con Java.

Este código es una implementación básica de una calculadora en Java utilizando la interfaz gráfica de usuario (GUI) de Java Swing.

La clase Calculadora extiende la clase JFrame y también implementa la interfaz ActionListener. La clase JFrame proporciona una ventana en blanco que se puede personalizar para incluir diferentes elementos de la interfaz gráfica de usuario. La interfaz ActionListener se utiliza para detectar cuándo se hace clic en un botón.

La calculadora tiene una pantalla donde se muestra el número y las operaciones que se van realizando, y tiene botones numéricos y de operaciones.

El método actionPerformed se encarga de manejar los eventos de acción, que se producen cuando se hace clic en un botón. El método realiza diferentes acciones según el botón que se haya presionado.

Los números y operadores se almacenan en variables y se realizan cálculos utilizando estas variables. Por ejemplo, cuando se hace clic en el botón +, el número en la pantalla se guarda en la variable numero1 y se borra la pantalla para permitir que el usuario introduzca un segundo número. Luego, cuando se hace clic en el botón =, se guarda el segundo número en la variable numero2 y se realiza la operación adecuada en función del operador seleccionado, que se almacena en la variable operador. El resultado se muestra en la pantalla.

En resumen, este código implementa una calculadora básica con una interfaz gráfica de usuario utilizando la biblioteca Swing de Java.


![Captura de pantalla de cómo se ve la interfaz de la calculadora hecha con Java](https://i.imgur.com/cTCela2.png)
