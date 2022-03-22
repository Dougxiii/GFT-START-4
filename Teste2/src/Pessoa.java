public class Pessoa {

    // Atributos

    private String nome;
    private String endereco;
    private int telefone;

    // Metodos especiais

    // Construtor
    public Pessoa(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void imprimir(){
        System.out.println("-------------------------\n");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: "+ this.getEndereco());
        System.out.println("Telefone: "+ this.getTelefone());
        System.out.println("-------------------------\n");
    }
}
