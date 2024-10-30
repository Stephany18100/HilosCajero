public class Cuenta {
    private double saldo = 20000;
    private double ahorro = 0;

    public synchronized double getSaldo() {
        return saldo;
    }

    public synchronized double getSaldoTotal() {
        return saldo + ahorro;
    }

    public synchronized double getAhorro() {
        return ahorro;
    }

    public synchronized void agregarAhorro(String origen, double cantidad) {
        ahorro += cantidad;
        System.out.println(origen + " agregó a ahorro: " + cantidad + ". Ahorro actual: " + ahorro);
    }

    public synchronized void retirar(String origen, double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            //System.out.println(origen + " retiró: " + cantidad + ". Saldo actual: " + saldo);
        } else {
            //System.out.println(origen + " no pudo retirar: " + cantidad + ". Saldo insuficiente.");
        }
    }

    public synchronized void depositar(String origen, double cantidad) {
        saldo += cantidad;
        System.out.println(origen + " depositó: " + cantidad + ". Saldo actual: " + saldo);
    }
}
