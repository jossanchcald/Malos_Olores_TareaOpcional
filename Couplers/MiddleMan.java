package Couplers;

public class MiddleMan {
    
    // Ejemplo 1
    class Experto {
        public void escribirCodigo() { System.out.println("Escribiendo Java..."); }
        public void diseñarBD() { System.out.println("Diseñando SQL..."); }
    }

    class Asistente {
        private Experto experto = new Experto();

        // Solo delega.
        public void pedirCodigo() {
            experto.escribirCodigo();
        }

        public void pedirDiseño() {
            experto.diseñarBD();
        }
    }

    class Jefe {
        public void trabajar() {
            Asistente a = new Asistente();
            a.pedirCodigo(); // Llamada indirecta innecesaria
        }
    }


    // Ejemplo 2
    class Almacen {
        public void guardar(String item) { System.out.println("Guardado " + item); }
        public String sacar(String item) { return item; }
    }

    class GestorInventario {
        private Almacen almacen = new Almacen();

        // Solo pasa la llamada.
        public void guardarItem(String item) {
            almacen.guardar(item);
        }

        public String obtenerItem(String item) {
            return almacen.sacar(item);
        }
    }
}
