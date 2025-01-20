package org.fastcampus.common.domain;

public class PositiveIntgerCounter {
    private int count;

    public PositiveIntgerCounter() {
        this.count = 0;
    }

    public void increase() {
        this.count++;
    }

    public void decrease() {
        if(count <= 0) {
            return;
        }
        this.count--;
    }

}
