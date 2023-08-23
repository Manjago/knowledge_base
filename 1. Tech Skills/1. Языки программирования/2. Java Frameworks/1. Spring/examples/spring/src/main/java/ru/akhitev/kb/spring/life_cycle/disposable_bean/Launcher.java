package ru.akhitev.kb.spring.life_cycle.disposable_bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("spring/life_cycle/disposable_bean/beans.xml");
        context.getBean(Retro.class);
        context.close();
    }
}
