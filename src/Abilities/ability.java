package Abilities;

import Buffs.buffEvent;
import main.simsource.importableClass;
import main.simsource.timerEvent;
import main.simsource.damageDoneEvent;
public interface ability extends importableClass, timerEvent, buffEvent{

    

    public void importCSVMembers(String[] dataToImport);


    public void cast();


    @Override
    public void onTimerTick(double resolution);

    /**
     * this will kick off the finish of an ability cast and will call the onAbilityCast method of the damageTakenListeners
     */
    public void finishAbilityCast();



}
