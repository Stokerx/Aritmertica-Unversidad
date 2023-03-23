package Aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3; // agregamos datos
        aritmetica1.b = 2; // agregamos datoswa

        aritmetica1.sumar();

        var resultado = aritmetica1.sumarConRetorno();

        System.out.println("resultado desde la clase de prueba retorno " + resultado);

       resultado = aritmetica1.aargumentoRetornos(5 , 8);

        System.out.println("resultado = " + resultado);


    }
}
