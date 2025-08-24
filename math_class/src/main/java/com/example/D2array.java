package com.example;

public class D2array {
    public static void main(String[] args) {
        int[][] array ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i =0; i< array.length;i++){
            System.out.println("");
            for(int j=0;j < array[i].length;j++){
                System.out.print(array[i][j]);
            }
        }

        
        System.out.println("");
        System.out.print("\nJunção: ");

        int[] array9 ={10,11,12};
        int[] array10 ={13,14,15};

        int[][] arrayJ = {array9,array10};

       for(int[] numeros : arrayJ){
            System.out.println("");
            for(int numero : numeros){
                System.out.print(numero+" ");
            }
       }
    }
}
