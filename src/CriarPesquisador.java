import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CriarPesquisador{
    public static int cadastrarPesquisador(Pesquisador[] pesquisadoresArray,int qtdPesquisadores)throws Exception{
        BufferedReader leitor = new BufferedReader(
        new InputStreamReader(System.in));

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
    System.out.println("Adicionado com sucesso!");
    qtdPesquisadores++;
    return qtdPesquisadores;
    }
    }