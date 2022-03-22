public class main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(123);
        cc.setTitular("Douglas");
        cc.setSaldo(1000);
        cc.rendimentos(1000);


        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(321);
        cp.setTitular("Shiro");
        cc.setSaldo(1320);
        cp.rendimentos(1320);

        cc.mostrarTela();
        cp.mostrarTela();







    }
}
