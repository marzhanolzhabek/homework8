package com.narxoz.rpg.floor;

import com.narxoz.rpg.combatant.Hero;
import java.util.List;

public abstract class TowerFloor {
    public final FloorResult explore(List<Hero> party) {
        System.out.println("--- " + getFloorName() + " қабатына кірдіңіз ---");
        setup(party);
        FloorResult result = resolveChallenge(party);

        if (shouldAwardLoot(result)) {
            awardLoot(party, result);
        }

        return result;
    }

    protected abstract String getFloorName();
    protected abstract void setup(List<Hero> party);
    protected abstract FloorResult resolveChallenge(List<Hero> party);
    protected abstract void awardLoot(List<Hero> party, FloorResult r);

    protected boolean shouldAwardLoot(FloorResult r) {
        return r.isCleared();
    }
}