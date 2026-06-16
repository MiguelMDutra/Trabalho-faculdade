public class Pesquisador {
    private String nome;
    private String nacionalidade;
    private int idade;

    public Pesquisador(String nome, String nacionalidade, int idade){
        this.nome=nome;
        this.nacionalidade=nacionalidade;
        this.idade=idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade=nacionalidade;


    }public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

        public String toString(){
        return "O pesquisador de nome " +nome+ " e nacionalidade " + nacionalidade + ", tinha " + idade + " anos.";
        }
}
