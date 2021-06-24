
package backend;

public abstract class Vehiculo implements Timon {
    private boolean tipoDeCombustible;
    private int capasidadDeGalones;
    private int capasidadDePasajeros;
    private double velocidadMaxima;
    private double aceleracion;

    public Vehiculo(boolean tipoDeCombustible, int capasidadDeGalones, int capasidadDePasajeros, double velocidadMaxima, double aceleracion) {
        this.tipoDeCombustible = tipoDeCombustible;
        this.capasidadDeGalones = capasidadDeGalones;
        this.capasidadDePasajeros = capasidadDePasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
    }
   
}
