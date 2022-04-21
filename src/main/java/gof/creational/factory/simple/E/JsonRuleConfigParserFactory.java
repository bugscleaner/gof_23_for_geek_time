package gof.creational.factory.simple.E;


import gof.creational.factory.simple.IRuleConfigParser;
import gof.creational.factory.simple.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser(String configFormat) {
        return new JsonRuleConfigParser();
    }
}
