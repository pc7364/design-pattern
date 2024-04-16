package cn.pc.designpattern.strategy;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/16 16:36
 */
public abstract class AbstractPayService implements PayStrategy{



    @Override
    public void pay(Integer userId, Integer monery) {
        beforeCheck(userId);
        doPay(userId , monery);
        afterPay(userId);
    }

    public abstract void doPay(Integer userId, Integer monery);

    private void beforeCheck(Integer userId){
        System.out.println("前置校验");
    }

    private void afterPay(Integer userId){
        System.out.println("支付后");
    }


}
