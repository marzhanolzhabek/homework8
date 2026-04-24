package com.narxoz.rpg.combatant;

import com.narxoz.rpg.state.HeroState;
import com.narxoz.rpg.state.NeutralState;

public class ActiveHero extends Hero {
    private HeroState state;

    public ActiveHero(String name, int hp, int attackPower, int defense) {
        super(name, hp, attackPower, defense);
        this.state = new NeutralState();
    }

    public void setState(HeroState state) {
        this.state = state;
    }

    public HeroState getState() {
        return state;
    }

    public int getModifiedAttack() {
        return state.modifyOutgoingDamage(getAttackPower());
    }
    public void applyModifiedDamage(int rawDamage) {
        int finalDamage = state.modifyIncomingDamage(rawDamage);
        takeDamage(finalDamage);
    }

    public boolean canAct() {
        return state.canAct();
    }
}