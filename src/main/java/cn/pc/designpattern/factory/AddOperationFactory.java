package cn.pc.designpattern.factory;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/16 17:39
 */
public class AddOperationFactory implements IFactory{


    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
