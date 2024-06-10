package cuentas;

public class Cuenta {

    private int saldo = 0;

    public void depositar(int monto) {
        this.saldo = this.saldo + monto;
    }

    public void extraer(int monto) throws CuentaException{

        if (monto < 0 ) {
            throw new CuentaException("El monto no puede ser negativo");
        }

        if ( monto <= saldo ) {
            this.saldo = this.saldo - monto;
        } else {
            throw new CuentaException("Te quedarias en negativo");
        }

    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}