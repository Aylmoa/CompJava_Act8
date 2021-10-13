package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
     private ArrayList<Card>cartas= new ArrayList<Card>();

    public Deck(){
    Crear();
    }

    private void Crear(){//Codigo que crea el mazo de cartas de acuerdo a las reglas del poker
        for (int i = 0; i < 2; i++) {
            String color="Rojo";
                if(i==1){color="Negro";}
            for (int j = 0; j < 2; j++) {
                for (int k = 1; k < 14; k++) {
                    String palo="Corazón";
                    if(i==0 && j==1){palo="Diamante";}else
                    if(i==1 && j==0){palo="Tréboles";}else
                    if(i==1 && j==1){palo="Picas";}

                    switch (k)
                    {case 1:
                            Card Carta= new Card(palo,color,"A");
                            cartas.add(Carta);
                        break;
                        case 11:
                             Carta= new Card(palo,color,"J");
                            cartas.add(Carta);
                        break;
                        case 12:
                            Carta= new Card(palo,color,"Q");
                            cartas.add(Carta);
                        break;
                        case 13:
                            Carta= new Card(palo,color,"K");
                            cartas.add(Carta);
                        break;
                        default:
                            Carta= new Card(palo,color,String.valueOf(k));
                            cartas.add(Carta);
                            break;
                    }
                }
            }
        }
    }
    public void mostrar(){//Demuestra todas las cartas
        for (int i = 0; i < cartas.size(); i++) {
            AssistShow(i);
        }
    }
    public void Shuffle(){//Revuelve el mazo
        Collections.shuffle(cartas);
        System.out.println("Se mezclo el deck");
    }
    public void head(){//Saca y muestra la primera carta del mazo
        AssistShow(0);
        cartas.remove(0);
        System.out.println("Quedan "+cartas.size()+ " cartas en el Deck");
    }
    public void pick(){//Saca una carta al ázar
        Random ra = new Random();
        int num= ra.nextInt(cartas.size());
        AssistShow(num);
        cartas.remove(num);
        System.out.println("Quedan "+cartas.size()+ " cartas en el Deck");
    }
    public ArrayList  hand(){//Saca las primeras 5 cartas
        ArrayList<Card> Cartas= new ArrayList();
        for (int i = 0; i < 5; i++) {
            AssistShow(i);
            Cartas.add(cartas.get(i));
        }
        for (int i = 0; i <5 ; i++) {
            cartas.remove(i);
        }
        System.out.println("Quedan "+cartas.size()+ " cartas en el Deck");
    return Cartas;
    }
    private void AssistShow(int nume){//Imprime la carta con el formato que indica la actividad
        System.out.println("{"+cartas.get(nume).palo+"}"+"{"+cartas.get(nume).color
                +"}"+"{"+cartas.get(nume).valor+"}");
    }
}
