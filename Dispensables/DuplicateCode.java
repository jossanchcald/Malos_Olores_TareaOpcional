package Dispensables;

public class DuplicateCode {

    // Ejemplo 1
    public class ReporteNotas {
        
        public void imprimirReporteMatematicas(int[] notas) {
            System.out.println("--- MATEMÁTICAS ---");
            int total = 0;
            for (int n : notas) {
                total += n;
            }
            System.out.println("Promedio: " + (total / notas.length));
        }

        public void imprimirReporteHistoria(int[] notas) {
            // DUPLICADO: La misma lógica de bucle e impresión
            System.out.println("--- HISTORIA ---");
            int total = 0;
            for (int n : notas) {
                total += n;
            }
            System.out.println("Promedio: " + (total / notas.length));
        }
    }

    // Ejemplo 2
    public class Calculadora {
        
        public int sumar(int a, int b) {
            return a + b;
        }

        public int agregar(int a, int b) {
            // DUPLICADO: Mismo código que en 'sumar'
            return a + b;
        }
    }
}
