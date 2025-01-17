package org.fastcampus.user.domain;

public class UesrRelationCounter {

    private int count;

    public UesrRelationCounter() {
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
