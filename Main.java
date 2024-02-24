public class Main {
    public static void main(String[] args) {
        Tablero tablero=new Tablero();
        char Jugador='X';
        tablero.iniciarTablero();
        int numJugadas=0;
        char ganador='-';
        do {
            Jugador=tablero.preguntarMovimiento(Jugador);
            System.out.println(tablero);
            numJugadas++;
            ganador= tablero.comprobarGanador();
        }
        while (numJugadas<9&&ganador=='-');
        if (numJugadas==9){
            System.out.println("La partida resultó en empate");
        }
        else System.out.println("Enhorabuna juagado "+ganador+" has ganado la partida");


        }

    }
