package test02b;

public class Scoreboard {
    private final String team1;
    private final String team2;
    private boolean activeTeam;
    private int point1 = 0;
    private int point2 = 0;

    public Scoreboard(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.activeTeam = true;
    }

    public static void main(String[] args) {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        info = game.getScore();
        System.out.println("info = " + info);
        game.recordPlay(1);
        info = game.getScore();
        System.out.println("info = " + info);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println("info = " + info);
        info = game.getScore();
        System.out.println("info = " + info);
        game.recordPlay(3);
        info = game.getScore();
        System.out.println("info = " + info);
        game.recordPlay(1);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println("info = " + info);
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println("info = " + info);
    }

    public String getScore() {
        String activeTeamName;
        if (activeTeam) {
            activeTeamName = team1;
        } else {
            activeTeamName = team2;
        }
        return "" + point1 + "-" + point2 + "-" + activeTeamName;
    }

    public void recordPlay(int points) {
        if (this.activeTeam) {
            this.point1 = this.point1 + points;
        } else {
            this.point2 = this.point2 + points;
        }
        if (points == 0) {
            this.activeTeam = !this.activeTeam;
        }
    }
}
