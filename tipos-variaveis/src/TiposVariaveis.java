public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //tipos primitivos
        //estudar classe String que representa textos na aplicação

        String meuNome = "Marcelli Araujo";
        System.out.println(meuNome);
        
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
