public class Manutencao {
    public static void tipoManutencao(int op){
        switch(op){
            case 1:
            System.out.println("Troca de Óleo ");
            break;
            case 2:
                System.out.println("Troca de Pneus");
                break;
            case 3:
                System.out.println("Revisão Geral ");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
