public class conversionCasting {
    public static void main(String args[]) {
        /*
        int a = 1;
        double b= 2.5;
        // casting implícito, un int cabe en un double
        b=a;
        System.out.println("El valor de un double es:" + b);
        */

        // ejemplo 1 de casting explícito
        int a = 1;
        double b= 2.5;
        // casting explícito, un double no cabe en un int
        a=(int)b;
        System.out.println("El valor del double a es:" + b);

        // ejemplo 2 de casting explícito
        int codigo = 97;
        // casting explícito, un int no cabe en un char
        char codigoASCII = (char)codigo;
        System.out.println("El valor del char codigoASCII es:" + codigoASCII);

    }
}
