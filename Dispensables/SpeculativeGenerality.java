package Dispensables;

public class SpeculativeGenerality {
    
    // Ejemplo 1
    public class Logger {   
        // 'color' y 'formato' no se usan.
        // Se pusieron "por si algún día queremos logs de colores".
        public void logError(String mensaje, String color, boolean formatoHTML) {
            System.out.println("ERROR: " + mensaje);
            // Los otros parámetros se ignoran completamente.
        }
    }

    // Ejemplo 2
    public class CalculadoraAvanzada {
        // Método para calcular raíces n-ésimas, pero nunca se usa.
        public double raizNesima(double numero, int n) {
            return Math.pow(numero, 1.0 / n);
        }
    }
}
