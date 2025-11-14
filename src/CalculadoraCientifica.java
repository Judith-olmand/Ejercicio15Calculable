public class CalculadoraCientifica implements Calculable{
    int a;
    int b;
    int opcion;

    public CalculadoraCientifica(int a, int b, int opcion){
        this.a = a;
        this.b = b;
        this.opcion = opcion;
    }

    @Override
    public double calcular() {
        switch (opcion) {
            case 1:
                return Math.pow(a, b);
            case 2:
                return  Math.sqrt(a);
            default:
                return 0;
        }
    }
}
