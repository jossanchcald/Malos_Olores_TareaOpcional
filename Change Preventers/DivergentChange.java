
public class DivergentChange {
    
    // Ejemplo 1
    public class Producto {
        private String nombre;
        private double precio;
        
        public double obtenerPrecioFinal() {
            return precio * 1.15;
        }

        
        public void guardarEnBaseDeDatos() {
            String sql = "INSERT INTO productos VALUES ('" + nombre + "')";
            System.out.println("Ejecutando SQL: " + sql);
        }

        
        public String generarHTML() {
            return "<div class='card'><h1>" + nombre + "</h1></div>";
        }
    }

    // Ejemplo 2
    public class GestorUsuarios {
        
        public void cambiarPassword(String userId, String nuevoPass) {
            String hash = "ENCRIPTADO_" + nuevoPass;
            // guardar en DB...
        }

        
        public void enviarBienvenida(String email) {
            String asunto = "¡Bienvenido!";
            String cuerpo = "Hola, gracias por unirte a nuestra plataforma...";
            // Lógica de envío de email...
            System.out.println("Enviando correo a " + email);
        }
    }

}
