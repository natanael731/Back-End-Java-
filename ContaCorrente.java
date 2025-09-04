public class ContaCorrente extends Conta {

    public ContaCorrente(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public double calcularTarifaMensal() {
        return 12.0;
    }
}
