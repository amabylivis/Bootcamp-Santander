import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Olá! Por favor digite seu nome.");
        String nome = scanner.next();
        
        System.out.println("Agora digite seu sobrenome.");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da sua Agencia por favor!");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua Conta");
        int conta = scanner.nextInt();

        System.out.println("E por último, digite o seu Saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome);
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        System.out.println("conta " + conta + ", e seu saldo " + saldo + " já está disponível para saque.");
    }
}