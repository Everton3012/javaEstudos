package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ronald");
        usuarios.put(3, "David");
        usuarios.put(4, "Carol");
        usuarios.put(2, "Kaue");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.values());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.get(4));

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro);
        }
    }
}
