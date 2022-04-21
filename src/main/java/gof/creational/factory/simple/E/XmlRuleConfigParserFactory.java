package gof.creational.factory.simple.E;


import gof.creational.factory.simple.IRuleConfigParser;
import gof.creational.factory.simple.XmlRuleConfigParser;

public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser(String configFormat) {
        return new XmlRuleConfigParser();
    }
}
