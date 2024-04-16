package cn.pc.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Desc
 * @Author pc
 * @Date 2024/4/16 16:59
 */
public class Singleton {

    private static Singleton singleton;



    private Singleton(){};

    //懒汉式
    public static synchronized Singleton getSingleton(){
        if (singleton == null){
            Singleton singleton = new Singleton();
        }
        return singleton;
    }



    // 饿汉式
    private static Singleton singleton1 = new Singleton();
    public static synchronized Singleton getSingleton1(){
        return singleton1;
    }


    //双重校验锁
    private volatile static Singleton singleton2;
    public static Singleton getSingleton2(){
        if (singleton2 == null){
            synchronized (Singleton.class){
                if (singleton2 == null){
                    singleton2 = new Singleton();
                }
            }
        }
        return singleton2;
    }

    //CAS方式实现
    private static final AtomicReference<Singleton> INSTANCT = new AtomicReference<Singleton>();
    public static Singleton getSingleton3(){
        for (;;){
            Singleton singleton3 = INSTANCT.get();
            if (singleton3 != null){
                return singleton3;
            }
            singleton3 = new Singleton();
            if (INSTANCT.compareAndSet(null ,singleton3)){
                return singleton3;
            }
        }
    }

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Singleton singleton = Singleton.getSingleton();

        // 通过反射获取构造函数来破坏单例模式
        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton singleton3 = declaredConstructor.newInstance();


    }



}
