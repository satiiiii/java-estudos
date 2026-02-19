public class Main {
    public static void verificarSalario(double salario) {
        if (salario >= 1500.00 && salario <= 3000.00) {
            System.out.println("Salario na media");
        } else if (salario > 3000.00) {
            System.out.println("Salario acima da media");
        } else {
            System.out.println("Salario abaixo da media");
        }
    }

    public static void main(String[] args) {
        verificarSalario(1500.00);
        verificarSalario(1400.00);
        verificarSalario(3700.00);
    }

}