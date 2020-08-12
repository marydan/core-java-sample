package Samples;

import java.util.HashMap;

public class MatchHash {
	
	Player players[];
	  HashMap<String,Player> playermap=new HashMap<String,Player>();
	
	public void setPlayer()
	{
		
		players=new Player[3];
		
  players[0]=new Player("Ashik","India");
  players[1]=new Player("Wilson","India");
  players[2]=new Player("Mart","UK");
	


  playermap.put("first", players[0]);
  playermap.put("second", players[1]);
  playermap.put("third", players[2]);
  
  
	}
	
	public Player searchPlayer(String key)
	{
		
		return playermap.get(key);
		
	}
	
	
	public static void main(String[] args) {
	 
		MatchHash match=new MatchHash();
		match.setPlayer();
		Player player=match.searchPlayer("first");
		System.out.println(player.toString());
		
	}

}
