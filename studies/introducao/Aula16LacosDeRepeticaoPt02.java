package studies.introducao;             // Utilizando break

public class Aula16LacosDeRepeticaoPt02 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números até 50

        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}