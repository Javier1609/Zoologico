import java.util.List;

public class Zoologico {

    public static class Animal {
        private String nombre;
        private String habitat;
        private String descripcion;

        public Animal(String nombre, String habitat, String descripcion) {
            this.nombre = nombre;
            this.habitat = habitat;
            this.descripcion = descripcion;
        }

        public String getNombre() {
            return nombre;
        }

        public String getHabitat() {
            return habitat;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    public static class Habitat {
        private String nombre;
        private String descripcion;

        public Habitat(String nombre, String descripcion) {
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    public static class Quiosco {
        private List<Animal> animales;
        private List<Habitat> habitats;

        public Quiosco(List<Animal> animales, List<Habitat> habitats) {
            this.animales = animales;
            this.habitats = habitats;
        }

        public String proporcionarInformacionAnimal(String nombreAnimal) {
            for (Animal animal : animales) {
                if (animal.getNombre().equals(nombreAnimal)) {
                    return "Nombre: " + animal.getNombre() + "\nHabitat: " + animal.getHabitat() + "\nDescripción: " + animal.getDescripcion();
                }
            }
            return "No se encontró información sobre el animal.";
        }

        public String proporcionarInformacionHabitat(String nombreHabitat) {
            for (Habitat habitat : habitats) {
                if (habitat.getNombre().equals(nombreHabitat)) {
                    return "Nombre: " + habitat.getNombre() + "\nDescripción: " + habitat.getDescripcion();
                }
            }
            return "No se encontró información sobre el hábitat.";
        }
    }

    public abstract static class Persona {
        public abstract void interactuar();
    }

    public static class Cuidador extends Persona {
        @Override
        public void interactuar() {
            System.out.println("Como cuidador, puedes alimentar a los animales, limpiar los hábitats, etc.");
        }
    }

    public static class Visitante extends Persona {
        @Override
        public void interactuar() {
            System.out.println("Como visitante, puedes ver a los animales, aprender sobre los hábitats, etc.");
        }
    }

    public void interactuarConPersona(Persona persona) {
        persona.interactuar();
    }
}