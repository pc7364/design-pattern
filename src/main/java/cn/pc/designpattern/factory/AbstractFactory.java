package cn.pc.designpattern.factory;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/16 18:00
 */
public class AbstractFactory {

    interface BenzCar{
        void jiayou();
    }

    interface TeslaCar{
        void chongdian();
    }


    class BenzSportCar implements BenzCar{
        @Override
        public void jiayou() {

        }
    }
    class BenzBusinessCar implements BenzCar{
        @Override
        public void jiayou() {

        }
    }

    class TeslaSportCar implements TeslaCar{
        @Override
        public void chongdian() {

        }
    }
    class TeslaBusinessCar implements TeslaCar{
        @Override
        public void chongdian() {

        }
    }

    interface CarFactory{
        BenzCar getBenzCar();
        TeslaCar getTeslaCar();
    }


    class SportCarFactory implements CarFactory{

        @Override
        public BenzCar getBenzCar() {
            return new BenzSportCar();
        }

        @Override
        public TeslaCar getTeslaCar() {
            return new TeslaSportCar();
        }
    }

    class BusinessCarFactory implements CarFactory{

        @Override
        public BenzCar getBenzCar() {
            return new BenzBusinessCar();
        }

        @Override
        public TeslaCar getTeslaCar() {
            return new TeslaBusinessCar();
        }
    }



}
