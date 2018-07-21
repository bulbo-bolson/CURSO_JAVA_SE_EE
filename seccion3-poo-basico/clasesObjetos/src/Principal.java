public class Principal {
    public static void main(String args[]) {
        // Instanciamos la clase
        Persona p1 = new Persona("Juan", "Perez", 22, "Masculino");
        System.out.println(p1.regresaNombre());
        System.out.println(p1.regresaApellido());
        System.out.println(p1.regresaEdad());
        System.out.println(p1.regresaGenero());

        p1.asignaApellido("Perez 2");
        System.out.println("=======================");
        System.out.println(p1.regresaNombre());
        System.out.println(p1.regresaApellido());
        System.out.println(p1.regresaEdad());
        System.out.println(p1.regresaGenero());

        Persona p2 = new Persona("María", "Hernández", 30, "Femenino");
        System.out.println("=======================");
        System.out.println(p2.regresaNombre());
        System.out.println(p2.regresaApellido());
        System.out.println(p2.regresaEdad());
        System.out.println(p2.regresaGenero());

        // aquí lo que hacemos es apuntar a la misma referncia
        p1 = p2;
        // si modificamos uno, ambos cambian
        p2.asignaApellido("Maruenda");
        System.out.println("=======================");
        System.out.println("p1.apellido = " + p1.regresaApellido());
        System.out.println("p2.apellido = " + p2.regresaApellido());

    }
}
