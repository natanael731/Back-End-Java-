public class ContaJuridica extends Conta {

    public ContaJuridica(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 1.50;
        double valorTotal = valor + taxa;

        if (valorTotal > 0 && valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque de R$" + valor + " + taxa de R$1,50 realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return 20.0;
    }
}
