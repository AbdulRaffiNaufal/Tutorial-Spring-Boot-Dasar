/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.spring.core;

import com.naufal.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IIISI
 */
public class DuplicateTest {
    
    @Test
    void testDuplicate(){
        
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });
        
    }
    
    @Test
    void getBean(){
        
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo1", Foo.class);
        
        Assertions.assertSame(foo1, foo2);
    }
}
