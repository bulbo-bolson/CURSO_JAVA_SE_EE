public class HabilidadesBasicasString {
    public void mostrarCadenas() {
        String mensaje1 = "Entrada de datos o cadena válida";
        String mensaje2 = "";
        String mensaje3 = null;
        mensaje1 += " esta es una concatenación";
        System.out.println(mensaje1);
        System.out.println(mensaje2);
        System.out.println(mensaje3);

        // Uniendo Strings
        String nombre = "Juan";
        String apellido = "Pérez";
        String nombreCompleto = nombre + apellido;
        System.out.println(nombreCompleto);

        // Concatenación de cadenas y números
        double precio = 100.60;
        String mensaje = "Precio: " + precio;
        System.out.println(mensaje);

        /* Caracteres especiales en Strings
        \n nueva línea
        \t tabulación
        \r retorno de carr comillas
        \\ backslash
        \
         */
        String caracterEspecial;
        caracterEspecial = "CODIGO: JSP\nPrecio: $50.00";
        System.out.println(caracterEspecial);
    }
}
