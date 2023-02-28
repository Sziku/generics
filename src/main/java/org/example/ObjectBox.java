package org.example;

import java.util.Objects;

public class ObjectBox {
    private Object object;

    public ObjectBox(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
