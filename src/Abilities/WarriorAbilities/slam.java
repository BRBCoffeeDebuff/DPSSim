package Abilities.WarriorAbilities;


import java.util.List;

import Abilities.meleeAbility;
import Buffs.buff;
import Talents.talent;
import main.simsource.damageDoneEvent;

public class slam implements meleeAbility{
    private double cooldown;
    private double cooldownRemaining;
    private boolean onCooldown = false;
    private double castTime;
    private double castTimeRemaining;
    private boolean isCasting = false;
    private double lowerDamage;
    private double upperDamage;
    private boolean isInstant = false;
    private boolean isMelee = true;
    private List<damageDoneEvent> damageDoneListeners;
    public String name = "slam";
    
    // #ToDo: Add attributes to the following list:
    public void importCSVMembers(String[] dataToImport){}

    public void cast(){
        if(!onCooldown){
            this.onCooldown = true;
            this.cooldownRemaining = cooldown;
            this.isCasting = true;
            this.castTimeRemaining = castTime;
        }
    }


    @Override
    public void onTimerTick(double resolution) {
        if(this.onCooldown == true){
            this.cooldownRemaining -= resolution;
        } 
        if(this.cooldownRemaining <= 0){
            this.onCooldown = false;
        }
        if(this.isCasting == true){
            this.castTimeRemaining -= resolution;
            if (this.castTimeRemaining <= 0){
                this.isCasting = false;
                this.castTimeRemaining = castTime;
                finishAbilityCast();
            }
        }
        
        
    }

    /**
     * this will kick off the finish of an ability cast and will call the onAbilityCast method of the damageTakenListeners
     */
    public void finishAbilityCast(){
        for(damageDoneEvent listener : this.damageDoneListeners){
            listener.onAbilityCast(this);
            //Todo completethefinishAbilityCast method
        }
    }

    /**
     * 
     * @param attackPower The attack power or spell power of the character as relevant for this ability
     * @param buffList The list of buffs the character has
     * @param talentSpec The talent spec of the character
     * @return
     */
    @Override
    public double doMeleeDamage(double attackPower, List<buff> buffList, List<talent> talentSpec){
        double damage = 0;
        //TODO: Add code to calculate damage. 
        //TODO: Add code to consumes buffs and talentspecs
        return damage;
       
    }

    @Override
    public void onBuffEvent(buff buff, double currentTime) {
        // TODO define how buffs interact with slam
        
    }


    public double getCooldown(){
        return this.cooldown;
    }
    public double getCastTime(){
        return this.castTime;
    }
    public double getLowerDamage(){
        return this.lowerDamage;
    }
    public double getUpperDamage(){
        return this.upperDamage;
    }
    public boolean getIsInstant(){
        return this.isInstant;
    }
    public boolean getIsCasting(){
        return this.isCasting;
    }
    public boolean getOnCooldown(){
        return this.onCooldown;
    }

    public boolean getIsMelee(){
        return this.isMelee;
    }

}
