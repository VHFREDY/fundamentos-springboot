package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

/**
 * Se debe de indicar la notacion component para indicar que es parte de un componente general
 */

@Component
public class ComponentTwoImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hello Wordl desde mi componente dos");
    }
}
