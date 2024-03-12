package habitats;

import org.junit.Test;

public class Acuatico {
    private boolean limpieza;
    private double humedad;
    private double temperatura;

    private double salinidad;
    private double profundidad;
    private double ph;

    public boolean isLimpieza() {
        return limpieza;
    }
    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public double getHumedad() {
        return humedad;
    }
    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura ( double Temperatura) {
        this.temperatura = temperatura;
    }
    public double getSalinidad() {
        return salinidad;
    }
    public void setSalinidad (double salinidad) {
        this.salinidad = salinidad;
    }
    public double getProfundidad() {
        return profundidad;
    }
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    public double getPh() {
        return ph;
    }
    public void setPh(double ph) {
        this.ph = ph;
    }
    public void monitorear() {
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpieza ? "Sí" : "No"));
        System.out.println("Salinidad: " + salinidad);
        System.out.println("Profundidad: " + profundidad);
        System.out.println("Ph: " + ph);
    }
}