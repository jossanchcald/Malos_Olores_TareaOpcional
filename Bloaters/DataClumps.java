public class DataClumps {
    // Ejemplo
    public void dibujarFondo(int ancho, int alto, int r, int g, int b) {
        System.out.println("Dibujando fondo de " + ancho + "x" + alto);
        System.out.println("Color RGB: " + r + "," + g + "," + b);
    }

    public void dibujarBorde(int grosor, int r, int g, int b) {
        System.out.println("Dibujando borde de grosor " + grosor);
        System.out.println("Color RGB: " + r + "," + g + "," + b);
    }

    public void mezclarColores(int r1, int g1, int b1, int r2, int g2, int b2) {
        int rPromedio = (r1 + r2) / 2;
        int gPromedio = (g1 + g2) / 2;
        int bPromedio = (b1 + b2) / 2;
        
        System.out.println("Mezcla resultante RGB: " + rPromedio + "," + gPromedio + "," + bPromedio);
    }
}
