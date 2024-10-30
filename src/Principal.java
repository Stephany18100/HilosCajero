import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Principal {
    private static Principal instance;
    private Thread bancaThread;
    private Thread practicajaThread;
    private Cuenta cuenta;
    private final BlockingQueue<Runnable> practicajaQueue = new LinkedBlockingQueue<>();
    private final BlockingQueue<Runnable> BancaQueue = new LinkedBlockingQueue<>();
    
    private Principal() {
        cuenta = new Cuenta();  // Inicializamos la cuenta aquí
    }

    public static Principal getInstance() {
        if (instance == null) {
            instance = new Principal();
        }
        return instance;
    }

    public void startBancaThread() {
        bancaThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    // Esperar y tomar la siguiente tarea de la cola
                    Runnable task = BancaQueue.take();
                    task.run(); // Ejecutar la tarea
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "hilo banca 2");
        bancaThread.start();
    }

    public void startPracticajaThread() {
        practicajaThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    // Esperar y tomar la siguiente tarea de la cola
                    Runnable task = practicajaQueue.take();
                    task.run(); // Ejecutar la tarea
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "hilo practicaja 1");
        practicajaThread.start();
    }
    
    public void executeInPracticaja(Runnable task) {
        practicajaQueue.add(task);
    }
    
    public void executeInBanca(Runnable task) {
        BancaQueue.add(task);
    }

    public boolean isBancaThreadAlive() {
        return bancaThread != null && bancaThread.isAlive();
    }

    public boolean isPracticajaThreadAlive() {
        return practicajaThread != null && practicajaThread.isAlive();
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
}
