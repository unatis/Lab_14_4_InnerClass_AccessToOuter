package com.company;

public class Outer {

    int x = 10;

    class Inner {
        public int myInnerMethod() {
            return x;
        }
    }

}
