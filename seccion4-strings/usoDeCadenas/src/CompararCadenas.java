public class CompararCadenas {
    public void comparandoStrings() {
        String nombre = "Juan";
        if (nombre.equals("Juan")) {
            System.out.println("Si corresponde al nombre");
        }

        nombre = "";
        if (nombre.isEmpty()) {
            System.out.println("La cadena está vacía");
        }

        nombre = "JUAN MANUEL PEREZ ARELLANO";

        if (nombre.startsWith("JUAN")) {
            System.out.println("El nombre de la persona comienza con la palabra JUAN");
        }

        if (nombre.endsWith("ARELLANO")) {
            System.out.println("El APELLIDO de la persona termina con ARELLANO");
        }

        // tamaño de una cadena
        String miCadena = "este es mi primer curso de Java";
        int lenght = miCadena.length();
        System.out.println("El tamaño de mi cadena es:" + lenght);

        // buscar una subcadena en cadena
        String cadenaBuscada = "mi";
        // retorna el índice de la primera ocurrencia o -1 si no la encuentra
        int indice = miCadena.indexOf(cadenaBuscada);
        System.out.println("La posición donde se encontró mi cadena fue: " + indice);

        char caracter = miCadena.charAt(2);
        System.out.println("El caracter en la posicón 2 es:" + caracter);

        // limpiar cadenas con espacios
        String cadenaConEspacios = "    esta es una cadena con espacios   ";
        System.out.println(cadenaConEspacios.trim());

        // extraer subcadena
        String numCta = "7987 6466 6546 6566";
        String cuatroUltimCaracteres = numCta.substring(15, 19);
        System.out.println(cuatroUltimCaracteres);

    }
}
