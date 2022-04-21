package gof.creational.factory.simple.F;


import gof.creational.factory.simple.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser(String configFormat);
}
