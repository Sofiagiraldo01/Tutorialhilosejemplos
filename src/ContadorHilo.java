public class ContadorHilo extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                // Pausa de 1 segundo entre cada número
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido: " + e.getMessage());
            }
        }
    }
}
