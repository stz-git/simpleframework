package com.imooc.demo.pattern.factory.abstractf;

import com.imooc.demo.pattern.factory.entity.Keyboard;
import com.imooc.demo.pattern.factory.entity.Mouse;

public interface ComputerFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
}
