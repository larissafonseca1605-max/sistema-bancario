package ap2;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double taxaRendimento) {
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo = saldo + (saldo * taxaRendimento);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
}
