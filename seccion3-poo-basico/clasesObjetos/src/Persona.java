public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    // constructor de la clase, ha de llamarse igual que la clase
    public Persona(String nombreP, String apellidoP, int edadP, String generoP) {
        nombre = nombreP;
        apellido = apellidoP;
        edad = edadP;
        genero = generoP;

    }

    // para modificar los atributes de la clase desde fuera, al ser private, hay que hacerlo
    // declarando un método, ya que solo desde la propia clase se puede manipular
    public void asignaNombre(String nombreP) {
        nombre = nombreP;
    }

    // para modificar los atributes de la clase desde fuera, al ser private, hay que hacerlo
    // declarando un método, ya que solo desde la propia clase se puede manipular
    public String regresaNombre() {
        return nombre;
    }

    public void asignaApellido(String apellidoP) {
        apellido = apellidoP;
    }

    public String regresaApellido() {
        return apellido;
    }

    public void asignaEdad(int edadP) {
        edad = edadP;
    }

    public int regresaEdad() {
        return edad;
    }

    public void asignaGenero(String generoP) {
        genero = generoP;
    }

    public String regresaGenero() {
        return genero;
    }
}
