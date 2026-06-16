

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CriarDinossauro {
    public static void criarDinossauro(Pesquisador[] pesquisadoresArray) throws Exception {
        BufferedReader leitor = new BufferedReader(
        new InputStreamReader(System.in));
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
    }
}
