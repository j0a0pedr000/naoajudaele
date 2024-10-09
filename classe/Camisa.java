package classe;

public class Camisa {

    public String cordacamisa ;
    public String tamanho;
    public boolean manga;
    public String marca;

    public void usando() {
        System.out.println("Estou usando");
    }
    public void vestindo(){
        System.out.println("Estou vestindo");
    }

    @Override
    public String toString() {
        return "\nCor da camisa: " +this.cordacamisa
                + "\nTamanho: " +this.tamanho
                + "\nManga: " +this.manga
                + "\nMarca: " +this.marca;
                

    }
    
}
 