
public class ShotgunSurgery {
    
    // Ejemplo 1
    // Se quiere cambiar el formato de los logs del sistema.
    // Como no hay una clase centralizada para esto, tienes que ir archivo por archivo.
    // Archivo 1
    class ServicioLogin {
        void login() {
            System.out.println("INFO: Usuario logueado"); 
        }
    }

    // Archivo 2
    class ServicioPagos {
        void procesar() {
            System.out.println("INFO: Pago procesado");
        }
    }

    // Archivo 3
    class ServicioReportes {
        void generar() {
            System.out.println("INFO: Reporte creado");
        }
    }

    // Ejemplo 2
    // La regla actual es IVA = 12%. 
    // Si la ley cambia y el IVA es ahora 21%, tienes que buscar y editar esa condición en múltiples clases.
    // Clase 1
    class ModuloVentas {
        public void venderProducto(double precioBase) {
            double total = precioBase + (precioBase * 0.12); 
            System.out.println("Venta procesada por: " + total);
        }
    }

    // Clase 2
    class ModuloAuditoria {
        public boolean verificarFactura(double subtotal, double totalCobrado) {
            double calculoEsperado = subtotal + (subtotal * 0.12);
            
            return Math.abs(calculoEsperado - totalCobrado) < 0.01;
        }
    }
}
