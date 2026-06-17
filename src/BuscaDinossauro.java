// BuscaDinossauro.java
public class BuscaDinossauro {

    static void buscaDino(Pesquisador[] pesquisadoresArray, DinossauroEspecie[] dinossauroArray) {
        if (dinossauroArray[0] == null) {
            System.out.println("  Não temos dinossauros aqui ainda... quem sabe você possa adicionar um?");
            return;
        }
        System.out.println("=".repeat(60));
        /*claude*/
        System.out.printf("  %-20s | %-15s | %-6s | %-6s | %-10s | %s%n",
                "ESPÉCIE", "PESQUISADOR", "PESO", "ALTURA", "COMPRIMENTO", "ANO");
        System.out.println("-".repeat(60));
        for (int i = 0; i < dinossauroArray.length; i++) {
            if (dinossauroArray[i] != null)
                System.out.println(dinossauroArray[i]);
        }
        System.out.println("=".repeat(60));
    }

    static void buscaDinossauro(Pesquisador[] pesquisadoresArray, DinossauroEspecie[] dinossauroArray, int tipo, String busca) {
        if (dinossauroArray[0] == null) {
            System.out.println("  Não temos dinossauros aqui ainda... quem sabe você possa adicionar um?");
            return;
        }
        System.out.println("=".repeat(60));
        /*claude*/
        System.out.printf("  %-20s | %-15s | %-6s | %-6s | %-10s | %s%n",
                "ESPÉCIE", "PESQUISADOR", "PESO", "ALTURA", "COMPRIMENTO", "ANO");
        System.out.println("-".repeat(60));
        
        switch (tipo) {
            case 2:
                for (int i = 0; i < dinossauroArray.length; i++) {
                    if (dinossauroArray[i] != null && dinossauroArray[i].getEspecie().toLowerCase().contains(busca))
                        System.out.println(dinossauroArray[i]);
                }
                break;
            case 3:
                for (int i = 0; i < dinossauroArray.length; i++) {
                    if (dinossauroArray[i] != null && dinossauroArray[i].getPeso() >= Double.parseDouble(busca))
                        System.out.println(dinossauroArray[i]);
                }
                break;
            case 4:
                for (int i = 0; i < dinossauroArray.length; i++) {
                    if (dinossauroArray[i] != null && dinossauroArray[i].getPeso() <= Double.parseDouble(busca))
                        System.out.println(dinossauroArray[i]);
                }
                break;
            case 5:
                for (int i = 0; i < dinossauroArray.length; i++) {
                    if (dinossauroArray[i] != null && dinossauroArray[i].getComprimento() >= Double.parseDouble(busca))
                        System.out.println(dinossauroArray[i]);
                }
                break;
            case 6:
                for (int i = 0; i < dinossauroArray.length; i++) {
                    if (dinossauroArray[i] != null && dinossauroArray[i].getComprimento() <= Double.parseDouble(busca))
                        System.out.println(dinossauroArray[i]);
                }
                break;
            case 7:
                for (int i = 0; i < dinossauroArray.length; i++) {
                    if (dinossauroArray[i] != null && dinossauroArray[i].getAltura() <= Double.parseDouble(busca))
                        System.out.println(dinossauroArray[i]);
                }
                break;
            case 8:
                for (int i = 0; i < dinossauroArray.length; i++) {
                    if (dinossauroArray[i] != null && dinossauroArray[i].getAltura() >= Double.parseDouble(busca))
                        System.out.println(dinossauroArray[i]);
                }
                break;
            case 9:
                for (int i = 0; i < dinossauroArray.length; i++) {
                    if (dinossauroArray[i] != null && dinossauroArray[i].getAnoDescoberta() >= Integer.parseInt(busca))
                        System.out.println(dinossauroArray[i]);
                }
                break;
            case 10:
                for (int i = 0; i < dinossauroArray.length; i++) {
                    if (dinossauroArray[i] != null && dinossauroArray[i].getAnoDescoberta() <= Integer.parseInt(busca))
                        System.out.println(dinossauroArray[i]);
                }
                break;
        }
        System.out.println("=".repeat(60));
    }
}