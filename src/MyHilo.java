public class MyHilo extends Thread{
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(i + " - ESCOBA NUEVA: " + Thread.currentThread().getName());
            System.out.println(i + " - Desarrollo Cerdas escoba: " + Thread.currentThread().getName());
            System.out.println(i + " - Unir Cerdas escobas: " + Thread.currentThread().getName());
            System.out.println(i + " - Amarrar Cerdas escobas: " + Thread.currentThread().getName());
            System.out.println(i + " - Cortar madera: " + Thread.currentThread().getName());
            System.out.println(i + " - Pegar Cerdas escobas al pedazo de madera: " + Thread.currentThread().getName());
            System.out.println(i + " - Parte de las Cerdas completa: " + Thread.currentThread().getName());
            System.out.println(i + " - Cortar pedazo de madera para el palo: " + Thread.currentThread().getName());
            System.out.println(i + " - Hacer el diseño del palo en la madera: " + Thread.currentThread().getName());
            System.out.println(i + " - Palo listo: " + Thread.currentThread().getName());
            System.out.println(i + " - Unir el palo a la parte de las celdas: " + Thread.currentThread().getName());
            System.out.println(i + " - Escoba listo: " + Thread.currentThread().getName());

            try {
                Thread.sleep(5000); // El hilo duerme por 1 segundo
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
