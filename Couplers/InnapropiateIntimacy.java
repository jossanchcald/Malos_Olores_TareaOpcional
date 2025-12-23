package Couplers;

import java.util.ArrayList;
import java.util.List;

public class InnapropiateIntimacy {

    // Ejemplo 1
    class CajaRegistradora {
        // Debería ser privada
        public List<Double> transacciones = new ArrayList<>();
    }

    class Supermercado {
        public void cerrarDia(CajaRegistradora caja) {
            double total = 0;
            
            //Accede directamente a la colección interna.
            for (int i = 0; i < caja.transacciones.size(); i++) {
                total += caja.transacciones.get(i);
                caja.transacciones.set(i, 0.0); 
            }
            
            System.out.println("Cierre total: " + total);
        }
    }

    // Ejemplo 2
    class Motor {
        protected double temperatura = 90.0; // Detalle interno expuesto
    }

    class MotorTurbo extends Motor {
        public void activarTurbo() {
            // Manipula la variable del padre directamente.
            if (super.temperatura < 100) {
                super.temperatura += 50; 
                System.out.println("Turbo activado. Temp: " + super.temperatura);
            }
        }
    }
}
