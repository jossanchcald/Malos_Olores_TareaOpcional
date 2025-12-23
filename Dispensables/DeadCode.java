package Dispensables;

public class DeadCode {
    
    // Ejemplo 1
    public class Calculadora {
        public int sumar(int a, int b) {
            return a + b;
            
            System.out.println("Esta línea nunca se imprimirá"); 
        }
        
        public void verificar() {
            if (false) {
                System.out.println("Jamás entraré aquí");
            }
        }
    }

    // Ejemplo 2
    public class Proceso {
    public void procesar(String nombre) {
        int temp = 100 * 55; 
        
        // No se usa ni nombre ni temp en ningún lado
        System.out.println("Proceso terminado."); 
    }
}
}
