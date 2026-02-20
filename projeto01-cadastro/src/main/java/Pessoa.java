public class Pessoa {
    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    private String nome;
    private int idade;
    private double salario;

    public void seApresentar() {
        System.out.println("Ola! Meu nome é " + nome + " tenho " + idade + " anos!");
    }
}
