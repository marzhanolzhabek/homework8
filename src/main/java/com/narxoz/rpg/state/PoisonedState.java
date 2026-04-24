package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public class PoisonedState implements HeroState {
    @Override
    public String getName() { return "Poisoned"; }

    @Override
    public int modifyOutgoingDamage(int base) { return (int)(base * 0.8); }

    @Override
    public int modifyIncomingDamage(int raw) { return (int)(raw * 1.2); }

    @Override
    public void onTurnStart(Hero h) {
        System.out.println(h.getName() + " уланып, 5 HP жоғалтты.");
        h.takeDamage(5);
    }

    @Override
    public void onTurnEnd(Hero h) {}

    @Override
    public boolean canAct() { return true; }
}