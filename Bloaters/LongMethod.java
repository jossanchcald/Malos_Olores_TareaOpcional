public class LongMethod {

    // Ejemplo 1
    public static void analizarNotas(int[] notas) {
        
        if (notas == null || notas.length == 0) {
            System.out.println("No hay notas para analizar.");
            return;
        }

        System.out.println("--- INICIO DEL REPORTE ---");

        double suma = 0;
        for (int nota : notas) {
            if (nota < 0 || nota > 100) {
                System.out.println("Error: Nota inválida encontrada: " + nota);
                return;
            }
            suma += nota;
        }
        double promedio = suma / notas.length;

        int max = notas[0];
        int min = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }

        double sumaDiferencias = 0;
        for (int nota : notas) {
            sumaDiferencias += Math.pow(nota - promedio, 2);
        }
        double varianza = sumaDiferencias / notas.length;
        double desviacion = Math.sqrt(varianza);


        System.out.println("Cantidad de alumnos: " + notas.length);
        System.out.println("Promedio general: " + promedio);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
        System.out.println("Desviación estándar: " + String.format("%.2f", desviacion));

        System.out.println("\nDetalle por alumno:");
        for (int i = 0; i < notas.length; i++) {
            String letra = "";
            if (notas[i] >= 90) letra = "A";
            else if (notas[i] >= 80) letra = "B";
            else if (notas[i] >= 70) letra = "C";
            else if (notas[i] >= 60) letra = "D";
            else letra = "F";
            
            System.out.println("Alumno " + (i + 1) + ": " + notas[i] + " (" + letra + ")");
        }
        
        System.out.println("--- FIN DEL REPORTE ---");
    }


    // Ejemplo 2
    public String limpiarYFormatearMensaje(String mensaje) {
        if (mensaje == null) {
            return "";
        }
        if (mensaje.isEmpty()) {
            return "Vacío";
        }

        String resultado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            // Solo permitimos letras y espacios
            if (Character.isLetter(c) || c == ' ') {
                resultado += c;
            }
        }

        resultado = resultado.trim();
        resultado = resultado.toLowerCase();

        if (resultado.contains("insulto")) {
            resultado = resultado.replace("insulto", "****");
        }
        if (resultado.contains("feo")) {
            resultado = resultado.replace("feo", "***");
        }

        if (resultado.length() > 50) {
            resultado = resultado.substring(0, 50) + "...";
        }

        return resultado;
    }
}

