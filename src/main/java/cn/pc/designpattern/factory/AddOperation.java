package cn.pc.designpattern.factory;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/16 17:39
 */
public class AddOperation extends Operation{
    @Override
    protected int getResult() {
        return getI1() + getI2();
    }


}
