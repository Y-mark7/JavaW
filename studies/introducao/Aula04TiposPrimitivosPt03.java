package studies.introducao;             //Casting

public class Aula04TiposPrimitivosPt03 {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        int idade = 19;
        long numeroGrande = 123456789L;
        float salarioFloat = 2500.89F;
        double salarioDouble = 250050.091D;
        byte idadeByte = 10;
        short idadeShort = 15;
        boolean verdadeiro = true;
        boolean falso = false; 
        char letra = 'A';
        System.out.println("A idade é: "+idade+" anos");
        System.out.println("O número grande é: "+numeroGrande);
        System.out.println("O salário como float é: "+salarioFloat);
        System.out.println("O salário como double é: "+salarioDouble);
        System.out.println("A idade como byte é: "+idadeByte);
        System.out.println("A idade como short é: "+idadeShort);
        System.out.println("O valor verdadeiro é: "+verdadeiro);
        System.out.println("O valor falso é: "+falso);
        System.out.println("A letra é: "+letra);

        int numero = (int) 10000000000L;
        System.out.println("O número é: "+numero);
        float salario = (float) 19223.132D;
        System.out.println("O salário é: "+salario);
        long numeroGrande2 = (long) 123456789.123D;
        System.out.println("O número grande é: "+numeroGrande2);
    }
}