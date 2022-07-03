package Abilities;

import java.util.List;

import Buffs.buff;
import Talents.talent;

public interface meleeAbility extends ability{

    public double doMeleeDamage(double attackPower, List<buff> buffList, List<talent> talentSpec);

    
}
