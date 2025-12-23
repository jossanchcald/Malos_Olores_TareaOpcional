import java.util.List;

public class TemporaryField {

    // Ejemplo 1
    // Estos campos solo sirven MIENTRAS se ejecuta el método buscar()
    private double distanciaIntermedia;
    private String ultimoNodoVisitado; 

    public void buscarRuta(String origen, String destino) {
        this.distanciaIntermedia = 0;
        this.ultimoNodoVisitado = origen;
        
        calcularPaso1();
        calcularPaso2();
        
        System.out.println("Ruta final: " + this.distanciaIntermedia);
        
    }

    private void calcularPaso1() {
        this.distanciaIntermedia += 10; 
        this.ultimoNodoVisitado = "Nodo A";
    }
    
    private void calcularPaso2() {
        this.distanciaIntermedia += 5;
    }

    // Ejemplo 2
    // Estos campos no definen al objeto, solo sirven como "memoria"
    private int contadorLineas;
    private StringBuilder bufferTemporal; 

    public void generar(List<String> datos) {
        this.contadorLineas = 0;
        this.bufferTemporal = new StringBuilder();

        for (String dato : datos) {
            procesarLinea(dato); // Usa los campos globales
        }
        
        System.out.println(this.bufferTemporal.toString());
    }

    private void procesarLinea(String dato) {
        this.contadorLineas++;
        this.bufferTemporal.append(this.contadorLineas).append(",").append(dato).append("\n");
    }
}
