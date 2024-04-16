package cn.pc.designpattern.strategy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/9 18:10
 */
public class StrategyFactory implements ApplicationContextAware , InitializingBean {

    private ApplicationContext applicationContext;

    Map<Integer , DemoStrategy> map = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, DemoStrategy> beansOfType = applicationContext.getBeansOfType(DemoStrategy.class);
        for (DemoStrategy value : beansOfType.values()) {
            map.put(value.getType() , value);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
