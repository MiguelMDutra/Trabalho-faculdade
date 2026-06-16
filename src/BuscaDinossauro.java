public class BuscaDinossauro {
    static void buscaDinossauro(Pesquisador[] pesquisadoresArray,DinossauroEspecie[] dinossauroArray, int tipo){
        if(pesquisadoresArray[0]==null){
            System.out.println("Não temos pesquisadores aqui ainda... quem sabe você possa adicionar um?");
        } else if(tipo==3){
            for(int i=0;i<pesquisadoresArray.length;i++){
            if(pesquisadoresArray[i]!=null)
          System.out.println(pesquisadoresArray[i]);
        }
        } else if(tipo==4){
            for(int i=0;i<dinossauroArray.length;i++){
            if(dinossauroArray[i]!=null)
          System.out.println(dinossauroArray[i]);
        }
        } else if(tipo==5){
            
        }
        }
    }
