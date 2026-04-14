public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, double tanqueCapacidade, double consumoMedio, int eixos) {
        super(placa, tanqueCapacidade, consumoMedio);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if(eixos > 0){
            this.eixos = eixos;
        }else {
            System.out.println("Valor invalido para eixos!");
        }
    }
}
