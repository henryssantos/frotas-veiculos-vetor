public class Veiculo {
    private String placa;
    private double tanqueCapacidade;
    private double consumoMedio;

    public Veiculo(String placa, double tanqueCapacidade, double consumoMedio) {
        this.setPlaca(placa);
        this.setTanqueCapacidade(tanqueCapacidade);
        this.setConsumoMedio(consumoMedio);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getTanqueCapacidade() {
        return tanqueCapacidade;
    }

    public void setTanqueCapacidade(double tanqueCapacidade) {
        if(tanqueCapacidade > 0){
            this.tanqueCapacidade = tanqueCapacidade;
        } else {
            System.out.println("Valor invalido para tanque!");
        }
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        if(consumoMedio > 0){
            this.consumoMedio = consumoMedio;
        }else{
            System.out.println("Valor invalido para consumo!");
        }
    }
    public void verificarAutonomia(){
        double autonomia = tanqueCapacidade * consumoMedio;

        if(autonomia < 100){
            System.out.println("Alerta: Abastecimento necessário");
        }else{
            System.out.println("Autonomia: " + autonomia + "Km");
        }
    }

}
