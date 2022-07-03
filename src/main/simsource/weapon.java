package main.simsource;

//import javax.swing.SingleSelectionModel;

public class weapon {
    private double speed;
    private double normSpeed;
    private double minDmg;
    private double maxDmg;
    private double dmgDiff;
    private double baseHasteRating;
    private double specialHasteRating;
    private double effectiveAttackPower;
    private double crit;
    private double timer;
    private double expertise;
    private String weapontype;
    private hitTable whiteHitTable;
    private hitTable yellowHitTable;

    public void init(double weaponSpeed, double weaponMinDmg, double weaponMaxDmg, double hasteRating, double expertiseFromGear, boolean isDualWeilding){

    }


    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getNormSpeed() {
        return this.normSpeed;
    }

    public void setNormSpeed(double normSpeed) {
        this.normSpeed = normSpeed;
    }

    public double getMinDmg() {
        return this.minDmg;
    }

    public void setMinDmg(double minDmg) {
        this.minDmg = minDmg;
    }

    public double getMaxDmg() {
        return this.maxDmg;
    }

    public void setMaxDmg(double maxDmg) {
        this.maxDmg = maxDmg;
    }

    public double getDmgDiff() {
        return this.dmgDiff;
    }

    public void setDmgDiff(double dmgDiff) {
        this.dmgDiff = dmgDiff;
    }

    public double getBaseHasteRating() {
        return this.baseHasteRating;
    }

    public void setBaseHasteRating(double baseHasteRating) {
        this.baseHasteRating = baseHasteRating;
    }

    public double getSpecialHasteRating() {
        return this.specialHasteRating;
    }

    public void setSpecialHasteRating(double specialHasteRating) {
        this.specialHasteRating = specialHasteRating;
    }

    public double getTimer() {
        return this.timer;
    }

    public void setTimer(double timer) {
        this.timer = timer;
    }

    public double getExpertise() {
        return this.expertise;
    }

    public void setExpertise(double expertise) {
        this.expertise = expertise;
    }

    public String getWeapontype() {
        return this.weapontype;
    }

    public void setWeapontype(String weapontype) {
        this.weapontype = weapontype;
    }

    public hitTable getWhiteHitTable() {
        return this.whiteHitTable;
    }

    public void setWhiteHitTable(hitTable whiteHitTable) {
        this.whiteHitTable = whiteHitTable;
    }

    public hitTable getYellowHitTable() {
        return this.yellowHitTable;
    }

    public void setYellowHitTable(hitTable yellowHitTable) {
        this.yellowHitTable = yellowHitTable;
    }

    public double getEffectiveAttackPower() {
        return this.effectiveAttackPower;
    }

    public void setEffectiveAttackPower(double effectiveAttackPower) {
        this.effectiveAttackPower = effectiveAttackPower;
    }

    public double getCrit() {
        return this.crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }


}
