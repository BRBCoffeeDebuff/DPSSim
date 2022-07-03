package Buffs;

public class buff implements importableClass{
    private String buffName;
    private String buffType; // optioins for this will be multiplicative or additive
    private String ratingEffect; // options for this will be none, all, or a specific rating name such as attack power, hit, crit
    private String attributeEffect; //options for this will be strength, intelligence, etc.
    private double buffValue;
    private double duration;

    // TODO add model for data importation from a file
    public void importCSVMembers(String[] dataToImport){}
    
    public void createBuff(String bName, String btype, boolean affectsAttribute, String attributeOrRattingEffectedName, double bvalue, double buffDuration){
        this.buffName = bName;
        this.buffType = btype;
        if(affectsAttribute){
            this.attributeEffect = attributeOrRattingEffectedName;
        }
        else{
            this.ratingEffect = attributeOrRattingEffectedName;
        }
        this.buffValue = bvalue;
        this.duration = buffDuration;
    }
    public void reduceDuration(double tickDuration){
        duration -=tickDuration;
    }

    public String getBuffName() {
        return this.buffName;
    }

    public String getBuffType() {
        return this.buffType;
    }

    public String getRatingEffect() {
        return this.ratingEffect;
    }

    public String getAttributeEffect() {
        return this.attributeEffect;
    }

    public double getBuffValue() {
        return this.buffValue;
    }

    public void setDuration(double newDuration){
        this.duration = newDuration;
    }
    public double getDuration() {
        return this.duration;
    }

    
}
