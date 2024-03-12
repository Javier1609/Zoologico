package visitantes;

public class generadorDeTours {
    public static void main(String[] args) {
        Visitante visitanteNino = new Visitante(new InteresNinos());
        System.out.println(visitanteNino.obtenerTour());

        Visitante visitanteAves = new Visitante(new InteresAves());
        System.out.println(visitanteAves.obtenerTour());

        Visitante visitanteMamiferos = new Visitante(new InteresMamiferos());
        System.out.println(visitanteMamiferos.obtenerTour());
    }
}
