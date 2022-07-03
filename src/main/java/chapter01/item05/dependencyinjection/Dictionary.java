package chapter01.item05.dependencyinjection;

import java.util.List;

public interface Dictionary {

    boolean contains(String word);

    List<String> suggestions(String typo);
}
