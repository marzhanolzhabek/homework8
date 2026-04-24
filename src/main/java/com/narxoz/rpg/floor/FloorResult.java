package com.narxoz.rpg.floor;

public class FloorResult {
    private final boolean cleared;
    private final int reward;
    private final String message;

    public FloorResult(boolean cleared, int reward, String message) {
        this.cleared = cleared;
        this.reward = reward;
        this.message = message;
    }

    public boolean isCleared() { return cleared; }
    public int getReward() { return reward; }
    public String getMessage() { return message; }
}