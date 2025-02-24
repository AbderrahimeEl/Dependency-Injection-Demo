package net.elm.presentation;

import net.elm.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringAnnotation {
    public static void main(String[] a) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.elm.dao","net.elm.metier"); // base package
        IMetier imetier = context.getBean("metier",IMetier.class);
        System.out.println(imetier.calcule());
    }
}

