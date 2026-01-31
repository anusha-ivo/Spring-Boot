package com.example.basic.unit.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator cal=new Calculator();
    @Test
    public void addtest(){
        int res=cal.add(3,5);
        assertEquals(8,res);

    }

}