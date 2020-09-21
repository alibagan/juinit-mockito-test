package com.bagan.training;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingImplTest {

    private Greeting greeting;

    @Before
    public void setup(){
        greeting = new GreetingImpl();
    }

    @Test
    public void greetShouldReturnAValidOutput() {
        String result = greeting.green("bagan ali");
        assertNotNull(result);
        assertEquals("Hello bagan ali", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowanExceptionForNameIsNull(){
        greeting.green(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowanExceptionForNameIsBlank(){
        greeting.green("");
    }
}