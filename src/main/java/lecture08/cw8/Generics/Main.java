package lecture08.cw8.Generics;

public class Main {
    public static void main(String[] args) {

        League<Team<SoccerTeam>> pl = new League<>("Premier League");
        League<Team<FootballTeam>> nfl = new League<>("National Football League");
        League<Team<BaseballTeam>> mlb = new League<>("Major League Baseball");

        Team<SoccerTeam> chelsea = new Team<>("Chelsea");
        Team<SoccerTeam> liverpool = new Team<>("Liverpool");

        Team<FootballTeam> newEnglandPatriots = new Team<>("New England Patriots");
        Team<FootballTeam> dallasCowboys = new Team<>("Dallas Cowboys");

        Team<BaseballTeam> newYorkYankees = new Team<>("New York Yankees");
        Team<BaseballTeam> losAngelesDodgers = new Team<>("Los Angeles Dodgers");

        System.out.println("Premier League:");

        pl.addTeam(chelsea);
        pl.addTeam(liverpool);


        chelsea.matchResult(liverpool, 2, 1);
        liverpool.matchResult(chelsea, 0, 0);

        System.out.println();
        pl.showLeagueTable();
        System.out.println();
        System.out.println("National Football League:");

        nfl.addTeam(newEnglandPatriots);
        nfl.addTeam(dallasCowboys);

        newEnglandPatriots.matchResult(dallasCowboys, 41, 26);
        dallasCowboys.matchResult(newEnglandPatriots, 10, 20);

        System.out.println();
        nfl.showLeagueTable();
        System.out.println();
        System.out.println("Major League Baseball:");

        mlb.addTeam(newYorkYankees);
        mlb.addTeam(losAngelesDodgers);

        newYorkYankees.matchResult(losAngelesDodgers, 3, 6);
        losAngelesDodgers.matchResult(newYorkYankees, 2, 5);


        System.out.println();
        mlb.showLeagueTable();
    }
}