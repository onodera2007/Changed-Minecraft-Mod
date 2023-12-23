package net.ltxprogrammer.changed.world.features.structures.facility;

import java.util.Random;

public enum Zone {
    RED_ZONE,
    GRAY_ZONE,
    MAINTENANCE_ZONE,
    GREENHOUSE_ZONE,
    BLUE_ZONE;

    public static Zone random(Random r) {
        return values()[r.nextInt(values().length)];
    }
}