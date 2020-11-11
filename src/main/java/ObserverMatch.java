
public class ObserverMatch implements Observer {
    private String id;

    private String score;

    public ObserverMatch(String id) {
        this.id = id;
    }

    @Override
    public void update(Object score) {
        System.out.println("(observer-" + id + ") risultato: " + (String) score);
        this.score = (String) score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}