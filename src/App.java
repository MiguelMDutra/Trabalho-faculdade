import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader leitor = new BufferedReader(
        new InputStreamReader(System.in));
    
    
    
    Pesquisador[] pesquisadoresArray = new Pesquisador[20];
    int qtdPesquisadores = 0;

    DinossauroEspecie[] dinossauroArray = new DinossauroEspecie[20];
    int qtdDinos = 0;
    
    int direcionadorNumero=-1;
    boolean primeiraVez=true;
    while(direcionadorNumero!=0){
    if(primeiraVez)System.out.println("Bem vindo! O que você gostaria? 0-sair; 1- criar pesquisador; 2-Criar dinossauro");
    else  System.out.println("E agora, O que você gostaria? 0-sair; 1- criar pesquisador; 2-Criar dinossauro; 3-ver pesquisadores e outras métricas; 4-ver dinossauros e outras métricas");
    
    String direcionador = leitor.readLine();
    direcionadorNumero = Integer.parseInt(direcionador);

    while(primeiraVez && (direcionadorNumero<0 || direcionadorNumero>=3)){
        System.out.println("digite um número válido");
        direcionador = leitor.readLine();
        direcionadorNumero = Integer.parseInt(direcionador);
    }primeiraVez=false;

    
    
    String tipoBusca;
    int tipoBuscaNumero;

    switch (direcionadorNumero) {
    case 0:
        break;

    case 1:
        CriarPesquisador.cadastrarPesquisador(pesquisadoresArray, qtdPesquisadores);
        break;
    case 2:
        CriarDinossauro.criarDinossauro(pesquisadoresArray, dinossauroArray, qtdDinos);
        break;
    case 3:
        System.out.println("O que você vai querer? uma busca mais geral ou você quer escrever? 1-4 são só displays de cada pesquisador e do 5-9 é mais dinâmico e você escreve os parâmetros.");
       System.out.print(
        "1-Ver todos os atributos de todos pesquisadores\n \n" +
        "2-Ver o nome de todos pesquisadores\n \n" +
        "3-Ver a nacionalidade de todos pesquisadores\n \n" +
        "4-Ver a idade de todos pesquisadores\n \n" +
        "5-Buscar pesquisador por nome\n \n" +
        "6-Buscar pesquisador por nacionalidade\n \n" +
        "7-Buscar pesquisador por idade\n \n"
        );
        
        tipoBusca = leitor.readLine();
        tipoBuscaNumero = Integer.parseInt(tipoBusca);
        while(tipoBuscaNumero>=0&&tipoBuscaNumero<=7){
            tipoBusca = leitor.readLine();
            tipoBuscaNumero = Integer.parseInt(tipoBusca);
        }
        if(tipoBuscaNumero>0 && tipoBuscaNumero<5) BuscaPesquisador.buscaPesquisador(pesquisadoresArray, tipoBuscaNumero);
        else if(tipoBuscaNumero>4 && tipoBuscaNumero<=7) BuscaPesquisador.buscaPesquisadorInterativo(pesquisadoresArray, tipoBuscaNumero);
        break;
    case 4:
        tipoBusca = leitor.readLine();
        tipoBuscaNumero = Integer.parseInt(tipoBusca);
       BuscaDinossauro.buscaDinossauro(pesquisadoresArray, dinossauroArray, direcionadorNumero);
        break;
    default:
        System.out.println("digite um número válido");
        break;
}
}  
    System.out.println("Muito obrigado!");

}
}