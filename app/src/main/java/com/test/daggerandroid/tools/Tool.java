package com.test.daggerandroid.tools;

import com.test.daggerandroid.util.Logger;

public interface Tool  {
    default void echo() {
        Logger.log("this tool is " + this);
    }
}
