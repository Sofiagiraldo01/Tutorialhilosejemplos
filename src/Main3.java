public class Main3 {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new ContadorHilo2(), "Hilo 1");
        Thread hilo2 = new Thread(new ContadorHilo2(), "Hilo 2");
        Thread hilo3 = new Thread(new ContadorHilo2(), "Hilo 3");

        // Asignamos diferentes prioridades
        hilo1.setPriority(Thread.MIN_PRIORITY);  // Prioridad mínima
        hilo2.setPriority(Thread.NORM_PRIORITY); // Prioridad normal
        hilo3.setPriority(Thread.MAX_PRIORITY);  // Prioridad máxima

        // Iniciamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
