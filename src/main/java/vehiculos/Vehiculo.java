package vehiculos;

import interfaces.Timon;

public abstract class Vehiculo implements Timon {

    private String tipoDeCombustible;
    private int capasidadDeGalones;
    private int capasidadDePasajeros;
    private int velocidadMaxima;
    private double aceleracion;

    public Vehiculo(String tipoDeCombustible, int capasidadDeGalones, int capasidadDePasajeros, int velocidadMaxima, double aceleracion) {
        this.tipoDeCombustible = tipoDeCombustible;
        this.capasidadDeGalones = capasidadDeGalones;
        this.capasidadDePasajeros = capasidadDePasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
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
