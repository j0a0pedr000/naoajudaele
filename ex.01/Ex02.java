import java.util.Scanner;

public class Ex02 {

    public static void funcao (){
        Scanner input = new Scanner(System.in)
        int A = input. nextInt();
        int B = input. nextInt();
        int C = input. nextInt();

        double R = input.pow(A + B, 2);
        double S = input.pow(B + C, 2);
        double D = (R + S) / 2;

        System.out.println("o resultado é " + D);
        input.close();

    }
}