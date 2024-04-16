package cn.pc.designpattern.chain;

public class CheckUserHandel implements OrderHandel{

    private OrderHandel next;

    @Override
    public void handel(Order order) {
        System.out.println("校验用户");
        if (next!= null){
            next.handel(order);
        }
    }

    public void setOrderHandel(OrderHandel next) {
        this.next = next;
    }



}
