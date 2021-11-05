package com.imooc.demo.pattern.factory.method;

import com.imooc.demo.pattern.factory.entity.HpMouse;
import com.imooc.demo.pattern.factory.entity.Mouse;

public class HpMouseFactory implements MouseFactory{

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
