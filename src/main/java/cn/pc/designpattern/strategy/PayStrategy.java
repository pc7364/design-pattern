package cn.pc.designpattern.strategy;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/9 18:11
 */
public interface PayStrategy {

    Integer getPayType();

    void pay(Integer userId , Integer monery);

}
