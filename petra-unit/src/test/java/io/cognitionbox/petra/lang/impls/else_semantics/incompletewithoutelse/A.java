package io.cognitionbox.petra.lang.impls.else_semantics.incompletewithoutelse;

import java.io.Serializable;

public class A implements Serializable {
    int value = 0;

    public A(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}