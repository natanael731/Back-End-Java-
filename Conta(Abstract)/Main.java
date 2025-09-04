public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente("001", "1234", "João Silva", 1000.0);
        Conta cp = new Poupanca("002", "1234", "Maria Souza", 2000.0);
        Conta pj = new ContaJuridica("003", "1234", "Empresa XYZ", 5000.0);


        cc.depositar(500);
        cc.sacar(200);
        cc.exibirSaldo();
        System.out.println("Tarifa Mensal CC: R$" + cc.calcularTarifaMensal());

        System.out.println();

        cp.depositar(300);
        cp.sacar(100);
        cp.exibirSaldo();
        System.out.println("Tarifa Mensal CP: R$" + cp.calcularTarifaMensal());

        System.out.println();

        pj.depositar(1000);
        pj.sacar(500);
        pj.exibirSaldo();
        System.out.println("Tarifa Mensal PJ: R$" + pj.calcularTarifaMensal());
    }
}
