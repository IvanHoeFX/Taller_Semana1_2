public class Caso2 {

    // Clase Persona (definida dentro del mismo archivo)
    static class Persona {

        // Atributos
        private String nombre;
        private int edad;

        // Constructor
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Método para mostrar datos
        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("-----------------------");
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }

    // Método principal
    public static void main(String[] args) {

        // Crear objetos
        Persona persona1 = new Persona("Carlos", 25);
        Persona persona2 = new Persona("María", 30);

        // Mostrar datos
        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}