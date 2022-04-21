package gof.creational.factory.simple.E;

import gof.creational.factory.simple.IRuleConfigParser;
import gof.creational.factory.simple.PropertiesRuleConfigParser;

public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser(String configFormat) {
        return new PropertiesRuleConfigParser();
    }
}
