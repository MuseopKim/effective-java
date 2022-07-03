package chapter01.item05.factorymethod;

import chapter01.item05.dependencyinjection.Dictionary;

public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }
}
