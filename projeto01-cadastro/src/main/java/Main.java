public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Gabriel";
        pessoa1.idade = 21;
        pessoa1.salario = 2300.50;

        pessoa1.seApresentar();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Stefani";
        pessoa2.idade = 32;
        pessoa2.salario = 5000.00;

        pessoa2.seApresentar();

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Roberto";
        pessoa3.idade = 42;
        pessoa3.salario = 15500.00;

        pessoa3.seApresentar();
    }
}