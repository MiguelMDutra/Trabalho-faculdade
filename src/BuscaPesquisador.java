public class BuscaPesquisador {
    /*ideia do claude*/
    static void imprimirCabecalho() {
    System.out.println(String.format("%-30s | %-30s | %s", "NOME", "NACIONALIDADE", "IDADE"));
    System.out.println("-".repeat(30) + "-+-" + "-".repeat(30) + "-+--------");
    }
    static void buscaPesquisador(Pesquisador[] pesquisadoresArray){
        if(pesquisadoresArray[0]==null){
            System.out.println("Não temos pesquisadores aqui ainda... quem sabe você possa adicionar um?");
        }
            imprimirCabecalho();
            for(int i=0;i<pesquisadoresArray.length;i++){
            if(pesquisadoresArray[i]!=null)
          System.out.println(pesquisadoresArray[i]);
        }
    }
    static void buscaPesquisadorInterativo(Pesquisador[] pesquisadoresArray, int tipo, String busca){
        switch (tipo) {
            case 2:
                imprimirCabecalho();
                for(int i=0;i<pesquisadoresArray.length;i++){
                if(pesquisadoresArray[i]!=null && pesquisadoresArray[i].getNome().toLowerCase().contains(busca))
                 System.out.println(pesquisadoresArray[i]);
            }
                break;
            case 3:
                imprimirCabecalho();
                for(int i=0;i<pesquisadoresArray.length;i++){
                if(pesquisadoresArray[i]!=null && pesquisadoresArray[i].getNacionalidade().toLowerCase().contains(busca))
                System.out.println(pesquisadoresArray[i]);
            }
            break;
            case 4:
                imprimirCabecalho();
                for(int i=0;i<pesquisadoresArray.length;i++){
                if(pesquisadoresArray[i]!=null && pesquisadoresArray[i].getIdade()==Integer.parseInt(busca))
                System.out.println(pesquisadoresArray[i]);
            }
            break;
            case 5:
                imprimirCabecalho();
                for(int i=0;i<pesquisadoresArray.length;i++){
                if(pesquisadoresArray[i]!=null && pesquisadoresArray[i].getIdade()>=Integer.parseInt(busca))
                System.out.println(pesquisadoresArray[i]);
            }
            break;
            case 6:
                imprimirCabecalho();
                for(int i=0;i<pesquisadoresArray.length;i++){
                if(pesquisadoresArray[i]!=null && pesquisadoresArray[i].getIdade()<=Integer.parseInt(busca))
                System.out.println(pesquisadoresArray[i]);
            }
            break;
            default:
                break;
        }
    }
}
