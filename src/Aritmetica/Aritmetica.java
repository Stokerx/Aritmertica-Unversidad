package Aritmetica;

public class Aritmetica {

    //Atriburos de la claSe
    int a;
    int b;

    //metodos

    public void sumar(){
       int resultado = a + b;
       int nomb = a - b;
        System.out.println("resultado= " + resultado);

    }
    public int sumarConRetorno(){
       // int resultado = a + b;
        //return resultado;
        return a+b;
    }

    public int aargumentoRetornos(int arg1 , int arg2){
        a = arg1;
        b = arg2;
        return a + b;
    }
}

