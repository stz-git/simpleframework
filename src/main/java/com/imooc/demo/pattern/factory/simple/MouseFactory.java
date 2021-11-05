package com.imooc.demo.pattern.factory.simple;

import com.imooc.demo.pattern.factory.entity.DellMouse;
import com.imooc.demo.pattern.factory.entity.HpMouse;
import com.imooc.demo.pattern.factory.entity.Mouse;

/**
 * 设计模式-简单工厂模式
 * 优点：隐藏对象创建过程
 * 缺点：1.对象过多代码臃肿、2.增加种类修改工厂违反开闭原则(对扩展开放，对修改关闭)
 */
public class MouseFactory {
    public static Mouse createMouse(int type) {
        switch (type) {
            case 0:
                return new DellMouse();
            case 1:
                return new HpMouse();
            default:
                return new DellMouse();
        }
    }
}
