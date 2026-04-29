package practice.introducao;
/*
Prática 05 - Break

Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
Condição = valor da parcela >= 1000

*/

public class P05Break {
    public static void main(String[] args) {
        double valorTotalCarro = 60000;

        for (int parcela = 1; parcela <= valorTotalCarro; parcela++) {
            double valorParcela = valorTotalCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}