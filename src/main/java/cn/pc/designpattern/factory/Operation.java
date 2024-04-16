package cn.pc.designpattern.factory;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/16 17:37
 */
public abstract class Operation {

    private int i1 = 0;
    private int i2 = 0;

    public int getI1() {
        return i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    protected abstract int getResult();

}
