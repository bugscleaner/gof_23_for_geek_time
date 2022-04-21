package gof.behavior.chain.G;

public class PoliticalWordFilter implements SensitiveWordFilter {
    @Override
    public void doFilter(Content content) {
        //敏感词变马赛克
    }
}
