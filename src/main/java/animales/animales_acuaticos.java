package animales;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class animales_acuaticos {

    public static class animal_acuatico extends animales {

        boolean aletas;
        boolean branquias;
        boolean escamas;
        String tipo_agua;


        public boolean isAletas() {
            return aletas;
        }

        public void setAletas(boolean aletas) {
            this.aletas = aletas;
        }

        public boolean isBranquias() {
            return branquias;
        }

        public void setBranquias( boolean branquias) {
            this.branquias = branquias;
        }

        public boolean isEscamas() {
            return escamas;
        }

        public void setEscamas(boolean Escamas) {
            this.escamas = escamas;
        }

        public String getTipo_agua() {
            return tipo_agua;
        }

        public void setTipo_agua(String tipo_agua) {
            this.tipo_agua = tipo_agua;
        }

    }

}
