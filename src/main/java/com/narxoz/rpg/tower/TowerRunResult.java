package com.narxoz.rpg.tower;

public class TowerRunResult {
    private final int floorsCleared;
    private final int partySize;
    private final boolean success;

    public TowerRunResult(int floorsCleared, int partySize, boolean success) {
        this.floorsCleared = floorsCleared;
        this.partySize = partySize;
        this.success = success;
    }

    public int getFloorsCleared() { return floorsCleared; }
    public int getPartySize() { return partySize; }
    public boolean isSuccess() { return success; }
}