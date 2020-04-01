import java.util.Scanner;

public class Principal {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Programa que informa se um número é feliz ou triste\nDigite um número:");
        int numeroDigitadoPeloUsuario = teclado.nextInt();
        System.out.println("O número digitado foi: " + numeroDigitadoPeloUsuario);
        System.out.println(examinarNumero(numeroDigitadoPeloUsuario));
    }

    private static String examinarNumero(int numero) {
        while (numero > 1 && numero != 89) {
            numero = somarOsQuadradosDoNumero(numero);
        }
        return numero == 89 ? "Número triste." : "Número feliz!";
    }

    private static int somarOsQuadradosDoNumero(int numero) {
        int numeroADecompor;
        numeroADecompor = numero;
        numero = 0;
        int algarismoCalculadoDoNumeroADecompor;
        while (numeroADecompor > 0) {
            algarismoCalculadoDoNumeroADecompor = (numeroADecompor % 10) * (numeroADecompor % 10);
            numero += algarismoCalculadoDoNumeroADecompor;
            numeroADecompor = numeroADecompor / 10;
        }
        return numero;
    }

}