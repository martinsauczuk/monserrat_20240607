package cuentas;

public class CuentasTest {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();
        cuenta1.depositar(1000);
        System.out.printf("Tu saldo es: %d %n", cuenta1.getSaldo());

        try {
            cuenta1.extraer(-1500);
        } catch (CuentaException e) {
            System.out.println("La cuenta dice que:" + e.getMessage());
        }


        System.out.printf("Tu saldo es: %d %n", cuenta1.getSaldo());
    }
}