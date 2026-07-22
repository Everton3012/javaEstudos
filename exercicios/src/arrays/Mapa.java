package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Ana");
        usuarios.put(2, "Lia");
        usuarios.put(3, "Gui");
        usuarios.put(4, "Natã");

        System.out.println(usuarios.size());

        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());

        System.out.println(usuarios.values());

        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));

        System.out.println(usuarios.containsValue("Gui"));

        System.out.println(usuarios.get(3));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + " - " + registro.getValue());
        }

        System.out.println(usuarios.remove(4));

        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + " - " + registro.getValue());
        }
    }
}
