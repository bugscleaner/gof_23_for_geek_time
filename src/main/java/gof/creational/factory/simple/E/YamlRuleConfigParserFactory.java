package gof.creational.factory.simple.E;

import gof.creational.factory.simple.IRuleConfigParser;
import gof.creational.factory.simple.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser(String configFormat) {
        return new YamlRuleConfigParser();
    }
}
