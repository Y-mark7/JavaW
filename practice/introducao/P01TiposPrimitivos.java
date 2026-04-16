package practice.introducao;
/*
Prática 01 - Tipos Primitivos

Crie variáveis para cada um dos campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome> tenho <idade> anos, morando em <endereço>, confirmo que
recebi o sálario de <sálario>, na data <data>

*/

public class P01TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "GU7";
        int idade = 19;
        String endereco = "Brasil";
        float salario = 2500.73F;
        String dataRecebimento = "12/04/2026";
        System.out.println("Eu "+nome+" tenho "+idade+" anos, morando em "+endereco+", confirmo que recebi o sálario de R$"+salario+", na data "+dataRecebimento);

        System.out.println("Outra forma (escrita no code): ");

        String resposta = "Eu "+nome+" tenho "+idade+" anos, morando em "+endereco+", confirmo que recebi o sálario de R$"+salario+", na data "+dataRecebimento;
        System.out.println(resposta);
    }
}