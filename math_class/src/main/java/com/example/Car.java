package com.example;

public class Car {
    private String cor;
    private String ano;
    private String modelo;
    static private int numOfCars; //TODOS os objetos vão manter fazer tracking e alteraçoes da mesma variavel
                                  // Como se fosse um Session Scoped compartilhado entre todos;
    
    private int numOfCarros; //Dessa maneira iria mostrar apenas o numero 1, mesmo que houvesse mais de 1 carro;

    public Car(String cor){
        this.cor = cor;
        numOfCars ++;
    }

    public Car(String cor, String ano){
        this.ano = ano;
        this.cor = cor;
        numOfCars ++;
    }

    public Car(String cor, String ano,String modelo){
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        numOfCars ++;
    }

    public String comprarCarro(){
        if(this.cor.isBlank()){
            return "Nenhum Carro Cadastrado Para Compra.";
        }
        else{
            return "Modelo: "+this.modelo +"\n"+
                   "Ano: "+ this.ano + "\n"+
                   "Cor: "+this.cor + "\n";
        }
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getAno(){
        return this.ano;
    }
    public String getCor(){
        return this.cor;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getnumOfCars(){
        return this.numOfCars;
    }
}
