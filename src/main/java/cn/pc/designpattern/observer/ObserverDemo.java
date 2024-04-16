package cn.pc.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {

    interface Observer{
        void update();
    }



    static class Subject{

        private List<Observer> list = new ArrayList<>();
        private int state;

        public void add(Observer observer){
            list.add(observer);
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
            notifyAllObserver();
        }

        void notifyAllObserver(){
            for (Observer observer : list) {
                observer.update();
            }
        }

    }

    static class StoreObserver implements Observer{
        private Subject subject;

        public StoreObserver(Subject subject) {
            this.subject = subject;
            this.subject.add(this);
        }

        @Override
        public void update() {
            System.out.println("店铺");
        }
    }
    static class UserObserver implements Observer{
        private Subject subject;

        public UserObserver(Subject subject) {
            this.subject = subject;
            this.subject.add(this);
        }

        @Override
        public void update() {
            System.out.println("用户");
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();

        UserObserver userObserver = new UserObserver(subject);
        StoreObserver storeObserver = new StoreObserver(subject);
        subject.setState(10);
    }

}
