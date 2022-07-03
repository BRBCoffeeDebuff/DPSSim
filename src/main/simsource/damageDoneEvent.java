package main.simsource;

import Abilities.ability;

public interface damageDoneEvent {
    void onDamageDone(double damage, double currentTime);

    void onAbilityCast(ability ability);
}
