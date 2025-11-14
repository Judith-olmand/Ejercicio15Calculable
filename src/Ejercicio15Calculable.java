public class Ejercicio15Calculable {
    public static void main(String[] args) {

        CalculadoraBasica calculadora1 = new CalculadoraBasica(2,3,1);
        System.out.println("La suma es de " + calculadora1.calcular());

        CalculadoraBasica calculadora2 = new CalculadoraBasica(18,3,2);
        System.out.println("La resta es de " + calculadora2.calcular());

        CalculadoraCientifica calculadora3 = new CalculadoraCientifica(2,3,1);
        System.out.println("La potencia es de " + calculadora3.calcular());

        CalculadoraCientifica calculadora4 = new CalculadoraCientifica(9,1,2);
        System.out.println("La raiz cuadrada es de " + calculadora4.calcular());

    }
}