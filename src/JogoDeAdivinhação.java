import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhação {
   public static void main(String[] args) {
       int numeroAleatorio = new Random().nextInt(101);
       Scanner chute = new Scanner(System.in);
       System.out.println("bem vindo ao jogo da adivinhação, descobra o número secreto entre 0 e 100");
       System.out.println("digite um número entre 0 e 100");
       for (int i = 1; i < 6; i++) {
           int tentativa = chute.nextInt();
          if (tentativa == numeroAleatorio) {
              System.out.println("parabens, você acertou o numero secreto");
              break;
          } else {
              if (tentativa > numeroAleatorio) {
                  System.out.println("o numero secreto é menor");
              } else if (tentativa < numeroAleatorio) {
                  System.out.println("o numero secreto é maior");
              } System.out.println("Tentativas restantes: " + (5 - i));
               if (i == 5 && tentativa != numeroAleatorio){
                   System.out.println("Suas tentativas acabaram, o número era " + numeroAleatorio);
               }
          }
       }
   }
}