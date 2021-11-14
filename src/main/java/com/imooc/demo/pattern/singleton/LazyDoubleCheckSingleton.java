package com.imooc.demo.pattern.singleton;

/**
 * 加入双重检查锁机制的懒汉模式
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance = null;
    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    //memory = allocate();  //1.分配对象内存空间
                    //instance(memory); //2.初始化对象
                    //instance=memory;  //3.设置instance指向刚分配的内存地址，此时instance != null
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
