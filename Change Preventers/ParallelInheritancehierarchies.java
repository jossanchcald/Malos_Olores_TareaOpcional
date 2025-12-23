
public class ParallelInheritancehierarchies {
    
    // Ejemplo 1
    abstract class Departamento {
        abstract void trabajar();
    }

    class DepartamentoVentas extends Departamento {
        void trabajar() { /* vender */ }
    }
    class DepartamentoIT extends Departamento {
        void trabajar() { /* programar */ }
    }


    abstract class ImpresoraDepartamento {
        abstract void imprimir();
    }

    class ImpresoraVentas extends ImpresoraDepartamento {
        void imprimir() { System.out.println("Imprimiendo ventas..."); }
    }
    class ImpresoraIT extends ImpresoraDepartamento {
        void imprimir() { System.out.println("Imprimiendo tickets IT..."); }
    }


    // Ejemplo 2
    abstract class Documento {
        abstract String getNombre();
    }

    class DocumentoPDF extends Documento {
        String getNombre() { return "archivo.pdf"; }
    }

    class DocumentoWord extends Documento {
        String getNombre() { return "archivo.docx"; }
    }


    
    abstract class Parser {
        abstract void leerContenido();
    }

    class ParserPDF extends Parser {
        void leerContenido() {
            System.out.println("Algoritmo complejo para leer PDF...");
        }
    }

    class ParserWord extends Parser {
        void leerContenido() {
            System.out.println("Algoritmo complejo para leer Word...");
        }
    }
}
