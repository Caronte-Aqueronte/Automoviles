package vehiculos;

import interfaces.Timon;

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

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public boolean isTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(boolean tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public int getCapasidadDeGalones() {
        return capasidadDeGalones;
    }

    public void setCapasidadDeGalones(int capasidadDeGalones) {
        this.capasidadDeGalones = capasidadDeGalones;
    }

    public int getCapasidadDePasajeros() {
        return capasidadDePasajeros;
    }

    public void setCapasidadDePasajeros(int capasidadDePasajeros) {
        this.capasidadDePasajeros = capasidadDePasajeros;
    }

}
