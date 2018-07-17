public class Ejemplo {
    byte miByteValorMin = -128; // un byte utiliza 8bits
    byte miByteValorMax = 127;

    short miShortValorMin = -32768; // un short utiliza 16 bits
    short miShortValorMax = 32767;

    int miIntValorMin = -2147483648; // un int utiliza 32 bits
    int miIntValorMax = 2147483647;

    public static void main(String args[]) {
        Ejemplo ejem = new Ejemplo();
        ejem.mostrarInformacion();
    }

    public void mostrarInformacion() {
        System.out.println("Valor minimo de un byte: " + miByteValorMin + " valor maximo: " + miByteValorMax);
        System.out.println("Valor minimo de un short: " + miShortValorMin + " valor maximo: " + miShortValorMax);
        System.out.println("Valor minimo de un int: " + miIntValorMin + " valor maximo: " + miIntValorMax);
    }
}
