package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public class StunnedState implements HeroState {
    @Override
    public String getName() { return "Stunned"; }

    @Override
    public int modifyOutgoingDamage(int base) { return 0; }

    @Override
    public int modifyIncomingDamage(int raw) { return raw; }

    @Override
    public void onTurnStart(Hero h) {
        System.out.println(h.getName() + " есінен танып жатыр, әрекет ете алмайды!");
    }

    @Override
    public void onTurnEnd(Hero h) {}

    @Override
    public boolean canAct() { return false; }
}