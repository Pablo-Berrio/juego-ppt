package org.example;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        String idioma;
        Byte numeroDia;

        System.out.println("BIENVENIDO");
        System.out.println("ESCRIBE TU IDIOMA DE PREFERENCIA PARA INTERACTUAR CON LA APP");
        System.out.println("ES--Español");
        System.out.println("EN--English");

        idioma=entradaTeclado.nextLine().toUpperCase();

        switch (idioma){
            case "ES":
                System.out.println("Digita el dia de la semana: ");
                numeroDia=entradaTeclado.nextByte();
                switch (numeroDia){
                    case 1:
                        System.out.println("El dia es Lunes");
                        break;
                    case 2:
                        System.out.println("El dia es Martes");
                        break;
                    case 3:
                        System.out.println("El dia es Miercoles");
                        break;
                    case 4:
                        System.out.println("El dia es Jueves");
                        break;
                    case 5:
                        System.out.println("El dia es Viernes");
                        break;
                    case 6:
                        System.out.println("El dia es Sabado");
                        break;
                    case 7:
                        System.out.println("El dia es Domingo");
                        break;
                    default:
                        System.out.println("El numero de dia ingresado no existe");
                }
            case "EN":
                System.out.println("enter the day of the week");
                numeroDia= entradaTeclado.nextByte();
                switch (numeroDia){
                    case 1:
                        System.out.println("The day is Monday");
                        break;
                    case 2:
                        System.out.println("The day is Tuesday");
                        break;
                    case 3:
                        System.out.println("The day is Wednesday");
                        break;
                    case 4:
                        System.out.println("The day is Thursday");
                        break;
                    case 5:
                        System.out.println("The day is Friday");
                        break;
                    case 6:
                        System.out.println("The day is Saturday");
                        break;
                    case 7:
                        System.out.println("The day is Sunday");
                        break;
                    default:
                        System.out.println("The day number entered does not exist");
                }
        }




    }
}
