package Couplers;

public class FeatureEnvy {
    
    // Ejemplo 1
    // Clase de datos
    class Cliente {
        public int getEdad() { return 25; }
        public boolean fuma() { return true; }
        public boolean haceDeporte() { return false; }
        public boolean tieneProblemasCardiacos() { return false; }
    }

    // Clase "envidiosa"
    class CalculadoraSeguro {
        public double cotizarSeguro(Cliente cliente) {
            double primaBase = 500;
            
            if (cliente.getEdad() > 60) {
                primaBase += 200;
            }
            if (cliente.fuma()) {
                primaBase += 300;
            }
            if (!cliente.haceDeporte()) {
                primaBase += 50;
            }
            if (cliente.tieneProblemasCardiacos()) {
                primaBase += 500;
            }
            
            return primaBase;
        }
    }

    // Ejemplo 2
    class Direccion {
        public String getCalle() { return "Av. Amazon"; }
        public String getCiudad() { return "Quito"; }
        public String getZip() { return "170150"; }
        public String getPais() { return "Ecuador"; }
    }

    class ImpresoraEtiquetas {
        public void imprimir(Direccion dir) {
            String linea1 = dir.getCalle().toUpperCase();
            String linea2 = dir.getCiudad() + " - " + dir.getZip();
            String linea3 = "(" + dir.getPais() + ")";
            
            System.out.println(linea1);
            System.out.println(linea2);
            System.out.println(linea3);
        }
    }
}
