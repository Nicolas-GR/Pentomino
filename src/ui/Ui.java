package ui;

import business.Engine;
import data.Board;
import data.Piece;
import java.util.Scanner;

public class Ui {

    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Lista de Piezas__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    private static String piecesList = " OO\t  ###\t  @  \t  *  \t   × \t  øø \t  ¤ \t   ®\t   ©\t  ¢ ¢\t  QQ\t  ±\n"
            + "OO \t   # \t  @  \t  ** \t  ×××\t   ø \t  ¤ \t  ®®\t  ©©\t  ¢¢¢\t  QQ\t  ±\n"
            + " O \t   # \t  @@@\t   **\t   × \t   øø\t  ¤ \t   ®\t  © \t     \t  Q \t  ±\n"
            + "   \t     \t     \t     \t     \t     \t  ¤¤\t   ®\t  © \t     \t    \t  ±\n"
            + "   \t     \t     \t     \t     \t     \t    \t    \t    \t     \t    \t  ±\n"
            + "\n";

    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Bienvenida__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    private static String welcome
            = "  ▄███████▄    ▄████████ ███▄▄▄▄       ███      ▄██████▄    ▄▄▄▄███▄▄▄▄    ▄█  ███▄▄▄▄    ▄██████▄  \n"
            + "  ███    ███   ███    ███ ███▀▀▀██▄ ▀█████████▄ ███    ███ ▄██▀▀▀███▀▀▀██▄ ███  ███▀▀▀██▄ ███    ███ \n"
            + "  ███    ███   ███    █▀  ███   ███    ▀███▀▀██ ███    ███ ███   ███   ███ ███▌ ███   ███ ███    ███ \n"
            + "  ███    ███  ▄███▄▄▄     ███   ███     ███   ▀ ███    ███ ███   ███   ███ ███▌ ███   ███ ███    ███ \n"
            + "▀█████████▀  ▀▀███▀▀▀     ███   ███     ███     ███    ███ ███   ███   ███ ███▌ ███   ███ ███    ███ \n"
            + "  ███          ███    █▄  ███   ███     ███     ███    ███ ███   ███   ███ ███  ███   ███ ███    ███ \n"
            + "  ███          ███    ███ ███   ███     ███     ███    ███ ███   ███   ███ ███  ███   ███ ███    ███ \n"
            + " ▄████▀        ██████████  ▀█   █▀     ▄████▀    ▀██████▀   ▀█   ███   █▀  █▀    ▀█   █▀   ▀██████▀  \n"
            + "                                                                                                   ";
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Bienvenida__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    private static String instrucciones = "Instrucciones :v";
    private static String creditos = "Este Programa fue desarrollado por:\n"
            + "Nicolás Guerrero Rondón.\n"
            + "email : nguerreror@unal.edu.co.\n"
            + "git  : https://github.com/Nicolas-GR.";
    

    private static Scanner lector = new Scanner(System.in);

    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Interacciones con el Usuario__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static Object getEntry() {
        Object entry = lector.nextLine();
        return entry;
    }

    public static void printCredits() {
        System.out.println(creditos);
        lector.nextLine();
    }

    public static void printInstructions() {
        System.out.println(instrucciones);
    }

    public static void printCongratulations(Board board) {
        System.out.println("Felicitaciones acaba de resolver el tablero de" + board.getRowDimension() + "x" + board.getColDimension());
    }
    
    public static void printBye(){
        System.out.println("¿Seguro que quiere salir?");
        String entry = lector.nextLine().toLowerCase();
        if (entry.equals("yes") || entry.equals("y") || entry.equals("si") || entry.equals("sí") || entry.equals("s")){
            System.out.println("Vemola prro");
            Engine.exit();
        }else if (entry.equals("no") || entry.equals("n") || entry.equals("nel") || entry.equals("nel prro") ){
            System.out.println("Buena :v");
            Engine.keepGoing();
        }else {
            error();
        }
        
    }

    public static void error() {
        System.out.println("Error, entrada inválida.");
    }

    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Imprimir Objetos__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void printBoard(Board board) {
        System.out.println(board);
    }

    public static void printPiece(Piece piece) {
        System.out.println(piece);
    }

    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Menús de Juego__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void printMainMenu() {
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. □ Jugar");
        System.out.println("2. □ Instrucciones");
        System.out.println("3. □ Créditos");
        System.out.println("4. □ Salir");

    }

    public static void printBoardMenu() {
        System.out.println("Elija una Opción:");
        System.out.println("1. □ Tablero Rectangular 5x7");
        System.out.println("2. □ Tablero Rectangular 5x9");
        System.out.println("3. □ Tablero Rectangular 5x10");
    }

    public static void printPieceMenu() {
        System.out.println("Elija una Opción:");

        System.out.println("");
        System.out.print(piecesList);
        System.out.print("1. F\t  2. T\t  3. V\t  4. W\t  5. X\t  6. Z\t  7. L\t  8. Y\t  9. N\t 10. U\t 11. P\t 12. I\n");

    }

    public static void printPieceOptions() {
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. □ Ubicar");
        System.out.println("2. □ Reubicar");
        System.out.println("3. □ Rotar");
        System.out.println("4. □ Reflejar");

    }

    public static void printWelcome() {
        System.out.println(welcome);
    }

}
