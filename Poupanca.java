public class Poupanca extends Conta {

    public Poupanca(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public double calcularTarifaMensal() {
        return 0.0;
    }
}
