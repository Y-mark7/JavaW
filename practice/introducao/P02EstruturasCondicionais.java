package practice.introducao;
/*
Prática 02 - Estruturas Condicionais

Eu quero saber quanto preciso pagar de taxa de imposto de renda anualmente na Holanda em 2020.

Tabela de imposto de renda anual na Holanda em 2020:

Renda Anual (em Euros)    Taxa de Imposto de Renda
0 - 34.712,00                   9.70%
34.713,00 - 68.507,00           37.35%
68.508,00 -                     49.50%

 */

public class P02EstruturasCondicionais {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraTaxa = salarioAnual * 0.097;
        double segundaTaxa = salarioAnual * 0.3735;
        double terceiraTaxa = salarioAnual * 0.495;

        if (salarioAnual <= 34712) {
            System.out.println("Primeira Faixa. Você deve pagar € " + primeiraTaxa + " de taxa.");
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            System.out.println("Segunda Faixa. Você deve pagar € " + segundaTaxa + " de taxa.");
        } else {
            System.out.println("Terceira Faixa. Você deve pagar € " + terceiraTaxa + " de taxa.");
        }
    }
}