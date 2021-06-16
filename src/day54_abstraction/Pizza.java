package day54_abstraction;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Stretch the dough and put toppings and cheese and bake it");
    }

    @Override
    public void serve() {
        System.out.println("Serve in plate or in a box");

    }
}
