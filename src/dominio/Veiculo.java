package dominio;

public class Veiculo{
    private int codigo;
    private String marca;
    private String modelo;
    private int anoFabricação;
    private double preco;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricação() {
        return anoFabricação;
    }
    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Veiculo() {
    }

    public Veiculo(int codigo, String marca, String modelo, int anoFabricação, double preco) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricação = anoFabricação;
        this.preco = preco;
    }

}