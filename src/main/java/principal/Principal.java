package principal;

import vehiculos.*;

public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
    }

    Vehiculo[] vehiculo = new Vehiculo[20];

    public Principal() {
        llenarVehiculos();
        
    }

    public void llenarVehiculos() {
        for (int x = 0; x < vehiculo.length; x++) {

            int tipoDeAuto = generarRandom(1, 3);
            String combustible = generarRandomGasolina();
            int capasidadDeGalones = generarRandom(7, 14);
            int capasidadDePasajeros = generarRandom(5, 12);
            int velocidadMaxima = generarRandom(100, 120);
            double aceleracion = generarRandomDouble(12, 100);
            switch (tipoDeAuto) {
                case 1:
                    vehiculo[x] = new VehiculoDeCarga(combustible, capasidadDeGalones, capasidadDePasajeros, velocidadMaxima, aceleracion);
                    break;
                case 2:
                    vehiculo[x] = new VehiculoDeCarrera(combustible, capasidadDeGalones, capasidadDePasajeros, velocidadMaxima, aceleracion);
                    break;
                case 3:
                    vehiculo[x] = new VehiculoCamioneta(combustible, capasidadDeGalones, capasidadDePasajeros, velocidadMaxima, aceleracion);
                    break;
            }
        }
    }

    public int generarRandom(int min, int max) {
        int random = (int) (Math.random() * (max - min + 1) + min);
        return random;
    }

    public double generarRandomDouble(int min, int max) {
        double random = (Math.random() * (max - min + 1) + min);
        return random;
    }

    public String generarRandomGasolina() {
        int random = (int) (Math.random() * (1 - 0 + 1) + 0);
        if (random == 1) {
            return "diesel";
        }
        return "gasolina";
    }
}
