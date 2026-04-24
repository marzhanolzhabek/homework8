package com.narxoz.rpg;
import com.narxoz.rpg.combatant.*;
import com.narxoz.rpg.floor.*;
import com.narxoz.rpg.state.*;
import com.narxoz.rpg.tower.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Hero> party = new ArrayList<>();

        ActiveHero h1 = new ActiveHero("Aragorn", 100, 20, 5);
        ActiveHero h2 = new ActiveHero("Legolas", 80, 25, 2);

        h1.setState(new PoisonedState());

        party.add(h1);
        party.add(h2);

        List<TowerFloor> floors = Arrays.asList(
                new BattleFloor(),
                new TrapFloor(),
                new RestFloor(),
                new BattleFloor()
        );

        TowerRunner runner = new TowerRunner();
        System.out.println("--- Мұнараға саяхат басталды ---");

        TowerRunResult result = runner.run(floors, party);

        System.out.println("\n--- Ойын аяқталды ---");
        System.out.println("Барлығы " + result.getFloorsCleared() + " қабат сәтті өтілді!");
        System.out.println("Партия мүшелері: " + result.getPartySize());

        if (result.isSuccess()) {
            System.out.println("Жеңіс!");
        } else {
            System.out.println("Мұнарада жеңіліс таптыңыз.");
        }
    }
}