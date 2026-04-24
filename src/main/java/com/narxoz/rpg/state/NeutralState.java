package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public class NeutralState implements HeroState {
    @Override
    public String getName() { return "Neutral"; }

    @Override
    public int modifyOutgoingDamage(int base) { return base; }

    @Override
    public int modifyIncomingDamage(int raw) { return raw; }

    @Override
    public void onTurnStart(Hero h) {}

    @Override
    public void onTurnEnd(Hero h) {}

    @Override
    public boolean canAct() { return true; }
}