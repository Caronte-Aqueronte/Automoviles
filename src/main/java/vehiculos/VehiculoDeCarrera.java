package vehiculos;

import interfaces.Deportivo;

public class VehiculoDeCarrera extends Vehiculo implements Deportivo {

    public VehiculoDeCarrera(String tipoDeCombustible, int capasidadDeGalones, int capasidadDePasajeros, int velocidadMaxima, double aceleracion) {
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
    public double turbo(){
        double nuevaVelocidad = getVelocidadMaxima() * 2;
        return nuevaVelocidad;
    }
    @Override
    public double triplicarAceleracion(){
        double nuevaAceleracion = getAceleracion() * 3;
        return nuevaAceleracion;
    }
    

}
