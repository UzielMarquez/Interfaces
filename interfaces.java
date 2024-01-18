public class interfaces implements aritmeticos {

    public static void main(String[] args) {

        interfaces inter = new interfaces();

        System.out.println(inter.suma(1, 6));
        System.out.println(inter.resta(5, 8));
        System.out.println(inter.division(10, 2));
        System.out.println(inter.multiplicacion(5, 7));

    }

    public int suma(int x, int y) {
        return (x + y);
    }

    public int resta(int x, int y) {
        return (x - y);
    }

    public float division(int x, int y) {
        return (x / y);
    }

    public int multiplicacion(int x, int y) {
        return (x * y);
    }

}

interface aritmeticos {
    int suma(int x, int y);

    int resta(int x, int y);

    float division(int x, int y);

    int multiplicacion(int x, int y);

}
