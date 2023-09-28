public class TiposVariaveis {
    public static void main(String[] args) throws Exception {


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        System.out.print(numero);
        System.out.print(numeroCurto2);


        final double VALOR_DE_PI = 3.14;

        System.out.print(VALOR_DE_PI);
    }
}
