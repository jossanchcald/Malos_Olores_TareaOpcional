public class SwitchStatements {

    // Ejemplo 1
    public double calcularSueldo(String tipoEmpleado, double sueldoBase) {
        double sueldoFinal = 0;
        
        switch (tipoEmpleado) {
            case "JUNIOR":
                sueldoFinal = sueldoBase + 100;
                break;
            case "SENIOR":
                sueldoFinal = sueldoBase * 1.5 + 500;
                break;
            case "GERENTE":
                sueldoFinal = sueldoBase * 2.0 + 1000;
                break;
            case "BECARIO":
                sueldoFinal = sueldoBase * 0.5;
                break;
            default:
                throw new IllegalArgumentException("Tipo desconocido");
        }
        
        return sueldoFinal;
    }

    // Ejemplo 2
    public void dibujarForma(String tipoForma) {
        switch (tipoForma) {
            case "CIRCULO":
                System.out.println("Dibujando un radio de 360 grados...");
                break;
            case "CUADRADO":
                System.out.println("Dibujando 4 lados iguales...");
                break;
            case "TRIANGULO":
                System.out.println("Dibujando 3 vértices...");
                break;
            case "LINEA":
                System.out.println("Dibujando entre dos puntos...");
                break;
            default:
                throw new RuntimeException("Forma no soportada");
        }
    }

}
