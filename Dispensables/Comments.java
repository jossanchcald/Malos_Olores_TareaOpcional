package Dispensables;

public class Comments {
    
    // Ejemplo 1
    public class Contador {
        private int contador = 0;

        public void incrementar() {
            // Incrementa la variable contador en 1
            contador++; 
        }
    }

    // Ejemplo 2
    public class Fisica {
        public void calcular() {
            // v = velocidad terminal, t = tiempo en segundos
            double v = 9.8; 
            double t = 10;
            
            // Fórmula de caída libre
            double d = v * t; 
        }
    }
}
