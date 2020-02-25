package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static javax.annotation.processing.Completions.of;

public class App
{
    public static void main( String[] args )
    {
        List<String> firstNames = Arrays.asList("Ulf", "Kent", "Lena","Jonas","Anna","Sven");
        List<String> LastNames = Arrays.asList("Bengtsson", "Bernadette", "Andersson","Svensson","Odin","Gudmensen");
        List<Integer> ages = Arrays.asList(38,40,70,43,22,65);

        List<Person> people = new ArrayList();

        // Use the lists above to experiment with stream and maybe flatmap? ;)

        firstNames.stream()
                .filter( p -> p.contains("e"))
                .peek( p -> {
                    return; // a nice way to add a place to set a breakpoint inside a lambda
                })
                .forEach( p -> System.out.println(p));
    }
}
