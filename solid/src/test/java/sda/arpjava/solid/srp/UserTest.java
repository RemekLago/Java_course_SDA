package sda.arpjava.solid.srp;

import org.junit.jupiter.api.Test;
import sda.arpjava.practice.Tank;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    @Test
    public void shouldReturnValidLevelForRefillBelowCapacity(){
        //given
        final double capacity = 10;
        Tank tank = new Tank(capacity);
        //when
        tank.refill(5);
        //that
        assertEquals(5, tank.level());
    }

    @Test
    public void shouldReturnLevelEqualsCapacityForRefillAboveCapacity(){
        //given
        final double capacity = 10;
        Tank tank = new Tank(capacity);
        //when
        tank.refill(15);
        //that
        assertEquals(capacity, tank.level());
    }


    @Test
    public void shouldReturnLevelZeroForNonpositiveRefill(){
        //given
        final double capacity = 10;
        Tank tank = new Tank(capacity);
        //when
        tank.refill(-15);
        //that
        assertEquals(0, tank.level());
    }

    @Test
    public void shouldReturnNopositiveForNopositiveRefill(){
        //given
        final double capacity = 10;
        Tank tank = new Tank(capacity);
        //when
        final double amount = -15;
        final double refill = tank.refill(amount);
        //that
        assertEquals(amount, refill);
    }

    @Test
    public void shouldReturnPositiveForRefillAboveCapacity(){
        //given
        final double capacity = 10;
        Tank tank = new Tank(capacity);
        //when
        final double amount = 15;
        final double refill = tank.refill(amount);
        //that
        assertEquals(amount - capacity, refill);
    }

    @Test
    public void shouldReturnZeroForRefillBelowCapacity(){
        //given
        final double capacity = 10;
        Tank tank = new Tank(capacity);
        //when
        final double amount = 7;
        final double refill = tank.refill(amount);
        //that
        assertEquals(0, refill);
        assertEquals(amount, tank.level());
    }

    @Test
    public void shouldReturnNullForNoPositiveCapacity(){
        //given
        final double capacity = -5;
        //when
        final Tank tank = Tank.ofOrNull(capacity);
        //that
        assertNull(tank);
    }

    @Test
    public void shouldThrowExceptionForNoPositiveCapacity(){
        //given
        final double capacity = -5;
        //when
        //that
        assertThrows(IllegalArgumentException.class, () -> Tank.ofOrThrowException(capacity));
    }

}