
import java.util.Scanner;

public class Tablero {

    char [][] tablero=new char[3][3];
    public char[][] iniciarTablero(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]='-';
            }
        }
        return tablero;
    }
    public char preguntarMovimiento(char jugador){

        Scanner scan =new Scanner(System.in);
        int[] filaColumna=new int[2];
        System.out.println("Jugador "+jugador+" Escribe la fila y la columna donde colocarás tú pieza");
        do {
            filaColumna[0]=scan.nextInt();
            filaColumna[1]=scan.nextInt();
            filaColumna[0]=filaColumna[0]-1;
            filaColumna[1]=filaColumna[1]-1;
            if (filaColumna[0]>2 || filaColumna[0]<0||filaColumna[1]>2 || filaColumna[1]<0||tablero[filaColumna[0]][filaColumna[1]]=='X'||tablero[filaColumna[0]][filaColumna[1]]=='O'){
                System.out.println("Ese no es un valor válido para las filas, elige otro");
            }
        }
        while (filaColumna[0]>2 || filaColumna[0]<0||filaColumna[1]>2 || filaColumna[1]<0||tablero[filaColumna[0]][filaColumna[1]]=='X'||tablero[filaColumna[0]][filaColumna[1]]=='O');

        tablero[filaColumna[0]][filaColumna[1]]=jugador;
            if (jugador=='X'){
                return 'O';
            }
            else return 'X';

    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append("\n");
            for (int j = 0; j < 3; j++) {
                stringBuilder.append(tablero[i][j]).append(" ");
            }
        }
        return stringBuilder.toString();
    }
    public char comprobarGanador(){
        char ganador='-';
        if (tablero[0][0]==tablero[1][1]&&tablero[1][1]==tablero[2][2]&&tablero[1][1]!='-'){
            ganador=tablero[0][0];
        }
        if (tablero[0][2]==tablero[1][1]&&tablero[1][1]==tablero[2][0]&&tablero[1][1]!='-'){
            ganador=tablero[0][2];
        }
        if (tablero[0][0]==tablero[0][1]&&tablero[0][1]==tablero[0][2]&&tablero[0][1]!='-'){
            ganador=tablero[0][0];
        }
        if (tablero[0][0]==tablero[1][0]&&tablero[1][0]==tablero[2][0]&&tablero[2][0]!='-'){
            ganador=tablero[2][0];
        }
        if (tablero[2][0]==tablero[2][1]&&tablero[2][1]==tablero[2][2]&&tablero[2][2]!='-'){
            ganador=tablero[2][2];
        }
        if (tablero[0][2]==tablero[1][2]&&tablero[1][2]==tablero[2][2]&&tablero[1][2]!='-'){
            ganador=tablero[0][2];
        }
        if (tablero[1][0]==tablero[1][1]&&tablero[1][1]==tablero[1][2]&&tablero[1][1]!='-'){
            ganador=tablero[1][1];
        }
        if (tablero[0][1]==tablero[1][1]&&tablero[1][1]==tablero[2][1]&&tablero[2][1]!='-'){
            ganador=tablero[2][1];
        }
        return ganador;
    }

}
