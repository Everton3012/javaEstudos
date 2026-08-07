package StreamAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {
    private Utilitarios(){};
        public final static UnaryOperator<String> maiuscula = m -> m.toUpperCase();
        public final static UnaryOperator<String> primeiraLetra = m -> m.charAt(0) + "";
        public final static String grito(String m){return m + "!!!";};

}
