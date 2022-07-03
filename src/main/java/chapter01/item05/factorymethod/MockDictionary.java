package chapter01.item05.factorymethod;

import chapter01.item05.dependencyinjection.Dictionary;
import java.util.Collections;
import java.util.List;

public class MockDictionary implements Dictionary {

    @Override
    public boolean contains(String word) {
        return false;
    }

    @Override
    public List<String> suggestions(String typo) {
        return Collections.emptyList();
    }
}
