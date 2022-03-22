public class ContaCorrente extends Conta{

    @Override
    public void rendimentos(double valorRendimento) {

        System.out.println((super.rendimento(0.03)));
    }
}
