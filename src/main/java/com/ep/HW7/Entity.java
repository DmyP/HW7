package com.ep.HW7;

import java.util.concurrent.atomic.AtomicInteger;

abstract class Entity {
    private AtomicInteger id = new AtomicInteger();

    protected Entity() {
        if (id == null) {
            this.id.set(0);
        }
            this.id.set(this.id.incrementAndGet());
    }

    public Integer getId() {
        return id.get();
    }
}
