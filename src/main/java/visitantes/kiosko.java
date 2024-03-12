package visitantes;

import java.util.List;


public class kiosko {
    private List<generador_inf> animales;

    public kiosko(List<generador_inf> animales) {
        this.animales = animales;
    }

    public String proporcionarInformacionAnimal(String nombreAnimal) {
        for (generador_inf animal : animales) {
            if (animal.getNombre().equals(nombreAnimal)) {
                return "Nombre: " + animal.getNombre() + "\nHabitat: ";
            }
        }
        return "No se encontró información sobre el animal.";
    }

}