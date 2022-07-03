package main.simsource;

public class timer {
    private double currentTime;
    private double resolution;

    public double tick(){
        currentTime +=resolution;
        return currentTime;

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
