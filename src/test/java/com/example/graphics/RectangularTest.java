package com.example.graphics;

import com.example.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTest {

    private Rectangular r = null;
    @BeforeEach
    public void before () {
        this.r = new Rectangular(1.0,1.0,3.0,2.0);

    }

    @Test
    void computeArea() {
        assertEquals (r.computeArea(), 6.0, 0.01);
    }

    @Test
    void computeCircumference() {
        assertEquals (r.computeCircumference(), 10.0, 0.01);
    }
}