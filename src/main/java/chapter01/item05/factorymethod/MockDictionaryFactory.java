package chapter01.item05.factorymethod;

import chapter01.item05.dependencyinjection.Dictionary;

public class MockDictionaryFactory implements DictionaryFactory {

    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
