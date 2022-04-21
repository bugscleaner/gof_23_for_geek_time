package gof.creational.factory.simple.A;


import gof.creational.factory.simple.*;

/**
 * 未重构代码版本
 */
public class RuleConfigSourceA {

    //对于上面两种简单工厂模式的实现方法，如果我们要添加新的 parser，那势必要改动到
    //RuleConfigParserFactory 的代码，那这是不是违反开闭原则呢？实际上，如果不是需要
    //频繁地添加新的 parser，只是偶尔修改一下 RuleConfigParserFactory 代码，稍微不符合
    //开闭原则，也是完全可以接受的。
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        } else {
            throw new RuntimeException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}
