package src.main.models;

import java.util.HashMap;

public class Game {
    private HashMap<Team, Integer> scoreboard;
    static int gameCount;

    public Game(Team home, Team away){
        this.scoreboard =new HashMap<>();
        this.scoreboard.put(new Team(home), 0);
        this.scoreboard.put(new Team(away), 0);
        gameCount++;
    }

    public Integer getScore(Team team){
        return this.scoreboard.get(team);
    }

    public void setScore(Team team, Integer score){
        scoreboard.put(team, score);
    }

    public Team getTeam(String name){
        return this.scoreboard.keySet().stream()
        .filter((key)->key.getHouse().equals(name))
        .findFirst()
        .orElse(null);
    }
}
