import java.util.*;

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here

    public void getWinner(){
        String maxKey = "initial";
        int maxValue = 0;
        for(String i : players.keySet())
        {
            if(players.get(i) > maxValue)
            {
                maxKey = i;
                maxValue = players.get(i);
            }
        }
        System.out.println(maxKey);
    }
}

