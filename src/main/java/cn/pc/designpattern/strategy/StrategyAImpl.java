package cn.pc.designpattern.strategy;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/9 18:14
 */
public class StrategyAImpl implements DemoStrategy {
    @Override
    public Integer getType() {
        return 1;
    }

    @Override
    public void strategyMethod() {
        System.out.println("A");
    }
}
