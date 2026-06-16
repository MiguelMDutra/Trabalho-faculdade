import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader leitor = new BufferedReader(
        new InputStreamReader(System.in));
    
    boolean criarPesquisador=false;
    boolean criarEspecie=false;
    boolean sair=false;
    
    System.out.println("Bem vindo! O que você gostaria? 0-sair; 1- criar pesquisador; 2-Criar dinossauro; 3-ver pesquisadores; 4-ver dinossauros");
    String direcionador = leitor.readLine();
    int direcionadorNumero = Integer.parseInt(direcionador);
    switch (direcionadorNumero) {
    case 0:
        sair = true;
        break;

    case 1:
        criarPesquisador = true;
        break;

    case 2:
        criarEspecie = true;
        break;

    default:
        break;
}




    Pesquisador[] pesquisadoresArray = new Pesquisador[20];
    int qtdPesquisadores = 0;

    while(sair==false){
    if(criarPesquisador==true){
        boolean nomeValido= false;
        boolean nacionalidadeValida=false;
        boolean idadeValida=false;
        String nome = "";
        String nacionalidade = "";
        int idadeNumero = 0;
        
        while(nomeValido == false){
                System.out.println("Digite o nome do pesquisador");
                nome = leitor.readLine();
                /*Usado chat gpt(tava pensando em usar contains e colocar as letras mas lembrei dos caracteres e ele deu essa solução)*/
                if(nome.length()<3||!nome.matches("[a-zA-ZÀ-ÿ ]+")){
                    System.out.println("Coloque um nome válido. Só letras e sem caracteres especiais");
                } else {
                    nomeValido = true;
                }
        } while(nacionalidadeValida == false){
            System.out.println("Digite a nacionalidade do pesquisador");
            nacionalidade= leitor.readLine();
                if(nacionalidade.length()<3||!nacionalidade.matches("[a-zA-ZÀ-ÿ ]+")){
                    System.out.println("Coloque um nacionalidade válida. Só letras e sem caracteres especiais");
                } else {
                    nacionalidadeValida = true;
                }
        }while(idadeValida== false){
            System.out.println("Digite a idade do pesquisador");
            String idade= leitor.readLine();
            idadeNumero = Integer.parseInt(idade);
                if(idadeNumero<0 || idadeNumero>100){
                    System.out.println("Coloque uma idade válida.");
                } else {
                    idadeValida = true;
                }
        }
        /*macete da professora(java podia ter o push...)*/
    pesquisadoresArray[qtdPesquisadores] =
    new Pesquisador(nome, nacionalidade, idadeNumero);
    System.out.println(pesquisadoresArray[qtdPesquisadores]);
    qtdPesquisadores++;
    criarPesquisador=false;  
    }
        if(criarEspecie==true){
        boolean especieValida= false;
        boolean pesoValido=false;
        boolean alturaValida=false;
        boolean comprimentoValido=false;
        boolean anoDescobertaValida=false;

        String especie="Alguma, certamente.";
        Pesquisador pesquisador = pesquisadoresArray[0];
        double peso=1; 
        double altura = 0.1;
        double comprimento = 0.1;
        int anoDescoberta = 1823;
        
        while(especieValida == false){
                System.out.println("Digite a espécie do dinossauro");
                especie = leitor.readLine();
                if(especie.length()<3||!especie.matches("[a-zA-ZÀ-ÿ ]+")){
                    System.out.println("Coloque um nome de espécie válido. Só letras e sem caracteres especiais");
                } else {
                    especieValida = true;
                }
        } while(pesoValido== false){
            System.out.println("Digite o peso do dinossauro(em toneladas)");
            String pesagem= leitor.readLine();
            peso = Double.parseDouble(pesagem);
                if(peso<=0 || peso>=100){
                    System.out.println("Coloque um peso válido.");
                } else {
                    pesoValido = true;
                }
        }while(alturaValida== false){
            System.out.println("Digite a altura do dinossauro(em metros)");
            String alturaLida = leitor.readLine();
            altura = Double.parseDouble(alturaLida);
                if(altura<=0 || altura>=100){
                    System.out.println("Coloque uma altura válida.");
                } else {
                    alturaValida = true;
                }
        }while(comprimentoValido== false){
            System.out.println("Digite o comprimento do dinossauro(em metros)");
            String comprimentoLido= leitor.readLine();
            comprimento = Double.parseDouble(comprimentoLido);
                if(comprimento<0 || comprimento>=100){
                    System.out.println("Coloque um comprimento válida.");
                } else {
                    comprimentoValido = true;
                }
        }while(anoDescobertaValida== false){
            System.out.println("Digite o ano de descoberta do dinossauro");
            String anoDescobertaLida= leitor.readLine();
            anoDescoberta = Integer.parseInt(anoDescobertaLida);
                if(anoDescoberta<=1700 || anoDescoberta>=2026){
                    System.out.println("Coloque um ano válido. " +anoDescoberta+ " nem faz sentido");
                } else {
                    anoDescobertaValida = true;
                }
        }
        
    DinossauroEspecie dinossauro = new DinossauroEspecie(especie, pesquisador, peso, altura, comprimento, anoDescoberta);
    System.out.print(dinossauro);
    criarEspecie=false;
    }
} 
    System.out.println("Muito obrigado!");

}
}