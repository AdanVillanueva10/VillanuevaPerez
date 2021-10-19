# **Hilos en Java**
### La máquina virtual en Java (JVM), es un sistema multihilo, es decir es capaz de ejecutar varios hilos de ejecución, simultaneamente. 
### La JVM gestiona todos los detalles, asignación de tiempos de ejecución, prioridades, etc, de forma similar a como gestiona un Sistema Operativo multiples procesos.
### La diferencia básica entre un proceso de S.O y un **Thread**, es que los hilos corren dentro de la JVM, que es un proceso del S.O por lo tanto comparten todos los recursos.
### A este tipo de procesos donde se comparten los recursos se les llama a veces **Procesos Ligeros(lightweight)**.
### JAVA da soporte al concepto  de **Thread** desde el propio lenguaje, con algunas clases e interfaces definidas por el paquete **java.lang** y con métodos específicos para la manipulación de **Threads** en la clase **Object**.
### Desde el punto de vista de aplicaciones, los hilos son muy utiles porque permiten que el flujo del programa sea dividido en 2 o más partes, cada una ocupandose de alguna tarea de forma independiente. Todos los programas con interfaces gráficas(AWT o Swing) son multihilo porque los eventos y las rutinas de dibujado de las ventanas corren en un hilo distinto al principal.

## **La clase THREAD** 
### Para implementar hilos con la clase Thread, primero debemos crear una subclase de Thread, osea crear una clase que herede los elementos de la clase Thread, la subclase deberá definir su propio método run(), para sobreescribir el método run() de la clase Thread.
### Una instancia de la subclase es creada con new, luego llamamos al método start() de la thread para hacer que la JVM ejecute el método run(), para iniciar la concurrencia invocamos a start(), así invocamos a run() en forma indirecta. Si invocamos a run() directamente, se comportará como el llamado a cualquier método llamado dentro de un mismo hilo (sin crear uno independiente).

## **Interfaz RUNNABLE**
### La interface Runnable, propporciona un método alternativo a la utilización de la clase Thread, para los casos en los que no es posible hacer que la clase definida extienda la clase Thread, esto pasa cuando dicha clase que se desea ejecutar en un hilo independiente deba extender alguna otra clase. Dado que no existe la herencia multiple, la citada clase no puede extender a la vez la clase Thread y otra más. En este caso, la clase debe implementar la interface **Runnable**, variando ligeramente la forma en que se crean e inician los nuevos hilos.
### La interfaz Runnable requiere que sólo un método sea implementado, el método run(). Primero creamos una instancia de esta clase con new, luego creamos una instancia de Thread con otra sentencia new y usamos el objeto recién creado en el constructor. Finalmente, llamamos el método start() de la instancia de Thread para iniciar la tarea definida en el método run().
# **Métodos de úso común**: 
>## **1. void start()**: usado para iniciar el cuerpo de la thread definido por el método run().
>## **2. void sleep()**: pone a dormir una thread por un tiempo mínimo especificado.
>## **3. void join()**: usado para esperar por el término d ela thread sobre la cual el método es invocado, por ejemplo por término run().
>## **4. void yield()**: mueve a la thread desde el estado de corriendo al final de la cola de procesos en espera por la CPU.
## JAVA dejó obsoletos varios de estos métodos definidos en versiones previas (Java 1.0 y Kava 1.1), para prevenir inconsistencias de datos y deadlock, **se recomienda evitar hacer usó de estos métodos**:
>## **1. void stop()**: el cual detiene la ejecución de la thread no importando consideración alguna.
>## **2. void suspend()**: el cual para temporalmente la ejecución de una thread.
>## **3. void resume()**: reactiva una thread suspendida.