package gof.creational.factory.simple.F;

import gof.creational.factory.simple.IRuleConfigParser;
import gof.creational.factory.simple.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser(String configFormat) {
        return new JsonRuleConfigParser();
    }
}
