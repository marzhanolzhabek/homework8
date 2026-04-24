package com.narxoz.rpg.state;

import com.narxoz.rpg.combatant.Hero;

public interface HeroState {
    String getName();
    int modifyOutgoingDamage(int baseDamage);
    int modifyIncomingDamage(int incomingDamage);
    void onTurnStart(Hero hero);
    void onTurnEnd(Hero hero);
    boolean canAct();
}