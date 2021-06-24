package vehiculos;

import interfaces.TransporteUrbano;

public class VehiculoCamioneta extends Vehiculo implements TransporteUrbano {

    public VehiculoCamioneta(String tipoDeCombustible, int capasidadDeGalones, int capasidadDePasajeros, int velocidadMaxima, double aceleracion) {
        super(tipoDeCombustible, capasidadDeGalones, capasidadDePasajeros, velocidadMaxima, aceleracion);
    }

    @Override
    public void girarALaIzquierda() {
        System.out.println("Puedo girar a la izquierda");
    }

    @Override
    public void girarALaDerecha() {
        System.out.println("Puedo girar a la derecha");
    }

    @Override
    public void transportarPersonas() {
        System.out.println("Estoy transportando personas");
    }
}
