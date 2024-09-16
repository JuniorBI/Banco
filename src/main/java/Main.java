public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupança();
        poupanca.depositar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
