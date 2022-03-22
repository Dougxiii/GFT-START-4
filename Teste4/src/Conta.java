public abstract class Conta {

    //atributos

    private int numero;
    private String titular;
    private double saldo;

    // Getters and Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodos

    public Double rendimento(Double valorRendimento){
        return this.saldo*=valorRendimento;
    }

    public void mostrarTela(){
        System.out.println("-------------");
        System.out.println("Nome: " + this.getTitular());
        System.out.println("Numero: "+ this.getNumero());

    }
}
