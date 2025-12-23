
public class AlternativeClasses_withDifferentInterfaces {
    
    // Ejemplo 1
    // Clase 1
    class ConvertidorDolar {
        public double convertir(double cantidad, String monedaDestino) {
            if (monedaDestino.equals("EUR")) {
                return cantidad * 0.85;
            }
            return cantidad;
        }
    }

    // Clase 2
    class ServicioEuro {
        public double calcularCambio(String monedaOrigen, double monto) {
            if (monedaOrigen.equals("USD")) {
                return monto * 0.85;
            }
            return monto;
        }
    }


    // Ejemplo 2
    // Clase 1
    class TwitterPublisher {
        public void postTweet(String message) {
            System.out.println("Enviando a Twitter: " + message);
        }
    }

    // Clase 2
    class FacebookPublisher {
        public void updateStatus(String statusText) {
            System.out.println("Enviando a Facebook: " + statusText);
        }
    }
}
