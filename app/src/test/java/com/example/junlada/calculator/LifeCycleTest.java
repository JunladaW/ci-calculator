package com.example.junlada.calculator;

import org.junit.After;
import org.junit.Before;

//List cycle
public class LifeCycleTest {
    @Before
    public void startOnce(){
        System.out.println("======Start=====");
    }

    @After
    public void finishOnce(){
        System.out.println("=====Finish=====");
    }

}
