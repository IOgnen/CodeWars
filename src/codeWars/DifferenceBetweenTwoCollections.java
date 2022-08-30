package codeWars;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DifferenceBetweenTwoCollections {

    public static List<Character> diff(Collection<Character> chars1, Collection<Character> chars2) {

        if (chars1.isEmpty() && chars2.isEmpty()) {
            return new ArrayList<>();
        }
        chars1 = chars1.stream().sorted().distinct().collect(Collectors.toList());
        chars2 = chars2.stream().sorted().distinct().collect(Collectors.toList());

        if(chars1.isEmpty()) return new ArrayList<>(chars2);
        if(chars2.isEmpty()) return new ArrayList<>(chars1);

        Collection<Character> finalChars = chars2;
        Collection<Character> finalChars2= chars1;

        List<Character> result = chars1.stream()
                .distinct()
                .filter(c -> !finalChars.contains(c))
                .collect(Collectors.toList());

        List<Character> result2 = chars2.stream()
                .distinct()
                .filter(c -> !finalChars2.contains(c))
                .collect(Collectors.toList());

        result2.addAll(result);

        return result2.stream().sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {


        List<Character> a = new ArrayList<>();
//        a.add('a');
//        a.add('b');
//        a.add('z');
//        a.add('d');
//        a.add('e');
//        a.add('d');

        List<Character> b = new ArrayList<>();
        b.add('j');
        b.add('a');
        b.add('b');
        b.add('c');

        System.out.println(diff(a, b));
    }

}
