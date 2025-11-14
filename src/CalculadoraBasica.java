public class CalculadoraBasica implements Calculable{
    int a;
    int b;
    int opcion;

    public CalculadoraBasica(int a, int b, int opcion){
        this.a = a;
        this.b = b;
        this.opcion = opcion;
    }

    @Override
    public double calcular() {
        switch (opcion) {
            case 1:
                return a+b;
            case 2:
                return  a-b;
            default:
                return 0;
        }
    }
}