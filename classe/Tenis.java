package classe;

public class Tenis {
    
    public String cordotenis;
    public String tamanho;
    public boolean palmilha;
    public String marca;

    public void usando() {
        System.out.println("Estou usando");
    }
    public void vestindo(){
        System.out.println("Estou vestindo");
    }

    @Override
    public String toString() {
        return "\nCor da tenis: " +this.cordotenis
                + "\nTamanho: " +this.tamanho
                + "\nManga: " +this.palmilha
                + "\nMarca: " +this.marca;
    }             
}
