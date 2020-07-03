package proiectDesignPatterns.obseverPattern;

public interface Subject {
    public void registerObserver (Observer O);
    public void removeObserver (Observer o);
    public void notifyObservers();
}
