package studies.introducao;             //Utilizando if

public class Aula11EstruturasCondicionaisPt01 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");
        
        // !
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida");
        }
    }
}