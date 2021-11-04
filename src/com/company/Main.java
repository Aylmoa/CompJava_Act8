package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Deck ola= new Deck();
    ola.mostrar();

        try {
            elegir(ola);
        } catch ( java.lang.IndexOutOfBoundsException e) {
            System.out.println("Se acabaron las cartas del deck");
        }
        System.out.println("Buen dia!");
    }

    public static void elegir(Deck mazo) throws Exception {
        Scanner sc= new Scanner(System.in);
        String cont="";
        //System.out.println("***Para salir introduzca cualquier otro numero que no este establecido***");
        do{
            System.out.println("Porfavor escoga que quiere hacer\n1= Mezclar maso. 2= sacar la primera carta." +
                    "3= Sacar una carta al azar. 4= Repartir 5 cartas. 0= Salir");
            int eleccion= Integer.parseInt(sc.next());
        switch (eleccion){
            case 1:
                mazo.Shuffle();
                break;
            case 2:
                mazo.head();
                break;
            case 3:
                mazo.pick();
                break;
            case 4:
                mazo.hand();
                break;
            case 0:
                cont="n";
            default:
                System.out.println("Opción Invalida, vuelva a escoger");
                break;
        }
        }while(cont.equals(""));
    }
}
