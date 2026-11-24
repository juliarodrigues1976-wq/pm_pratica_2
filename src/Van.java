package src;

public class Van extends Veiculo {

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem,
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
