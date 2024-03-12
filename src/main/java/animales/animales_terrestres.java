package animales;



public class animales_terrestres {
    public static abstract class animales_terrestre extends animales{

        boolean patas;
        boolean cola;
        boolean pelaje;
        String tipo_terrestre;


        public boolean isPatas() {
            return patas;
        }

        public void setPatas(boolean patas) {
            this.patas = patas;
        }

        public boolean isCola() {
            return cola;
        }

        public void setCola(boolean Cola) {
            this.cola = cola;
        }

        public boolean isPelaje() {
            return pelaje;
        }

        public void setPelaje(boolean pelaje) {
            this.pelaje = pelaje;
        }

        public String getTipo_terrestre() {
            return tipo_terrestre;
        }

        public void setTipo_terrestre(boolean tipo_terrestre) {
            this.tipo_terrestre = String.valueOf(tipo_terrestre);
        }

    }

}
