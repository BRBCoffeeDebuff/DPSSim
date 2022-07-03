package Buffs;

public interface buffEvent {
    /**
     * onBuffEvent will listen for changes changes to a buff and will then push those changes to the listeners
     */
    public void onBuffEvent(buff buff, double currentTime);
}
