import java.util.Scanner;

public class Ex03 {
     public static void main(String[] args) {
         
         int numero;
         
         Scanner input = new Scanner(System.in);
         System.out.println("insira um número: ");
         numero = input.nextInt();
         
        if (numero %2 ==0) {
            System.out.println("este número é par");
        }
        else {
            System.out.println("este número é ímpar");
        }
        
        if (numero > 0){
            System.out.println("o número é positivo");
        }
        else if (numero < 0){
            System.out.println("o número é negativo");
        }
        else if ( numero == 0){
            System.out.println("o número é 0");
        }
         
     }
}