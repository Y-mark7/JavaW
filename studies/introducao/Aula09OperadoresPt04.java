package studies.introducao;             //Lógicos - OR

public class Aula09OperadoresPt04 {
    public static void main(String[] args) {
        // && (AND), || (OR), ! (NOT)

        double valorTotalContaCorrente = 200D;
        double valorTotalContaPoupanca = 10000D;
        float valorPlayStation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel "+isPlayStationCincoCompravel);
    }
}