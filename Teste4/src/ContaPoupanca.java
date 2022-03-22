public class ContaPoupanca extends Conta{

    @Override
    public void rendimentos(double valorRendimento) {

        System.out.println((super.rendimento(0.05)));
    }
}
