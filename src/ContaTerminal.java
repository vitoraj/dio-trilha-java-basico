import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in).useLocale(Locale.US);  
        

        System.out.println("Digite a sua Agencia:");
        String agencia = sc.next();

        System.out.println("Digite o numenro da sua conta:");
        int conta = sc.nextInt();

        sc.nextLine(); // limpar buffer
        System.out.println("Digite o seu nome completo:");
        String nome = sc.nextLine();

        System.out.println("Informe seu saldo inicial:");
        double saldo = sc.nextDouble();   
        

       System.out.println("Ola, " +nome+ " obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ " sua conta " +conta+ " seu saldo é R$ " +saldo+ " e já está disponível para saque !");

    }
    
}
