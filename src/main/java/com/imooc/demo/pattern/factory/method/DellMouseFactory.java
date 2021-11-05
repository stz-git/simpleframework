package com.imooc.demo.pattern.factory.method;

import com.imooc.demo.pattern.factory.entity.DellMouse;
import com.imooc.demo.pattern.factory.entity.Mouse;

public class DellMouseFactory implements MouseFactory{

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
