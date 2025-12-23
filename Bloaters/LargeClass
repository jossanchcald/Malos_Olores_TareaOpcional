public class LargeClass {

    // Ejemplo 1
    public class JugadorRPG {

        // Mucha lógica mezclada
        private int vida;
        private int nivel;
        private int experiencia;
        private String nombre;

        private int coordenadaX;
        private int coordenadaY;
        private String texturaSprite;
        private int frameAnimacionActual;

        private String sonidoPasos;
        private String sonidoAtaque;
        private float volumen;

        private String rutaArchivoGuardado;
        private long ultimoGuardadoTimestamp;


        public void atacar() {
            this.experiencia += 10;
            reproducirSonido(sonidoAtaque);
        }

        public void dibujar() {
            System.out.println("Dibujando sprite en " + coordenadaX + "," + coordenadaY);
        }

        public void mover(int deltaX, int deltaY) {
            this.coordenadaX += deltaX;
            this.coordenadaY += deltaY;
            if (deltaX != 0) reproducirSonido(sonidoPasos);
        }

        public void guardarPartida() {
            // Código para escribir en disco duro
            System.out.println("Guardando stats en " + rutaArchivoGuardado);
        }
        
        // 50 métodos más aquí para cada aspecto ...
    }


    // Ejemplo 2
    public class HotelManager {

        private List<String> reservasActivas = new ArrayList<>();
        private List<String> inventarioCocina = new ArrayList<>();
        private List<String> personalLimpieza = new ArrayList<>();
        private double dineroEnCaja;

        public void crearReserva(String cliente, Date fecha) {
            if (fecha.before(new Date())) {
                throw new RuntimeException("Fecha inválida");
            }
            reservasActivas.add(cliente);
            cobrarAnticipo(cliente);
        }

        public void cancelarReserva(String cliente) {
            reservasActivas.remove(cliente);
        }

        public void pedirIngredientes(String ingrediente, int cantidad) {
            if (dineroEnCaja < 100) {
                System.out.println("No hay dinero para comprar comida");
                return;
            }
            inventarioCocina.add(ingrediente);
            dineroEnCaja -= 50; 
        }

        public void cocinarMenuDelDia() {
            if (inventarioCocina.isEmpty()) {
                System.out.println("No hay comida");
            } else {
                System.out.println("Cocinando...");
            }
        }

        public void asignarLimpieza(int numeroHabitacion, String empleado) {
            if (!personalLimpieza.contains(empleado)) {
                System.out.println("Ese empleado no existe");
            }
            System.out.println("Limpiando habitación " + numeroHabitacion);
        }

        public void repararAireAcondicionado(int piso) {
            // Lógica técnica de mantenimiento
        }
        
        private void cobrarAnticipo(String cliente) {
            dineroEnCaja += 100;
        }
    }
}