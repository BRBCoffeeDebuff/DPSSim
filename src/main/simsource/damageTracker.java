package main.simsource;

import java.util.Map;

public class damageTracker implements damageDoneEvent {
    
    // structure of damageTakenMap will be <time, damage>
    private Map<Double,  Double> damageTakenMap = new java.util.HashMap<Double, Double>();
    @Override
    public void onDamageDone(double damage, double currentTime) {
        damageTakenMap.put(currentTime, damage);
        
    }

    /**
     * 
     * @return map of format <time, damage>
     */
    public Map<Double, Double> getDamageTakenMap() {
        return damageTakenMap;
    }
    
}
