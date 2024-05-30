import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
    
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu primeiro nome ");
        String nome = scanner.next();
    
        System.out.println("Agora digite seu sobrenome ");
        String sobrenome = scanner.next();
    
        System.out.println("Informe a sua Agencia ");
        String agencia = scanner.next();

        System.out.println("Informe o numero da sua conta ");
        int numero = scanner.nextInt();
    
        System.out.println("Saldo");
        double saldo = scanner.nextDouble();
    
      System.out.println("Olá, " + nome + " " + sobrenome);  
      System.out.println("Obrigada por criar uma conta em nosso banco, sua agencia é " + agencia  + " Conta " + numero );  
      System.out.println("E seu saldo " + saldo  +  " Já está disponivel para saque ");  
}
}