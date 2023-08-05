package RPS;

public class Player {
    String name;
    int score;
    String choice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Player(String name, int score, String choice) {
        this.name = name;
        this.score = score;
        this.choice = choice;
    }
}
