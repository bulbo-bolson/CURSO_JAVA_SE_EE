public class Operadores {
    public static void main (String args[]) {
        int i = 12;
        int j = 10;

        int suma = i + j;
        int resta = i - j;
        int mult = i * j;
        // casting explícito para tener un resultado preciso
        float div = (float)i / j;
        int mod = i % j;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Mult: " + mult);
        System.out.println("Div: " + div);
        System.out.println("Mod: " + mod);

        // autoincremento post y pre
        int num1 = 2;
        int num2 = 2;

        System.out.println("============================");
        System.out.println("autoincremento post y pre");
        System.out.println("num1 vale:" + ++num1); // se evalúa más tarde
        System.out.println("num2 vale:" + num2++); // se evalúa antes
    }
}
