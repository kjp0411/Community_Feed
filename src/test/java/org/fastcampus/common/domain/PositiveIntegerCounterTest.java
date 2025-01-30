package org.fastcampus.common.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PositiveIntegerCounterTest {

    @Test
    void givenCreated_whenIncrease_thenCountIsOne() {
        // given
        PositiveIntgerCounter counter = new PositiveIntgerCounter();

        // when
        counter.increase();

        // then
        assertEquals(1, counter.getCount());
    }

    @Test
    void givenCreatedAndIncrease_whenDecrease_thenCountIsZero() {
        // given
        PositiveIntgerCounter counter = new PositiveIntgerCounter();
        counter.increase();

        // when
        counter.decrease();

        // then
        assertEquals(0, counter.getCount());
    }

    @Test
    void givenCreated_whenDecrease_thenCountIsZero() {
        // given
        PositiveIntgerCounter counter = new PositiveIntgerCounter();

        // when
        counter.decrease();

        // then
        assertEquals(0, counter.getCount());
    }
}
