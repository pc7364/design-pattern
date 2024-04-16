package cn.pc.designpattern;

import cn.pc.designpattern.strategy.AbstractPayService;
import cn.pc.designpattern.strategy.AliPayStrategy;
import cn.pc.designpattern.strategy.PayStrategy;
import cn.pc.designpattern.strategy.StrategyFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DesignPatternApplicationTests {


    @Resource
    private StrategyFactory strategyFactory;


    @Test
    void contextLoads() {
        // 策略 + 工厂 + 模版模式
        PayStrategy strategy = strategyFactory.getStrategy(1);
        strategy.pay(1,1);

        // 策略 + 模版模式
        AbstractPayService payService = new AliPayStrategy();
        payService.pay(1,1);

    }


}
