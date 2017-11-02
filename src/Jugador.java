/**
 * Created by tonyyasi on 11/2/17.
 */
public class Jugador {

    private int conteo;
    private Deck deck = new Deck();

    private boolean validar(){
        return (conteo < 22);
    }

    public int getConteo(){
        return this.conteo;
    }

    public boolean revisarBlackJack(){
        return this.conteo == 21;
    }

    public int gana(Jugador otroJugador){
        if(this.validar() && otroJugador.validar()){
            if(this.conteo == otroJugador.conteo) return 0;
            if(this.conteo > otroJugador.conteo) return 1;
            return -1;
        }
        if(this.validar()) return 1;
        return 0;
    }

    public void repartirCartas(){
        this.conteo += deck.hit();
        this.conteo += deck.hit();
    }

    public void pedirCarta(){
        conteo+=deck.hit();
    }
}
