/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.spring.core;

import com.naufal.spring.core.data.Bar;
import com.naufal.spring.core.data.Foo;
import com.naufal.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author IIISI
 */
public class DependencyInjectionTest {
    @Test
    void testNoDI(){
        
        var foo = new Foo();
        var bar = new Bar();
        
        var fooBar = new FooBar(foo, bar);
        
        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
