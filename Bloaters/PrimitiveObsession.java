public class PrimitiveObsession {

    // Ejemplo 1
    private String nombre;
    private String telefono;
    private String codigoPostal; 
    private String email;

    public void registrarUsuario(String nombre, String telefono, String cp, String email) {

        if (telefono == null || !telefono.matches("\\d{10}")) {
            throw new IllegalArgumentException("Teléfono inválido (debe tener 10 dígitos)");
        }
        
        if (cp == null || cp.length() != 5) {
            throw new IllegalArgumentException("Código postal inválido");
        }

        if (!email.contains("@")) {
             throw new IllegalArgumentException("Email inválido");
        }

        this.nombre = nombre;
        this.telefono = telefono;
        this.codigoPostal = cp;
        this.email = email;
        
        System.out.println("Usuario guardado.");
    }

    public void enviarSMS(String mensaje) {
        System.out.println("Enviando a " + this.telefono + ": " + mensaje);
    }


    // Ejemplo 2
    public class Pedido {
        // Usar int para estados o categorías
        // 0 = Creado, 1 = Pagado, 2 = Enviado
        // 3 = Entregado, 99 = Cancelado
        private int estado; 
        private double monto;

        public Pedido(double monto) {
            this.monto = monto;
            this.estado = 0; // Inicia en Creado
        }

        public void actualizarEstado(int nuevoEstado) {
            // Lógica confusa basada en números arbitrarios
            if (nuevoEstado == 2 && this.estado == 0) {
                System.out.println("Error: No puedes enviar (2) un pedido sin pagar (1) antes.");
                return;
            }

            // Nada impide que alguien pase un número que no existe
            if (nuevoEstado == 500) {
                System.out.println("¿Qué estado es 500?"); // Bug potencial
            }

            this.estado = nuevoEstado;
        }

        public boolean esCancelable() {
            // Tienes que recordar que 2 es "Enviado" y 3 es "Entregado"
            return this.estado < 2; 
        }
    }

}