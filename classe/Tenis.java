package classe;

public class Tenis {
    
    private String cordotenis;
    private String tamanho;
    private boolean palmilha;
    private String marca;
    
public Tenis(String cordotenis, String tamanho, String marca, boolean palmilha) {
    this.cordotenis= cordotenis;
    this.tamanho = tamanho ;
    this.marca = marca;
    this.palmilha = palmilha;
}
    public String getCordotenis() {
        return cordotenis;
    }
    public void setCordotenis(String cordotenis) {
        this.cordotenis = cordotenis;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public boolean isPalmilha() {
        return palmilha;
    }
    public void setPalmilha(boolean palmilha) {
        this.palmilha = palmilha;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
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
