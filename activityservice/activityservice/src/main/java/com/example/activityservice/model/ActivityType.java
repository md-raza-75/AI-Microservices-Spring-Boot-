package com.example.activityservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ActivityType {
    RUNNING,
    WALKING,
    CYCLING,
    SWIMMING,
    WEIGHT_TRAINING,
    YOGA,
    HIIT,
    CARDIO,
    STRETCHING,
    OTHER;

    @JsonCreator
    public static ActivityType from(String value) {
        return ActivityType.valueOf(value.toUpperCase());
    }
}
