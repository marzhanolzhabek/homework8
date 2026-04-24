package com.narxoz.rpg.floor;

import com.narxoz.rpg.combatant.Hero;
import java.util.List;

public class TrapFloor extends TowerFloor {
    @Override
    protected String getFloorName() { return "Trap Room"; }

    @Override
    protected void setup(List<Hero> party) {
        System.out.println("Абайлаңыз, тұзақ!");
    }

    @Override
    protected FloorResult resolveChallenge(List<Hero> party) {
        for (Hero h : party) {
            h.takeDamage(10);
        }
        System.out.println("Тұзаққа түстіңіз! 10 HP жоғалттыңыз.");
        return new FloorResult(true, 5, "Өттік.");
    }

    @Override
    protected void awardLoot(List<Hero> party, FloorResult r) {
        System.out.println("Тұзақтан кейінгі олжа.");
    }
}