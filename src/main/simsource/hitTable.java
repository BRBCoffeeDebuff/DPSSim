package main.simsource;

public class hitTable {
    private String htColor;
    private double dwMiss;
    private double miss;
    private double hitSuppression;
    private double dodge;
    private double parry;
    private double block;
    private double glancing;
    private double critSuppresion;
    private double spellMiss;

    private double tempmiss;
    private double tempdodge;
    private double tempparry;
    private double tempglancing;
    private double tempspellMiss;

    /***
     * 
     * @param tableColor is either YELLOW Or WHITE depending on attack type
     * @param bossLevel level 80-83 are supported by this sim
     * @param isBehindBoss should be true if you are behind the boss
     * @param isDualWeilding should be ture if you are dual weilding
     */
    public void init(String tableColor, int bossLevel, boolean isBehindBoss, boolean isDualWeilding){
        if (tableColor == "YELLOW"){
            this.htColor = "YELLOW";
            switch (bossLevel){
                case 80:
                    this.dwMiss = 0.24;
                    this.miss = ((isDualWeilding == true)? 0.05 : dwMiss);
                    this.hitSuppression = 0;
                    this.dodge = 0.05;
                    this.parry = ((isBehindBoss == true)? 0 : 0.05);
                    this.block = ((isBehindBoss == true)? 0 : 0.05);
                    this.glancing = 0.06;
                    this.critSuppresion = 0.0;
                    this.spellMiss = 0.04;
                case 81:
                    this.dwMiss = 0.245;
                    this.miss = ((isDualWeilding == true)? 0.055 : dwMiss);
                    this.hitSuppression = 0;
                    this.dodge = 0.055;
                    this.parry = ((isBehindBoss == true)? 0 : 0.055);
                    this.block = ((isBehindBoss == true)? 0 : 0.05);
                    this.glancing = 0.12;
                    this.critSuppresion = 0.01;
                    this.spellMiss = 0.05;
                case 82:
                    this.dwMiss = 0.25;
                    this.miss = ((isDualWeilding == true)? 0.06 : dwMiss);
                    this.hitSuppression = 0;
                    this.dodge = 0.06;
                    this.parry = ((isBehindBoss == true)? 0 : 0.06);
                    this.block = ((isBehindBoss == true)? 0 : 0.05);
                    this.glancing = 0.18;
                    this.critSuppresion = 0.02;
                    this.spellMiss = 0.06;
                default: // Level 83 boss
                    this.dwMiss = 0.27;
                    this.miss = ((isDualWeilding == true)? 0.08 : dwMiss);
                    this.hitSuppression = 0.01;
                    this.dodge = 0.065;
                    this.parry = ((isBehindBoss == true)? 0 : 0.14);
                    this.block = ((isBehindBoss == true)? 0 : 0.05);
                    this.glancing = 0.24;
                    this.critSuppresion = 0.048;
                    this.spellMiss = 0.17;
            }
        }
        else {
            this.htColor = "White";
            switch (bossLevel){
                case 80:
                    this.miss = 0.05;
                    this.dwMiss = miss;
                    this.hitSuppression = 0;
                    this.dodge = 0.05;
                    this.parry = 0.05;
                    this.block = 0.05;
                    this.glancing = 0.06;
                    this.critSuppresion = 0.0;
                    this.spellMiss = 0.04;
                case 81:
                    this.miss = 0.055;
                    this.dwMiss = miss;
                    this.hitSuppression = 0;
                    this.dodge = 0.055;
                    this.parry = 0.055;
                    this.block = 0.05;
                    this.glancing = 0.12;
                    this.critSuppresion = 0.01;
                    this.spellMiss = 0.05;
                case 82:
                    this.miss = 0.06;
                    this.dwMiss = miss;
                    this.hitSuppression = 0;
                    this.dodge = 0.06;
                    this.parry = 0.06;
                    this.block = 0.05;
                    this.glancing = 0.18;
                    this.critSuppresion = 0.02;
                    this.spellMiss = 0.06;
                default: // level 83 boss
                    this.miss = 0.08;
                    this.dwMiss = miss;
                    this.hitSuppression = 0.01;
                    this.dodge = 0.065;
                    this.parry = 0.14;
                    this.block = 0.05;
                    this.glancing = 0.24;
                    this.critSuppresion = 0.048;
                    this.spellMiss = 0.17;
            }
        }
    }
    private boolean checkVsDouble(double testValue, double threshold){
        return testValue >= -threshold && testValue <= threshold;
    }

    public double getMiss() {
        if(this.checkVsDouble(this.tempmiss, (0 + this.miss/100))){
            return this.miss;
        } // check to see if tempmiss is set
        else{
            return Math.max(0, this.miss-this.tempmiss);
        }
    }


    public double getHitSuppression() {
        return this.hitSuppression;
    }

    public double getDodge() {
        if(this.checkVsDouble(this.tempdodge, (0 + this.dodge/100))){
            return this.dodge;
        } // check to see if tempmiss is set
        else{
            return Math.max(0, this.dodge-this.tempdodge);
        }
    }


    public double getParry() {
        if(this.checkVsDouble(this.tempparry, (0 + this.parry/100))){
            return this.parry;
        } // check to see if tempmiss is set
        else{
            return Math.max(0, this.parry-this.tempparry);
        }
    }

    public double getBlock() {
        return this.block;
    }

    public double getGlancing() {
        if(this.checkVsDouble(this.tempglancing, (0 + this.glancing/100))){
            return this.glancing;
        } // check to see if tempmiss is set
        else{
            return Math.max(0, this.glancing-this.tempglancing);
        }
    }

    public double getCritSuppresion() {
        return this.critSuppresion;
    }

    public double getSpellMiss() {
        if(this.checkVsDouble(this.tempspellMiss, (0 + this.spellMiss/100))){
            return this.spellMiss;
        } // check to see if tempmiss is set
        else{
            return Math.max(0, this.spellMiss-this.tempspellMiss);
        }
    }

    public String getHtColor() {
        return this.htColor;
    }

    public double getDwMiss() {
        return this.dwMiss;
    }

    public double getTempmiss() {
        return this.tempmiss;
    }
    /***
     * @param tempmiss takes a positive miss value and reduces your miss chance by that value
     ***/
    public void setTempmiss(double tempmiss) {
        this.tempmiss = tempmiss;
    }

    public double getTempdodge() {
        return this.tempdodge;
    }
    /***
     * @param tempdodge takes a positive miss value and reduces boss dodge chance by that value
    ***/
     public void setTempdodge(double tempdodge) {
        this.tempdodge = tempdodge;
    }

    public double getTempparry() {
        return this.tempparry;
    }
    /***
     * @param tempparry takes a positive miss value and reduces boss parry chance by that value
    ***/
    public void setTempparry(double tempparry) {
        this.tempparry = tempparry;
    }
    
    
    public double getTempglancing() {
        return this.tempglancing;
    }
    /***
     * @param tempglancing takes a positive miss value and reduces your glancing chance by that value
    ***/
    public void setTempglancing(double tempglancing) {
        this.tempglancing = tempglancing;
    }
    
    public double getTempspellMiss() {
        return this.tempspellMiss;
    }
    /***
     * @param tempspellmiss takes a positive miss value and reduces your spell miss chance by that value
    ***/
    public void setTempspellMiss(double tempspellMiss) {
        this.tempspellMiss = tempspellMiss;
    }



}
