package backend;

public class VehiculoDeCarga extends Vehiculo implements Carga {

    public VehiculoDeCarga(boolean tipoDeCombustible, int capasidadDeGalones, int capasidadDePasajeros, double velocidadMaxima, double aceleracion) {
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
    public void transportarCarga(){
        System.out.println("Transportando mateiral");
    }
}
