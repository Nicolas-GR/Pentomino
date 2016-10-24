package ui;

import java.util.Scanner;

public class Ui {
    
    
    public static Object getEntry(){
        Scanner lector = new Scanner(System.in);
        Object entry = lector.nextLine();
        return entry;
    }


    
    public static void printMainMenu(){
        System.out.println("Qué desea hacer:");
        System.out.println("1. □ Jugar");
        System.out.println("2. □ Instrucciones");
        System.out.println("3. □ Créditos");
    }
    
    public static void printPlayMenu(){
        System.out.println("Elija una Opción:");
        System.out.println("1. □ Tablero Rectangular 5x7");
        System.out.println("2. □ Tablero Rectangular 5x9");
        System.out.println("3. □ Tablero Rectangular 5x10");
    }
    
    
    public static void printObject(Object cadena) {
         System.out.println(cadena);
        
    }
    
    
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%___Bienvenida__%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        
    static String welcome = 
"  ▄███████▄    ▄████████ ███▄▄▄▄       ███      ▄██████▄    ▄▄▄▄███▄▄▄▄    ▄█  ███▄▄▄▄    ▄██████▄  \n" +
"  ███    ███   ███    ███ ███▀▀▀██▄ ▀█████████▄ ███    ███ ▄██▀▀▀███▀▀▀██▄ ███  ███▀▀▀██▄ ███    ███ \n" +
"  ███    ███   ███    █▀  ███   ███    ▀███▀▀██ ███    ███ ███   ███   ███ ███▌ ███   ███ ███    ███ \n" +
"  ███    ███  ▄███▄▄▄     ███   ███     ███   ▀ ███    ███ ███   ███   ███ ███▌ ███   ███ ███    ███ \n" +
"▀█████████▀  ▀▀███▀▀▀     ███   ███     ███     ███    ███ ███   ███   ███ ███▌ ███   ███ ███    ███ \n" +
"  ███          ███    █▄  ███   ███     ███     ███    ███ ███   ███   ███ ███  ███   ███ ███    ███ \n" +
"  ███          ███    ███ ███   ███     ███     ███    ███ ███   ███   ███ ███  ███   ███ ███    ███ \n" +
" ▄████▀        ██████████  ▀█   █▀     ▄████▀    ▀██████▀   ▀█   ███   █▀  █▀    ▀█   █▀   ▀██████▀  \n" +
"                                                                                                   ";
   
    
    public static void printWelcome(){
        System.out.println(welcome);
    }

}
