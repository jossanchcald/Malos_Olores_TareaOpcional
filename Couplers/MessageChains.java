package Couplers;

public class MessageChains {

    // Ejemplo 1
    class Empleado {
        Departamento departamento = new Departamento();
        public Departamento getDepartamento() { return departamento; }
    }
    class Departamento {
        Gerente gerente = new Gerente();
        public Gerente getGerente() { return gerente; }
    }
    class Gerente {
        public String getNombre() { return "Sr. Burns"; }
    }

    class ReporteEmpresa {
        public void mostrarJefe(Empleado empleado) {

            String nombreJefe = empleado.getDepartamento().getGerente().getNombre();         
            System.out.println("El jefe es: " + nombreJefe);
        }
    }

    // Ejemplo 2
    class Computadora {
        Mainboard mainboard = new Mainboard();
        public Mainboard getMainboard() { return mainboard; }
    }
    class Mainboard {
        Procesador cpu = new Procesador();
        public Procesador getCpu() { return cpu; }
    }
    class Procesador {
        Sensor sensor = new Sensor();
        public Sensor getSensor() { return sensor; }
    }
    class Sensor {
        public double leerTemperatura() { return 45.5; }
    }

    class MonitorSistema {
        public void check(Computadora pc) {
            double temp = pc.getMainboard().getCpu().getSensor().leerTemperatura();
            System.out.println("Temp: " + temp);
        }
    }
}
