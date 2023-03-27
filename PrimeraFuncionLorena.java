
public class PrimeraFuncionLorena {
    public static void main(String[] args) {
        int resultado1, resultado2;

        resultado1 = suma(10, 20);
        resultado2 = suma(4, 5);

        System.out.println("Resultado suma 1: " + resultado1);
        System.out.println("Resultado suma 2: " + resultado2);
    }
    private static int suma (int numero1, int numero2) {
        int suma;
        suma = numero1 + numero2;
        return suma;
    }
}
