package gof.creational.factory.simple.E;


import gof.creational.factory.simple.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser(String configFormat);
}
