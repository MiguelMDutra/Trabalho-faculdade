public class DinossauroEspecie {
    private String especie;
    private Pesquisador pesquisador;
    private double peso;
    private double altura;
    private double comprimento;
    private int anoDescoberta;

    public DinossauroEspecie(String especie,Pesquisador pesquisador, double peso, double altura, double comprimento, int anoDescoberta){
        this.especie=especie;
        this.pesquisador= pesquisador;
        this.peso=peso;
        this.altura=altura;
        this.comprimento=comprimento;
        this.anoDescoberta=anoDescoberta;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

     public String getEspecie(){
        return especie;
    }

     public void setPeso(double peso){
        this.peso = peso;
    }

     public double getPeso(){
        return peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

     public double getAltura(){
        return altura;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

     public double getComprimento(){
        return comprimento;
    }

     public void setAnoDescoberta(int anoDescoberta){
        this.anoDescoberta = anoDescoberta;
    }

     public int getAnoDescoberta(){
        return anoDescoberta;
    }

    // claude
    public String toString() {
     return String.format("  %-20s | %-15s | %-6.1f | %-6.1f | %-10.1f | %d",
            especie, pesquisador.getNome(), peso, altura, comprimento, anoDescoberta);
    }
}
