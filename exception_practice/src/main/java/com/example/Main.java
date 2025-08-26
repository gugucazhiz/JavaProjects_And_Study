package com.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        //test();
    }


    private static void test() throws FileNotFoundException{ //Não fica sublinhado em vermelho
        var stream = new FileOutputStream("");               //porque o throw indica que pode
                                                            //ser lançada essa exceção
                                                            //mas ele não trata a exceção
                                                            //so faz jogar para o metodo acima!
    
                    new Throwable(); //pai de exceptions

                new Exception();  new OutOfMemoryError(); // erros


            new RuntimeException(); new FileNotFoundException();
                //unchecked                //checked

                // Exceções checked são erros detectados em tempo de 
                // compilação e sempre devem ser tratadas. Exceções unchecked 
                // são erros detectados em tempo de execução e podem ou não serem tratadas.
        }
}