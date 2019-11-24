package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a=0;
    	a = hw.Method3(6, -1, 1);
    	a = hw.Method3(6,1,1);
    	a = hw.Method3(6,1,-1);
    	a = hw.Method3(4,0,1);
    	a = hw.Method3(4,0,-1);
    	a = hw.Method3(4,0,-3);
    	
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a=0;
        a = hw.Method4(0,1,1,1,1);
        a = hw.Method4(1,1,1,1,1);
        a = hw.Method4(5,1,1,1,1);
        //a = hw.Method4(1,-1,-1,1,1);//divide 0
    }
    @Test
    public void testIsTriangle() {
        HelloWorld hw = new HelloWorld();
        
        boolean a1 = hw.isTriangle(-1,1,1);
        assertEquals(false, a1);
        boolean a2 = hw.isTriangle(1,-1,1);
        assertEquals(false, a2);
        boolean a3 = hw.isTriangle(1,1,-1);
        assertEquals(false, a3);
        
        boolean a4 = hw.isTriangle(1,1,3);
        assertEquals(false, a4);
        boolean a5 = hw.isTriangle(1,3,1);
        assertEquals(false, a5);
        boolean a6 = hw.isTriangle(3,1,1);
        assertEquals(false, a6);
        
        boolean a7 = hw.isTriangle(1,1,1);
        assertEquals(true, a7);
    }
    @Test
    public void testIsBirthday() {
        HelloWorld hw = new HelloWorld();
        
        boolean a1 = hw.isBirthday(1900,1,1);
        assertEquals(false, a1);
        boolean a2 = hw.isBirthday(2020,1,1);
        assertEquals(false, a2);
        boolean a3 = hw.isBirthday(2000,-1,1);
        assertEquals(false, a3);
        boolean a4 = hw.isBirthday(2000,13,1);
        assertEquals(false, a4);
        boolean a5 = hw.isBirthday(2000,1,-1);
        assertEquals(false, a5);
        boolean a6 = hw.isBirthday(2000,1,32);
        assertEquals(false, a6);
        boolean a7 = hw.isBirthday(2000,1,1);
        assertEquals(true, a7);
        
        boolean a11 = hw.isBirthday(2019,11,1);
        assertEquals(false, a11);
        boolean a12 = hw.isBirthday(2000,11,1);
        assertEquals(true, a12);
        
        
        boolean a8 = hw.isBirthday(2000,4,31);
        assertEquals(false, a8);
        boolean a81 = hw.isBirthday(2000,4,30);
        assertEquals(true, a81);
        
        boolean a9 = hw.isBirthday(2001,2,29);
        assertEquals(false, a9);
        boolean a91 = hw.isBirthday(2001,2,28);
        assertEquals(true, a91);
        boolean a10 = hw.isBirthday(2000,2,29);
        assertEquals(true, a10);
        boolean a101 = hw.isBirthday(2000,2,30);
        assertEquals(false, a101);
        
    }
    @Test
    public void testMiniCalculator() {
        HelloWorld hw = new HelloWorld();
        
        double a1 = hw.miniCalculator(1.0,1.0,'+');
        assertEquals((Double)2.0, (Double)a1);
        double a2 = hw.miniCalculator(1.0,1.0,'-');
        assertEquals((Double)0.0, (Double)a2);
        double a3 = hw.miniCalculator(1.0,1.0,'*');
        assertEquals((Double)1.0, (Double)a3);
        double a4 = hw.miniCalculator(1.0,1.0,'/');
        assertEquals((Double)1.0, (Double)a4);
        double a5 = hw.miniCalculator(1.0,0.0,'/');
        assertEquals((Double)0.0, (Double)a5);
        double a6 = hw.miniCalculator(1.0,0.0,'j');
        assertEquals((Double)0.0, (Double)a6);
    }
}
