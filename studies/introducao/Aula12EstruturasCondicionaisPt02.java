package studies.introducao;             //Utilizando else if

public class Aula12EstruturasCondicionaisPt02 {
    public static void main(String[] args) {
        float salario = 3500.0f;
        boolean isSuficienteParaComprarMinecraft = salario >= 5000.69f;

        if (isSuficienteParaComprarMinecraft) {
            System.out.println("Parabéns, você pode comprar o Minecraft");
        } else {
            System.out.println("Infelizmente, você não pode comprar o Minecraft");
        }

        int idade = 17;
        String categoria = "";
        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}