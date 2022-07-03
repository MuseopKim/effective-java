package chapter01.item05.dependencyinjection;

import java.util.Collections;
import java.util.List;

public class DefaultDictionary implements Dictionary {

    @Override
    public boolean contains(String word) {
        return false;
    }

    @Override
    public List<String> suggestions(String typo) {
        return Collections.emptyList();
    }
}
