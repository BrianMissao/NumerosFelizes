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
            numero = organizarNumero(numero);
        }
        return numero == 89? "Número triste.": "Número feliz!";
    }

    private static int organizarNumero(int numero) {
        int numeroTemp;
        numeroTemp = numero;
        numero = 0;
        int digitoTemp;
        while (numeroTemp > 0) {
            digitoTemp = (numeroTemp % 10) * (numeroTemp % 10);
            numero += digitoTemp;
            numeroTemp = numeroTemp / 10;
        }
        return numero;
    }

}