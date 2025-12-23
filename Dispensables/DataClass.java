package Dispensables;

public class DataClass {
    
    // Ejemplo 1
    public class UsuarioData {
        private String nombre;
        private String email;

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        
        // Faltan métodos que manejen la lógica del usuario
    }

    // Ejemplo 2
    public class ProductoData {
        private String nombre;
        private double precio;

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        
        public double getPrecio() { return precio; }
        public void setPrecio(double precio) { this.precio = precio; }
        
        // Faltan métodos que manejen la lógica del producto
    }
    
}
