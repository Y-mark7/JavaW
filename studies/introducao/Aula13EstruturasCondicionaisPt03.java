package studies.introducao;             //Operador ternário

public class Aula13EstruturasCondicionaisPt03 {
    public static void main(String[] args) {
        double salario = 3000D;
        String mensagemDoar = "Eu vou doar 500 reais para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        //Operador ternário
        // (condição) ? verdadeiro : falso

        double salario2 = 2000D;
        String comprarJogo = "Vou comprar o jogo";
        String naoComprarJogo = "Não vou comprar o jogo";
        String decisao = salario2 > 3000 ? comprarJogo : naoComprarJogo;
        System.out.println(decisao);
    }
}