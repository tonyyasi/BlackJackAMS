/**
 * Created by tonyyasi on 11/1/17.
 */
import java.util.*;

public class Game {

    public static void main(String args[]) {

        int respuesta = 1;

         Jugador jugador1 = new Jugador();
         Jugador jugador2 = new Jugador();
        Scanner in = new Scanner(System.in);

        jugador1.repartirCartas();
        jugador2.repartirCartas();
        if(jugador1.revisarBlackJack() && jugador2.revisarBlackJack()){
            System.out.println("Ambos tuvieron black Jack");
        }
        else if(jugador1.revisarBlackJack()){
            System.out.println("Felicidades, ganaste con BlackJack");
        }
        else if(jugador2.revisarBlackJack()){
            System.out.println("Tu oponente venció con BlackJack");
        }
        else {

            System.out.println("Tu acumulado actual es: " + jugador1.getConteo());
            System.out.println("EL acumulado actual de tu oponente es: " + jugador2.getConteo());
            while (respuesta == 1) {
                System.out.println("Quieres otra carta?\n1)si\n2)no");
                respuesta = in.nextInt();
                if(respuesta == 1) {
                    jugador1.pedirCarta();
                    System.out.println("Tu acumulado actual es: " + jugador1.getConteo());
                }
            }

            while(jugador2.getConteo() < 17){
                jugador2.pedirCarta();
            }

            System.out.println("Tu acumulado actual es: " + jugador1.getConteo());
            System.out.println("EL acumulado actual de tu oponente es: " + jugador2.getConteo());

            int resultado = jugador1.gana(jugador2);
            if(resultado == 0){
                System.out.println("Empate");
            }
            else if(resultado == -1){
                System.out.println("Perdiste");
            }
            else{
                System.out.println("Felicidades, ganaste!");
            }

        }
    }
}
