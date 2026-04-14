import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double media;

        Caminhao[] frota = new Caminhao[5];

        for(int i = 0; i < frota.length; i++){

            System.out.println("Placa: ");
            String placa = sc.nextLine();

            System.out.println("Tanque: ");
            double tanque = sc.nextDouble();

            System.out.println("Consumo: ");
            double consumo = sc.nextDouble();

            System.out.println("Eixos: ");
            int eixos = sc.nextInt();
            sc.nextLine();

            frota[i] = new Caminhao(placa,tanque,consumo,eixos);
        }

        for(int j = 0; j < frota.length; j++){
            frota[j].verificarAutonomia();

            soma += frota[j].getConsumoMedio();

            if(frota[j].getConsumoMedio() < 5 && frota[j].getTanqueCapacidade() < 50){
                System.out.println("Revisão urgente!");
            }
        }

        media = soma / frota.length;
        System.out.println("Média: " + media);

        System.out.println("1-Oléo  2-Pneus  3-Revisão: ");
        int opcao = sc.nextInt();

        Manutencao.tipoManutencao(opcao);

    }
}