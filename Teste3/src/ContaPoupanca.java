public class ContaPoupanca extends Conta{

    @Override
    public void rendimentos(double valorRendimento) {

        System.out.println("rendimento conta poupanca: "(super.rendimento(0.05)));
    }
}
