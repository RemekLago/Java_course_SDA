package sda.arpjava.practice;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    @Test
    public void shouldReturnValidForRefillBelowCapacity() {
        // given
        final double capacity = 10;
        Tank tank = new Tank(capacity);

        //when
        tank.refill(5);

        //then
        assertEquals(5, tank.level());
    }

    @Test
    public void shouldReturnLevelEqualsCapacityForRefillAboveCapacity() {
        // given
        final double capacity = 10;
        Tank tank = new Tank(capacity);

        //when
        tank.refill(15);

        //then
        assertEquals(capacity, tank.level());
    }

    @Test
    public void shouldReturnLevelZeroForNonpositiveRefill() {
        // given
        final double capacity = 10;
        Tank tank = new Tank(capacity);

        //when
        tank.refill(-15);

        //then
        assertEquals(0, tank.level());
    }
}