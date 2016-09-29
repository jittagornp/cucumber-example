/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pamarin.cucumber;

/**
 * @author jittagornp <http://jittagornp.me>
 * create : 2016/09/29
 */
public class Calculator {

    private final int x;
    private final int y;
    private int z;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        z = x + y;
    }

    public void minus() {
        z = x - y;
    }

    public void multiply() {
        z = x * y;
    }

    public void divide() {
        z = x / y;
    }

    public int getResult() {
        return z;
    }
}
