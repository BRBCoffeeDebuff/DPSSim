package Abilities;

import Buffs.buffs;

public interface spellAbility extends ability {
    public double doSpellDamage(double spellPower, buffs buffList, List<talent> talentSpec);
}
    
}
