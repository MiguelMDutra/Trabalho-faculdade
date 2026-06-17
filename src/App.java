import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Pesquisador[] pesquisadoresArray = new Pesquisador[20];
        int qtdPesquisadores = 0;

        DinossauroEspecie[] dinossauroArray = new DinossauroEspecie[20];
        int qtdDinos = 0;

        int direcionadorNumero = -1;
        boolean primeiraVez = true;

        while (direcionadorNumero != 0) {
            System.out.println("=".repeat(60));
            if (primeiraVez) {
                System.out.println("  Bem vindo!");
                System.out.println("  [0] Sair");
                System.out.println("  [1] Criar pesquisador");
            } else {
                System.out.println("  O que você gostaria de fazer?");
                System.out.println("  [0] Sair");
                System.out.println("  [1] Criar pesquisador");
                System.out.println("  [2] Criar dinossauro");
                System.out.println("  [3] Ver pesquisadores e outras métricas");
                System.out.println("  [4] Ver dinossauros e outras métricas");
            }
            System.out.println("=".repeat(60));
            System.out.print("  > ");

            String direcionador = leitor.readLine();
            direcionadorNumero = Integer.parseInt(direcionador);

            while (primeiraVez && (direcionadorNumero < 0 || direcionadorNumero >= 2)) {
                System.out.println("  !! Digite um número válido: ");
                System.out.print("  > ");
                direcionador = leitor.readLine();
                direcionadorNumero = Integer.parseInt(direcionador);
            }
            primeiraVez = false;

            String tipoBusca;
            int tipoBuscaNumero;

            switch (direcionadorNumero) {
                case 0:
                    break;

                case 1:
                    qtdPesquisadores = CriarPesquisador.cadastrarPesquisador(pesquisadoresArray, qtdPesquisadores);
                    System.out.println(qtdPesquisadores);
                    break;

                case 2:
                    CriarDinossauro.criarDinossauro(pesquisadoresArray, dinossauroArray, qtdDinos);
                    System.out.println(qtdDinos);
                    break;

                case 3:
                    /*claude começo*/
                    System.out.println("=".repeat(60));
                    System.out.println("  BUSCA DE PESQUISADORES");
                    System.out.println("-".repeat(60));
                    System.out.println("  Exibição geral:");
                    System.out.println("    [1] Ver todos os atributos de todos os pesquisadores");
                    System.out.println("-".repeat(60));
                    System.out.println("  Busca interativa:");
                    System.out.println("    [2] Buscar por nome");
                    System.out.println("    [3] Buscar por nacionalidade");
                    System.out.println("    [4] Buscar por idade exata");
                    System.out.println("    [5] Buscar por idade mínima (esse valor ou mais velhos)");
                    System.out.println("    [6] Buscar por idade máxima (esse valor ou mais novos)");
                    System.out.println("=".repeat(60));
                    System.out.print("  > ");
                    /*claude fim*/

                    tipoBusca = leitor.readLine();
                    tipoBuscaNumero = Integer.parseInt(tipoBusca);

                    while (tipoBuscaNumero < 0 && tipoBuscaNumero > 6) {
                        System.out.println("  !! Digite um número entre 1 e 9:");
                        System.out.print("  > ");
                        tipoBusca = leitor.readLine();
                        tipoBuscaNumero = Integer.parseInt(tipoBusca);
                    }

                    System.out.println("\n  Opção [" + tipoBuscaNumero + "] selecionada. Buscando...\n");

                    if (tipoBuscaNumero==1) {
                        BuscaPesquisador.buscaPesquisador(pesquisadoresArray);
                    } else if (tipoBuscaNumero > 1 && tipoBuscaNumero <= 6) {
                        System.out.print("  Digite o valor para busca: ");
                        String busca = leitor.readLine();
                        BuscaPesquisador.buscaPesquisadorInterativo(pesquisadoresArray, tipoBuscaNumero, busca);
                    }
                    break;

               // App.java - case 4
                
               case 4:
                /*claude começo*/
                    System.out.println("=".repeat(60));
                    System.out.println("  BUSCA DE DINOSSAUROS");
                    System.out.println("-".repeat(60));
                    System.out.println("  Exibição geral:");
                    System.out.println("    [1] Ver todos os dinossauros");
                    System.out.println("-".repeat(60));
                    System.out.println("  Busca interativa:");
                    System.out.println("    [2] Buscar por espécie");
                    System.out.println("    [3] Buscar por peso mínimo (esse valor ou mais pesados)");
                    System.out.println("    [4] Buscar por peso máximo (esse valor ou mais leves)");
                    System.out.println("    [5] Buscar por comprimento mínimo (esse valor ou maiores)");
                    System.out.println("    [6] Buscar por comprimento máximo (esse valor ou menores)");
                    System.out.println("    [7] Buscar por altura máxima (esse valor ou menores)");
                    System.out.println("    [8] Buscar por altura mínima (esse valor ou maiores)");
                    System.out.println("    [9] Buscar por ano de descoberta mínimo");
                    System.out.println("    [10] Buscar por ano de descoberta máximo");
                    System.out.println("=".repeat(60));
                    System.out.print("  > ");
                /*claude fim*/
                    tipoBusca = leitor.readLine();
                    tipoBuscaNumero = Integer.parseInt(tipoBusca);

                    while (tipoBuscaNumero < 1 || tipoBuscaNumero > 10) {
                    System.out.println("  !! Digite um número entre 1 e 10:");
                    System.out.print("  > ");
                    tipoBusca = leitor.readLine();
                    tipoBuscaNumero = Integer.parseInt(tipoBusca);
                }

                System.out.println("\n  Opção [" + tipoBuscaNumero + "] selecionada. Buscando...\n");

                if (tipoBuscaNumero == 1) {
                 BuscaDinossauro.buscaDino(pesquisadoresArray, dinossauroArray);
                } else if (tipoBuscaNumero >= 2 && tipoBuscaNumero <= 10) {
                System.out.print("  Digite o valor para busca: ");
                String busca = leitor.readLine();
                BuscaDinossauro.buscaDinossauro(pesquisadoresArray, dinossauroArray, tipoBuscaNumero, busca);
                }
                break;

                default:
                    System.out.println("  !! Digite um número válido.");
                    break;
            }
        }

        System.out.println("=".repeat(60));
        System.out.println("  Muito obrigado! Até logo.");
        System.out.println("=".repeat(60));
    }
}