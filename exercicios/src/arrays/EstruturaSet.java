package arrays;

import java.util.HashSet;
import java.util.Set;

public class EstruturaSet {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet<>();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');
        System.out.println(conjunto.size());
        System.out.println(conjunto);
        conjunto.add("teste");
        System.out.println(conjunto.size());
        System.out.println(conjunto);
        conjunto.add("Teste");
        System.out.println(conjunto.size());
        System.out.println(conjunto);

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.size());
        System.out.println(conjunto);
        System.out.println("Contém 'x'? " + conjunto.contains('x'));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        nums.retainAll(conjunto);
        System.out.println(nums);
        conjunto.addAll(nums);
        System.out.println(conjunto);
    }
}
