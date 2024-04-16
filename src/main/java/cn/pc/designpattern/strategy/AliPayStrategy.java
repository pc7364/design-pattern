package cn.pc.designpattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/9 18:14
 */
@Component
public class AliPayStrategy extends AbstractPayService {

    @Override
    public Integer getPayType() {
        return 1;
    }

    @Override
    public void doPay(Integer userId, Integer monery) {
        System.out.println("支付宝支付");
    }
}
