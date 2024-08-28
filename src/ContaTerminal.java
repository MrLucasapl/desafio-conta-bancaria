import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + numeroAgencia + ", conta " + numeroConta +
                " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}