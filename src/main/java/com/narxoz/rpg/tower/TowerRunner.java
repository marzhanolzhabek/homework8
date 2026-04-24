package com.narxoz.rpg.tower;

import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.floor.TowerFloor;
import com.narxoz.rpg.floor.FloorResult;
import java.util.List;

public class TowerRunner {

    public TowerRunResult run(List<TowerFloor> floors, List<Hero> party) {
        int clearedCount = 0;
        boolean allSuccess = true;

        for (TowerFloor floor : floors) {
            System.out.println("\n--- Жаңа қабат ---");
            FloorResult result = floor.explore(party);

            if (result.isCleared()) {
                clearedCount++;
                System.out.println("Статус: " + result.getMessage());
            } else {
                System.out.println("Қабат өтілмеді: " + result.getMessage());
                allSuccess = false;
                break;
            }
        }

        return new TowerRunResult(clearedCount, party.size(), allSuccess);
    }
}