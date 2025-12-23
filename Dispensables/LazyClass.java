package Dispensables;

public class LazyClass {
    
    // Ejemplo 1 
    class Direccion {
        public String getCalle() { return "Av. Principal"; }
    }

    // Lazu Class que solo llama a otra
    class GestorDireccion {
        private Direccion dir = new Direccion();

        public String obtenerCalle() {
            return dir.getCalle();
        }
    }

    // Ejemplo 2
    class Calculadora {
        public int sumar(int a, int b) {
            return a + b;
        }
    }
}
