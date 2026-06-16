public class BuscaPesquisador {
    static void buscaPesquisador(Pesquisador[] pesquisadoresArray, int tipo){
        if(pesquisadoresArray[0]==null){
            System.out.println("Não temos pesquisadores aqui ainda... quem sabe você possa adicionar um?");
        } else if(tipo==1){
            for(int i=0;i<pesquisadoresArray.length;i++){
            if(pesquisadoresArray[i]!=null)
          System.out.println(pesquisadoresArray[i]);
        }
        } else if(tipo==2){
            for(int i=0;i<pesquisadoresArray.length;i++){
            if(pesquisadoresArray[i]!=null)
          System.out.println(pesquisadoresArray[i].getNome());
        }
        }
        else if(tipo==3){
            for(int i=0;i<pesquisadoresArray.length;i++){
            if(pesquisadoresArray[i]!=null)
          System.out.println(pesquisadoresArray[i].getNacionalidade());
        }
        }
        else if(tipo==4){
            for(int i=0;i<pesquisadoresArray.length;i++){
            if(pesquisadoresArray[i]!=null)
          System.out.println(pesquisadoresArray[i].getIdade());
        }
        }
    }
    static void buscaPesquisadorInterativo(Pesquisador[] pesquisadoresArray, int tipo){
        switch (tipo) {
            case 5:
                for(int i=0;i<pesquisadoresArray.length;i++){
                if(pesquisadoresArray[i]!=null)
                 System.out.println(pesquisadoresArray[i]);
            }
                break;
            case 6:
                for(int i=0;i<pesquisadoresArray.length;i++){
                if(pesquisadoresArray[i]!=null)
                System.out.println(pesquisadoresArray[i].getNome());
            }
            break;
            case 7:
                for(int i=0;i<pesquisadoresArray.length;i++){
                if(pesquisadoresArray[i]!=null)
                System.out.println(pesquisadoresArray[i].getNacionalidade());
            }
            break;
            case 8:
                for(int i=0;i<pesquisadoresArray.length;i++){
                if(pesquisadoresArray[i]!=null)
                System.out.println(pesquisadoresArray[i].getIdade());
            }
            break;
            default:
                break;
        }
    }
}
