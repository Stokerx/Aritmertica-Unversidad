package Aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3; // agregamos datos
        aritmetica1.b = 2; // agregamos datoswa

        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();

        System.out.println("resultado desde la clase de prueba retorno " + resultado);


    }
}
