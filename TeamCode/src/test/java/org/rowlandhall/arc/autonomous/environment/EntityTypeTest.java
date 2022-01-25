package org.rowlandhall.arc.environment.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.rowlandhall.arc.autonomous.environment.EntityType;

class EntityTypeTest {
    @Test
    @DisplayName("Numeric values of entity types are valid")
    public void entityTypesValid() {
        // TODO: The below code isn't that versatile. Improve this.
        assertTrue(EntityType.ROBOT.getValue() == 0);
        assertTrue(EntityType.GENERIC.getValue() == 1);
    }
}
