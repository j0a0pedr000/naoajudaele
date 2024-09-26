import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        int idadeanos, idademeses, idadedias, idadetotaldias;

        Scanner input =new Scanner(System.in);
        System.out.println("insira sua idade ");
        idadeanos= input.nextInt();
        System.out.println("insira os meses  ");
        idademeses= input.nextInt();
        System.out.println("insira os dias ");
        idadedias= input.nextInt();

        idadetotaldias = idadeanos * 365 + idademeses * 30 + idadedias;
        System.out.println("Portanto, anos envolvem a  " + idadetotaldias);

    }
        
    
    
}
