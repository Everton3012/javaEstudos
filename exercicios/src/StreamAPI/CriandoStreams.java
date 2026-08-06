package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Consumer<String> println = System.out::println;
        Consumer<Integer> println2 = System.out::println;
        Stream<String> langs = Stream.of("Java", "Python", "C#", "JavaScript\n");
        langs.forEach(println);

        String[] maisLangs = {"PHP", "Kotlin", "C++", "Go\n"};
        Stream.of(maisLangs).forEach(println);
        Arrays.stream(maisLangs).forEach(println);
        Arrays.stream(maisLangs, 1, 3).forEach(println);
        List<String> outrasLangs = Arrays.asList("Lisp", "Perl", "Ruby\n");
        outrasLangs.stream().forEach(println);
        outrasLangs.parallelStream().forEach(println);

        Stream.generate(() -> "a").forEach(println);
        Stream.iterate(0, n -> n + 1).forEach(println2);
    }
}
