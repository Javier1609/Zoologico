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
        @Test
        public void setAletas() {
            this.aletas = aletas;
        }

        public boolean isBranquias() {
            return branquias;
        }
        @Test
        public void setBranquias() {
            this.branquias = branquias;
        }

        public boolean isEscamas() {
            return escamas;
        }
          @Test
        public void setEscamas() {
            this.escamas = escamas;
        }

        public String getTipo_agua() {
            return tipo_agua;
        }
       @Test
        public void setTipo_agua() {
            this.tipo_agua = tipo_agua;
        }

    }
}
