package ap2;

public class Main {
    public static void main(String[] args) {

        // 1. Criar o banco
        Banco banco = new Banco("Banco Ulbra");

        // 2. Criar uma conta de cada tipo
        Conta conta = new Conta(101, "Maria");
        ContaPoupanca poupanca = new ContaPoupanca(102, "Ana", 0.05);
        ContaCorrente corrente = new ContaCorrente(103, "Carlos", 500);

        // 3. Adicionar as contas ao banco
        banco.adicionarConta(conta);
        banco.adicionarConta(poupanca);
        banco.adicionarConta(corrente);

        // 4. Fazer depósitos e saques
        conta.depositar(500);
        conta.sacar(200);

        poupanca.depositar(200);

        corrente.depositar(100);

        // 5. Saque com saldo insuficiente
        System.out.println("----- SAQUE SEM SALDO -----");
        boolean saqueInvalido = conta.sacar(1000);
        System.out.println("Saque realizado: " + saqueInvalido);

        // 6. Aplicar rendimento na poupança
        System.out.println("----- RENDIMENTO POUPANÇA -----");
        System.out.println("Antes:");
        poupanca.exibir();

        poupanca.aplicarRendimento();

        System.out.println("Depois:");
        poupanca.exibir();

        // 7. Sacar utilizando o limite da conta corrente
        System.out.println("----- SAQUE COM LIMITE -----");
        boolean saqueLimite = corrente.sacarComLimite(400);
        System.out.println("Saque realizado: " + saqueLimite);
        corrente.exibir();

        // 8. Listar todas as contas e mostrar saldo total
        System.out.println("----- TODAS AS CONTAS -----");
        banco.listarContas();

        System.out.println("----- SALDO TOTAL DO BANCO -----");
        System.out.println("R$ " + banco.saldoTotal());
    }
}


