import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5){
            System.out.println("Digite um número entre 0 e 100");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número secreto!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número secreto!");
            }else{
                System.out.println("O número digitado é maior que o número secreto!");
            }
        }
        if (tentativas == 5){
            System.out.println("Você não conseguiu adivinhar com 5 tentativas! O número secreto era " +numeroGerado);
        }
    }

}