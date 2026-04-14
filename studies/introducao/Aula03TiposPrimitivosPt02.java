package studies.introducao;

public class Aula03TiposPrimitivosPt02 {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        
        int idade = 19; // números inteiros (4 bytes)
        long numeroGrande = 123456789; // números inteiros grandes (8 bytes)
        float salarioFloat = 2500; // números decimais (4 bytes)
        double salarioDouble = 250050; // números decimais grandes (8 bytes)
        byte idadeByte = 10; // números inteiros pequenos (1 byte)
        short idadeShort = 15; // números inteiros médios (2 bytes)
        boolean verdadeiro = true; // valores booleanos (1 byte)
        boolean falso = false; // valores booleanos (1 byte)
        char letra = 'A'; // caracteres (2 bytes) e tabela ASCII e Unicode
        System.out.println("A idade é: "+idade+" anos");
        System.out.println("O número grande é: "+numeroGrande);
        System.out.println("O salário como float é: "+salarioFloat);
        System.out.println("O salário como double é: "+salarioDouble);
        System.out.println("A idade como byte é: "+idadeByte);
        System.out.println("A idade como short é: "+idadeShort);
        System.out.println("O valor verdadeiro é: "+verdadeiro);
        System.out.println("O valor falso é: "+falso);
        System.out.println("A letra é: "+letra);
    }
}