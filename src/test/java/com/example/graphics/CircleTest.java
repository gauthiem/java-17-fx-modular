package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle c = null;
    @BeforeEach
    public void before () {
        this.c = new Circle(1.0,1.0,4.0);

    }

    @Test
    void computeArea() {
        assertEquals (c.computeArea(), 50.26, 0.01);
    }

    @Test
    void computeCircumference() {
        assertEquals (c.computeCircumference(), 25.13, 0.01);
    }
}