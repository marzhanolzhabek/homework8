package com.narxoz.rpg.floor;

import com.narxoz.rpg.combatant.Hero;
import java.util.List;

public class BattleFloor extends TowerFloor {
    @Override
    protected String getFloorName() { return "Battle Arena"; }

    @Override
    protected void setup(List<Hero> party) {
        System.out.println("Қауіпті жаулар пайда болды!");
    }

    @Override
    protected FloorResult resolveChallenge(List<Hero> party) {
        System.out.println("Шайқас жүріп жатыр...");
        return new FloorResult(true, 10, "Жеңіс!");
    }

    @Override
    protected void awardLoot(List<Hero> party, FloorResult r) {
        System.out.println("Алтын табылды!");
    }
}