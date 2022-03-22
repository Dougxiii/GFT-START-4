public class main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(123);
        cc.setTitular("Douglas");
        cc.rendimentos(1000);


        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(321);
        cp.setTitular("Shiro");
        cp.rendimentos(1320);

        cc.mostrarTela();
        cp.mostrarTela();
        cc.rendimento();
        cp.rendimentos();






    }
}
