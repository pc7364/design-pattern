package cn.pc.designpattern.chain;

public class CheckGoodsHandel implements OrderHandel{

    private OrderHandel next;

    @Override
    public void handel(Order order) {
        System.out.println("校验商品");
        if (next!= null){
            next.handel(order);
        }
    }

    public void setOrderHandel(OrderHandel next) {
        this.next = next;
    }
}
