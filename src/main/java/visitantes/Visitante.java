package visitantes;

public class Visitante {
    private Interes interes;

    public Visitante(Interes interes) {
        this.interes = interes;
    }

    public String obtenerTour() {
        return interes.getTour();
    }
}
