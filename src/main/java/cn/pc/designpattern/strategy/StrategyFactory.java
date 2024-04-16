package cn.pc.designpattern.strategy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/9 18:10
 */
@Component
public class StrategyFactory implements ApplicationContextAware , InitializingBean {

    private ApplicationContext applicationContext;

    Map<Integer , PayStrategy> map = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, PayStrategy> beansOfType = applicationContext.getBeansOfType(PayStrategy.class);
        for (PayStrategy value : beansOfType.values()) {
            map.put(value.getPayType() , value);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public PayStrategy getStrategy(Integer payType) {

        return map.get(payType);

    }

}
