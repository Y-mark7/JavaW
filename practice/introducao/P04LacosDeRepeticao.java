package practice.introducao;
/*
Prática 04 - Laços de Repetição

Imprima todos os valores pares de 0 até 1000

*/

public class P04LacosDeRepeticao {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 1000) {
            System.out.println(contador);
            contador += 2;
        }

        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");

        for (int i = 0; i <= 100; i ++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}