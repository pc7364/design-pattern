package cn.pc.designpattern.chain;

import lombok.Data;

@Data
public class Order {

    private Integer orderId;

    private Integer userId;


    public static void main(String[] args) {
        CheckUserHandel checkUserHandel = new CheckUserHandel();
        CheckGoodsHandel checkGoodsHandel = new CheckGoodsHandel();
        CheckStoreHandel checkStoreHandel = new CheckStoreHandel();
        checkUserHandel.setOrderHandel(checkGoodsHandel);
        checkGoodsHandel.setOrderHandel(checkStoreHandel);;

        checkUserHandel.handel(new Order());
    }

}
