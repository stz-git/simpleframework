package com.imooc.demo.pattern.factory.abstractf;

import com.imooc.demo.pattern.factory.entity.HpKeyboard;
import com.imooc.demo.pattern.factory.entity.HpMouse;
import com.imooc.demo.pattern.factory.entity.Keyboard;
import com.imooc.demo.pattern.factory.entity.Mouse;

public class HpComputerFactory implements ComputerFactory{

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
