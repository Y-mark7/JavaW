package studies.introducao;             //Atribuição

public class Aula10OperadoresPt05 {
    public static void main(String[] args) {
        // =, +=, -=, *=, /=, %=

        int bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000
        System.out.println("Seu bônus é de: "+bonus); // bonus = 2800
        bonus -= 800; // bonus = bonus - 800
        System.out.println("Seu bônus é de: "+bonus); // bonus = 2000
        bonus *= 3; // bonus = bonus * 3
        System.out.println("Seu bônus é de: "+bonus); // bonus = 6000
        bonus /= 2; // bonus = bonus / 2
        System.out.println("Seu bônus é de: "+bonus); // bonus = 3000
        bonus %= 2; // bonus = bonus % 2
        System.out.println("Seu bônus é de: "+bonus); // bonus = 0

        // ++, --
        int contador = 0;
        contador++; // contador = contador + 1
        System.out.println("Contador: "+contador);
        contador--; // contador = contador - 1
        System.out.println("Contador: "+contador);
    }
}