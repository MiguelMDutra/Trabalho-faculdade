import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader leitor = new BufferedReader(
        new InputStreamReader(System.in));
    boolean criarPesquisador=true;

    boolean nomeValido;
    boolean nacionalidadeValida;
    boolean idadeValida;
    if(criarPesquisador==true){
        String nome;
        String nacionalidade;
        int idadeNumero;
        
        while(!nomeValido){
            do{
                System.out.println("Digite o nome do pesquisador");
                nome = leitor.readLine();
                if(nome.length()<3||!nome.matches("[a-zA-ZÀ-ÿ ]+")){
                    System.out.println("Coloque um nome válido. Só letras e sem caracteres especiais");
                } else {
                    nomeValido = true;
                }
            }
        } while(!nacionalidadeValida){
            System.out.println("Digite a nacionalidade do pesquisador");
            nacionalidade= leitor.readLine();
                if(nacionalidade.length()<3||!nacionalidade.matches("[a-zA-ZÀ-ÿ ]+")){
                    System.out.println("Coloque um nacionalidade válida. Só letras e sem caracteres especiais");
                } else {
                    nacionalidadeValida = true;
                }
        }while(!idadeValida){
            System.out.println("Digite a idade do pesquisador");
            String idade= leitor.readLine();
            idadeNumero = Integer.parseInt(idade);
                if(idadeNumero<0){
                    System.out.println("Coloque uma idade válide.");
                } else {
                    nacionalidadeValida = true;
                }
        }

    Pesquisador p1 = new Pesquisador(nome, nacionalidade, idadeNumero);
    }

}
}