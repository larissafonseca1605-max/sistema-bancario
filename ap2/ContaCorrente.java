package ap2;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    public boolean sacarComLimite(double valor) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }
}
