package src;

public class Carro extends Veiculo {

    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem,
            StatusVeiculo status) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
    }

    public void exibirDetalhes() {
        //void
    };

    public boolean possuiSeguroEspecial(){
        return false;
    }
}
