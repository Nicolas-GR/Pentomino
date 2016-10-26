package ui;

import data.Board;
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
    private static Scanner lector = new Scanner(System.in);
    
    
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Interacciones con el Usuario__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static Object getEntry() {
        Object entry = lector.nextLine();
        return entry;
    }
    
    
    
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Imprimir Objetos__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    
    public static void printBoard(Board board){
        System.out.println(board);
    }
    
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Menús de Juego__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void printMainMenu() {
        System.out.println("Qué desea hacer:");
        System.out.println("1. □ Jugar");
        System.out.println("2. □ Instrucciones");
        System.out.println("3. □ Créditos");
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
    
    
    

    public static void printWelcome() {
        System.out.println(welcome);
    }

}
