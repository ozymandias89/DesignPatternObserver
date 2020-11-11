import java.util.ArrayList;
import java.util.List;

public class ObservableMatch {
    private String matchScore;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        //notifico il risultato iniziale non appena un observer si sottoscrive
        observer.update(this.matchScore);
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public ObservableMatch() {
        this.matchScore = "0-0";
    }

    public void setMatchScore(String newScore) {
        this.matchScore = newScore;
        for (Observer observer : this.observers) {
            observer.update(this.matchScore);
        }
    }

    public String getMatchScore() {
        return matchScore;
    }


    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}