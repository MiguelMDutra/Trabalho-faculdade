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
        
        /*Não sabia do equals... IA q falou p eu usar! também fiquei travado tentando achar um 
        jeito sem criar uma variavel e n consegui e pedi p IA(criei de qualquer jeito)*/
        boolean jaExiste = false;
        for (int i = 0; i < pesquisadoresArray.length; i++) {
            if (pesquisadoresArray[0] != null) {
            if (pesquisadoresArray[i].getNome().equals(nome) &&
            pesquisadoresArray[i].getNacionalidade().equals(nacionalidade) &&
            pesquisadoresArray[i].getIdade() == idadeNumero) {
            jaExiste = true;
            break;
             }
            }
        }

        if (jaExiste) {
            System.out.println("ERRO: Falta de criatividade! Muda pelo menos um atributo...");
        } else {
        pesquisadoresArray[qtdPesquisadores] = new Pesquisador(nome, nacionalidade, idadeNumero);
        System.out.println("Adicionado com sucesso!");
        qtdPesquisadores++;
        }
        return qtdPesquisadores;
    }
    }