package studies.introducao;             //Relacionais

public class Aula07OperadoresPt02 {
    public static void main(String[] args) {
        //%
        int resto = 20 % 2;
        System.out.println("Resto da divisão: "+resto);


        //<, >, <=, >=, ==, !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezDiferenteVinte "+isDezDiferenteVinte);
    }
}