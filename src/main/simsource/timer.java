package main.simsource;

import java.util.ArrayList;
import java.util.List;

public class timer {
    private double currentTime;
    private double resolution;
    public List<timerEvent> timers;
    public timer(double resolution){
        this.resolution = resolution;
        this.currentTime = 0;
        this.timers = new ArrayList();
    }
    public void tick(){
        this.currentTime += this.resolution;
        for(timerEvent timer : this.timers){
                timer.onTimerTick(this.resolution);
        }
    }
 
    public void addTimerListener(timerEvent timer){
        this.timers.add(timer);
    }
    
    public double getCurrentTime() {
        return this.currentTime;
    }

    public void setCurrentTime(double currentTime) {
        this.currentTime = currentTime;
    }

    public double getResolution() {
        return this.resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

}
