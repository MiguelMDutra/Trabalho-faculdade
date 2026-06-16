import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException, Exception {
        BufferedReader leitor = new BufferedReader(
        new InputStreamReader(System.in));
    
    
    
    Pesquisador[] pesquisadoresArray = new Pesquisador[20];
    int qtdPesquisadores = 0;


    
    int direcionadorNumero=1;

while(direcionadorNumero!=0){
    System.out.println("Bem vindo! O que você gostaria? 0-sair; 1- criar pesquisador; 2-Criar dinossauro; 3-ver pesquisadores; 4-ver dinossauros");
    String direcionador = leitor.readLine();
    direcionadorNumero = Integer.parseInt(direcionador);
    switch (direcionadorNumero) {
    case 0:
        break;

    case 1:
        CriarPesquisador.cadastrarPesquisador(pesquisadoresArray, qtdPesquisadores);
        break;
    case 2:
        CriarDinossauro.criarDinossauro(pesquisadoresArray);
        break;
    case 3:
        for(int i=0;i<pesquisadoresArray.length;i++){
            if(pesquisadoresArray[i]!=null)
          System.out.println(pesquisadoresArray[i]);
        }
    default:
        System.out.println("digite um número válido");
        break;
}
}
    
    
    
    System.out.println("Muito obrigado!");

}
}