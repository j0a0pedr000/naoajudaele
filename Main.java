public class Main {
    public static void main (String [] args) {
        
        int n1 = 10;
        int n2 = 15;
        double res; 
        //pipipipipipipipipipipipipipipipipipipipipipipipipipipipi
        // operadores Aritimeticos
        res = n1 + n2;
        res = n1 - n2;
        res = n1 * n2;
        res = n1 / n2;
        res = n1 % n2;
        
        if (n1 < n2) {
            System.out.println("O primeiro valor e menor que o sugundo");
        } else if (n1 > n2) {
            System.out.println("O segundo valor e menor que o primeiro");
        } else {
            System.out.println("Os valores sao iguais");
        }
        // lacos de repeticao
 //laco while
 int repeticao = 0;
 while (repeticao < 10) {
     System.out.println("volta Nr" + repeticao);
     repeticao++;
    }
    
    //loop for
    System.out.println("\n");
    for (int i=0; i<=10; i++) {
        System.out.println("loop " + i);
    }
    
    //Switch Case
    int caso = 3;
    switch(caso){
        case 1:
            System.out.println("primeiro");
        case 2:
            System.out.println("segundo");
        case 3:
            System.out.println("terceiro");
        default:
            System.out.println("outro caso");
            
    }
    
    }
}

 
