package ejercicio6_css_hilos;


public class ContadorThread extends Thread {

    private Runnable onCompletion;

    public void setOnCompletion(Runnable onCompletion) {
        this.onCompletion = onCompletion;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            if (onCompletion != null) {
                onCompletion.run();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
