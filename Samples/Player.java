package Samples;

public class Player {
String playername;
String country;

Player(String pname,String cnt)
{
	this.playername=pname;
	this.country=cnt;
}

public String getPlayername() {
	return playername;
}
public void setPlayername(String playername) {
	this.playername = playername;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
 public String toString()
 {
	 return "PlayerName " + playername + " country" + country;
 }
	
}
