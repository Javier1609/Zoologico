package habitats;

public class terrestre  {
    private boolean limpieza;
    private double humedad;
    private double temperatura;
    private double clima;
    private double vegetacion;
    private double suelo;


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
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public double getClima() {
        return clima;
    }
    public void setClima(double clima) {
        this.clima = clima;
    }
    public double getVegetacion() {
        return vegetacion;
    }
    public void setVegetacion(double vegetacion) {
        this.vegetacion = vegetacion;
    }
    public double getSuelo() {
        return suelo;
    }
    public void setSuelo(double suelo) {
        this.suelo = suelo;
    }
    public void monitorear() {
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpieza ? "Sí" : "No"));
        System.out.println("Clima: " + clima);
        System.out.println("Vegetacion: " + vegetacion);
        System.out.println("Suelo: " + suelo);
    }
}
