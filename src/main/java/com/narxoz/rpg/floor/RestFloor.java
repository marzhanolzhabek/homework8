package com.narxoz.rpg.floor;

import com.narxoz.rpg.combatant.Hero;
import java.util.List;

public class RestFloor extends TowerFloor {
    @Override
    protected String getFloorName() { return "Rest Room"; }

    @Override
    protected void setup(List<Hero> party) {
        System.out.println("Демалудасыз...");
        for (Hero h : party) {
            h.heal(20);
        }
    }

    @Override
    protected FloorResult resolveChallenge(List<Hero> party) {
        return new FloorResult(true, 0, "Демалыс аяқталды.");
    }

    @Override
    protected void awardLoot(List<Hero> party, FloorResult r) {

    }

    @Override
    protected boolean shouldAwardLoot(FloorResult r) {
        return false;
    }
}