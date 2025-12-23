
public class IncompleteLibraryClass {
    
    // Ejemplo 1
    // Este es el código de la librería externa que no se puede modificar
    class FechaLegacy { 
        public int dia;
        public int mes;
        public int anio;

        public FechaLegacy(int d, int m, int a) {
            this.dia = d; this.mes = m; this.anio = a;
        }
    }

    // Este es nuestro código
    public class AgendaApp {

        public void planificarReunion() {
            FechaLegacy hoy = new FechaLegacy(22, 12, 2025);
            
            // Si quisieramos saber la fecha de mañana, la libreria no tiene forma de indicarlo
            // ASi que nos toca hacer el método nosotros mismos
            
            FechaLegacy manana = obtenerSiguienteDia(hoy);
            
            System.out.println("Reunión movida al: " + manana.dia + "/" + manana.mes);
        }

        // Este es el metodo adicional
        private FechaLegacy obtenerSiguienteDia(FechaLegacy f) {
            int d = f.dia + 1;
            int m = f.mes;
            int a = f.anio;
            if (d > 30) {
                d = 1;
                m++;
            }
            return new FechaLegacy(d, m, a);
        }
    }

    // Ejemplo 2
    // Este es el código de la librería externa que no se puede modificar
    class TextoLib {
        private String contenido;
        public TextoLib(String c) { this.contenido = c; }
        public String getRaw() { return contenido; }
        // Falta método para limpiar el texto...
    }

    // Este es nuestro código
    public class ControladorUsuario {

        public void registrarUsuario(TextoLib nombreUsuario) {
            
            // La librería debería saber limpiarse a sí misma, pero no lo hace
            // Asi q nos toca crear ese metodo nosotros mismos
            
            String procesado = nombreUsuario.getRaw();
            
            if (procesado != null) {
                procesado = procesado.trim();
                procesado = procesado.toLowerCase();
                procesado = procesado.replace(" ", "_");
            }
            
            System.out.println("Guardando usuario: " + procesado);
        }
        
    }
}
