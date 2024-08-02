package org.example;

import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {

        Scanner resultado = new Scanner(System.in);
        System.out.print("Digite sua média: ");
        int mediaFinal = resultado.nextInt();

        if(mediaFinal<6) {
            System.out.println("REPROVADO"); }

        else if (mediaFinal==6) {
            System.out.println("PROVA MINERVA"); }

        else {
         System.out.println("APROVADO"); }
    }
}
