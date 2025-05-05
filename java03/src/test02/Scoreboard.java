package test02;

public class Scoreboard {
    public String team1;
    public String team2;
    public int score1;
    public int score2;

    public Scoreboard(String teamName1, String teamName2){
        this.team1 = teamName1;
        this.team2 = teamName2;
        this.score1=0;
        this.score2=0;
    }
    public static void main(String[] agrs){
        Scoreboard tm1= new Scoreboard("red","blue");
    }
    public void Scoreboard(){

    }

}
