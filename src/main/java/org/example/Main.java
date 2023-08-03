package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);
        Random generador=new Random();

        String opcionHumano, opcionPc;

        System.out.println("JUEGO DE PIEDRA PAPEL O TIJERA");
        System.out.println("ELIJE ENTRE LAS SIGUIENTES TRES OPCIONES: (escribe tu eleccion)");
        System.out.println("PIEDRA");
        System.out.println("PAPEL");
        System.out.println("TIJERA");
        System.out.println("****************************************************************");
        opcionHumano=entradaTeclado.nextLine().toUpperCase();

        //GENERANDO NUMEROS ALEATORIOS ENTRE EL 1 Y EL 3
        Integer numeroAleatorio= generador.nextInt(3)+1;
        //System.out.println(numeroAleatorio);

        //OBTENIENDO LA OPCION DEL PC
        switch (numeroAleatorio){
            case 1:
                opcionPc="PIEDRA";
                break;
            case 2:
                opcionPc="PAPEL";
                break;
            case 3:
                opcionPc="TIJERA";
                break;
            default:
                opcionPc=null;
        }
        System.out.println("la opcion del pc es: "+opcionPc);

        //COMPARANDO LA OPCION HUMANO CON OPCION PC
        if (opcionPc.equalsIgnoreCase(opcionHumano)){
            System.out.println("EMPATE");

        } else if (opcionPc.equals("PIEDRA")&&opcionHumano.equals("PAPEL")) {
            System.out.println("GANA EL HUMANO");

        } else if (opcionPc.equals("PIEDRA")&&opcionHumano.equals("TIJERA")) {
            System.out.println("GANA EL PC");

        }else if (opcionPc.equals("PAPEL")&&opcionHumano.equals("PIEDRA")) {
            System.out.println("GANA EL PC");

        }else if (opcionPc.equals("PAPEL")&&opcionHumano.equals("TIJERA")) {
            System.out.println("GANA EL HUMANO");

        }else if (opcionPc.equals("TIJERA")&&opcionHumano.equals("PIEDRA")) {
            System.out.println("GANA EL HUMANO");

        } else if (opcionPc.equals("TIJERA")&&opcionHumano.equals("PAPEL")) {
            System.out.println("GANA EL PC");
        }

    }
}