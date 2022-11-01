/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.spring.core;

import com.naufal.spring.core.data.Bar;
import com.naufal.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author IIISI
 */
@Configuration
public class DependencyInjectionConfiguration {
    
    @Bean
    public Foo foo(){
        return new Foo();
    }
    
    @Bean
    public Bar bar(){
        return new Bar();
    }
    
    public FooBar fooBar(Foo foo, B)
}
