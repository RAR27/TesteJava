package org.example;

public class Main {
    public static void main(String[] args) {

        String primeiroNome = "Romulo";
        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Reultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}