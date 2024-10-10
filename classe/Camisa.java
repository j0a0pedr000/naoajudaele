package classe;

public class Camisa {

    private String tamanho;
    private String cordacamisa ;
    private boolean manga;
    private String marca;

    public Camisa(String tamanho, String cordacamisa, String marca, boolean manga) {
        this.marca = marca;
        this.cordacamisa = cordacamisa;
        this.manga = manga;
        this.tamanho = tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCordacamisa() {
        return cordacamisa;
    }

    public void setCordacamisa(String cordacamisa) {
        this.cordacamisa = cordacamisa;
    }

    public boolean isManga() {
        return manga;
    }

    public void setManga(boolean manga) {
        this.manga = manga;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nCor da camisa: " +this.cordacamisa
                + "\nTamanho: " +this.tamanho
                + "\nManga: " +this.manga
                + "\nMarca: " +this.marca;
                

    }
    
}
 