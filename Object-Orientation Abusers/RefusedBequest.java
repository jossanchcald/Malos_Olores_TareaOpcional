import java.util.ArrayList;

public class RefusedBequest {
    
    // Ejemplo 1
    // Clase Padre
    class VehiculoMotorizado {
        public void encenderMotor() {
            System.out.println("Motor encendido brum brum!");
        }
        public void llenarGasolina() {
            System.out.println("Llenando tanque...");
        }
    }

    // Clase Hija
    class Bicicleta extends VehiculoMotorizado {

        @Override
        public void encenderMotor() {
            throw new UnsupportedOperationException("Una bicicleta no tiene motor.");
        }

        @Override
        public void llenarGasolina() {
            throw new UnsupportedOperationException("No uso gasolina, uso pedales.");
        }
        
        public void pedalear() {
            System.out.println("Pedaleando...");
        }
    }

    // Ejemplo 2
    // Hereda de ArrayList pero no quiere permitir agregar o borrar elementos
    public class ListaFija extends ArrayList<String> {

    @Override
    public boolean add(String e) {
        throw new UnsupportedOperationException("No puedes agregar elementos a esta lista.");
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException("No puedes borrar elementos.");
    }
    
}
}
