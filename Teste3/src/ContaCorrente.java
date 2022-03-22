public class ContaCorrente extends Conta{

    @Override
    public void rendimentos(double valorRendimento) {

        System.out.println("rendimento conta corrente: " + (super.rendimento(0.03)));
    }
}
