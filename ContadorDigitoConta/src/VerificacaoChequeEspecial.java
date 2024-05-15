import java.util.Scanner;
public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo atual da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Informe o valor do saque desejado:");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Transação realizada com sucesso.");
            System.out.println("Saldo atual: " + saldo);
        } else if (saque <= saldo + limiteChequeEspecial) {
            double excesso = saque - saldo;
            saldo = 0;
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            System.out.println("Saldo atual: " + saldo);
            System.out.println("Valor utilizado do cheque especial: " + excesso);
        } else {
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            System.out.println("Saldo disponível: " + saldo);
            System.out.println("Limite do cheque especial: " + limiteChequeEspecial);
        }

        scanner.close();
    }
}