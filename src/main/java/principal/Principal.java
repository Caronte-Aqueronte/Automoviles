package principal;

import java.util.Scanner;
import vehiculos.*;

public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
    }

    private Vehiculo[] vehiculos = new Vehiculo[20];
    private Scanner scanner = new Scanner(System.in);
    public Principal() {
        llenarVehiculos();
        int eleccion = 0;
        //ciclo infinito   
        while(true){
            eleccion = 0;
            while(eleccion < 1 || eleccion > 20){
                System.out.println("Ingrese un numero del 1 al 20");
                eleccion = scanner.nextInt();
            }
            identificarAuto(eleccion - 1);
        }
        
    }
    public void identificarAuto(int x){
        if(vehiculos[x] instanceof VehiculoDeCarga){
            System.out.println("Es un Vehiculo de carga, puede transportar material");
        }
        if(vehiculos[x] instanceof VehiculoDeCarrera){
            System.out.println("Es un Vehiculo de carrera, puede competir");
        }
        if(vehiculos[x] instanceof VehiculoCamioneta){
            System.out.println("Es una camioneta, puede llevar personas");
        }
    }
    public void llenarVehiculos() {
        for (int x = 0; x < vehiculos.length; x++) {

            int tipoDeAuto = generarRandom(1, 3);
            String combustible = generarRandomGasolina();
            int capasidadDeGalones = generarRandom(7, 14);
            int capasidadDePasajeros = generarRandom(5, 12);
            int velocidadMaxima = generarRandom(100, 120);
            double aceleracion = generarRandomDouble(12, 100);
            switch (tipoDeAuto) {
                case 1:
                    vehiculos[x] = new VehiculoDeCarga(combustible, capasidadDeGalones, capasidadDePasajeros, velocidadMaxima, aceleracion);
                    break;
                case 2:
                    vehiculos[x] = new VehiculoDeCarrera(combustible, capasidadDeGalones, capasidadDePasajeros, velocidadMaxima, aceleracion);
                    break;
                case 3:
                    vehiculos[x] = new VehiculoCamioneta(combustible, capasidadDeGalones, capasidadDePasajeros, velocidadMaxima, aceleracion);
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
