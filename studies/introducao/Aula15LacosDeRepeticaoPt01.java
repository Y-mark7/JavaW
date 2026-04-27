package studies.introducao;             // Laços de Repetição

public class Aula15LacosDeRepeticaoPt01 {
    public static void main(String[] args) {
        // While, do while, for
        int contador = 0;

        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        do {
            System.out.println("Dentro do do-while");
        } while (contador <= 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("For " + i);
        }
    }
}