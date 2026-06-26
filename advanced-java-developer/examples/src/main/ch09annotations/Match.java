package ch09annotations;

@Author(name = "Brian", company = "Whatever")
public class Match {

    private int homeGoals;
    private int awayGoals;
    private String homeTeam;
    private String awayTeam;

    public Match(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @Override
    public String toString() {
        return homeTeam + " " + homeGoals + ", " + awayTeam + " " + awayGoals;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }
}
