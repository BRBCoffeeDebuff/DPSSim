package main.simsource;

import java.util.HashMap;
import java.util.Map;

/*
 * the ratings class will hold ratings for 
 */
public class ratings {
    private Map<String, Double> ratingsValues = new HashMap<String, Double>();
    public void init(double hitRating, double critRating, double expertiseRating, double attackPower, double spellPower ){
        this.ratingsValues.put("hit", hitRating);
        this.ratingsValues.put("crit", critRating);
        this.ratingsValues.put("expertise", expertiseRating);
        this.ratingsValues.put("attackPower", attackPower);
        this.ratingsValues.put("spellPower", spellPower);
    }
    
}


