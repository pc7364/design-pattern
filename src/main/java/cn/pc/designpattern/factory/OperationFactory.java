package cn.pc.designpattern.factory;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/16 17:40
 */
public class OperationFactory {

    // 简单工厂
    public static Operation createOperation(String str){
        Operation operation = null;
        switch (str){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            default:
        }
        return operation;
    }

    public static void main(String[] args) {
        // 简单工厂
        Operation operation = OperationFactory.createOperation("+");
        operation.setI1(1);
        operation.setI2(2);
        System.out.println(operation.getResult());

        // 工程方法模式
        IFactory factory = new AddOperationFactory();
        Operation operation1 = factory.createOperation();
        operation1.setI1(2);
        operation1.setI2(3);
        System.out.println(operation1.getResult());
    }


}
