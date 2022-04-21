package gof.creational.factory.simple.G;


import gof.creational.factory.simple.IRuleConfigParser;
import gof.creational.factory.simple.JsonRuleConfigParser;

public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new ISystemConfigParser();
    }
}
