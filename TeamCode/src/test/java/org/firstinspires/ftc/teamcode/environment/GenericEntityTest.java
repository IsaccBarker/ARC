package org.firstinspires.ftc.teamcode.environment.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.firstinspires.ftc.teamcode.environment.GenericEntity;
import org.firstinspires.ftc.teamcode.environment.EntityType;

import java.io.FileWriter;
import java.io.IOException;

class GenericEntityTest {
    GenericEntity entity;

    @BeforeEach
    void setUp() {
        entity = new GenericEntity();
        entity.setUp();

        // We reset the state.
        entity.setAllX(0);
        entity.setAllY(0);
    }

    @Test
    @DisplayName("Returns correct type")
    void returnsType() {
        assertEquals(entity.getType().getValue(), EntityType.GENERIC.getValue());
    }

    @Test                                               
    @DisplayName("Constructor output should be sane")
    void constructorSanity() {
        assertEquals(entity.getX(), 0, "X should be 0");
        assertEquals(entity.getY(), 0, "Y should be 0");
        assertEquals(entity.getPastX(), 0, "past x should be 0");
        assertEquals(entity.getPastY(), 0, "past y should be 0");
    }

    @Test
    @DisplayName("Past x should be last of x")
    void pastXWasX() {
        // TODO: Create a data type that can be iterated over
        // so we don't have to type this code out manually.

        entity.setX(420); // Load into present
        entity.setX(69);

        // 420 is last value, 69 is current value.

        assertEquals(entity.getPastX(), 420);

        entity.setX(42);

        // 69 is last value, 42 is current value.

        assertEquals(entity.getPastX(), 69);
    }

    @Test
    @DisplayName("Past y should be last of y")
    void pastYWasY() {
        // TODO: Create a data type that can be iterated over
        // so we don't have to type this code out manually.

        entity.setY(40);
        entity.setY(649);

        // 40 is last value, 649 is current value.

        assertEquals(entity.getPastY(), 40);

        entity.setY(42);

        // 649 is last value, 42 is current value.

        assertEquals(entity.getPastY(), 649);
    }

    @Test
    @DisplayName("Delta x calculated correctly")
    void deltaXCalculated() {
        // TODO: Create a data type that can be iterated over
        // so we don't have to type this code out manually.

        entity.setX(13);
        entity.setX(96);

        // 13 is last value, 96 is current value.
        // 13 + 96 should = 109
        assertEquals(entity.getDeltaX(), 109);

        entity.setX(-400);

        // 96 is last value, -400 is current valie
        // -400 + 96 = -304

        assertEquals(entity.getDeltaX(), -304);
    }

    @Test
    @DisplayName("Delta y calculated correctly")
    void deltaYCalculated() {
        // TODO: Create a data type that can be iterated over
        // so we don't have to type this code out manually.

        entity.setY(40);
        entity.setY(84);

        // 40 is last value, 84 is current value.
        // 40 + 84 should = 124

        assertEquals(entity.getDeltaY(), 124);

        entity.setY(-287);

        // 84 is last value, -287 is current valie
        // -287 + 84 = -203

        assertEquals(entity.getDeltaY(), -203);
    }
}

