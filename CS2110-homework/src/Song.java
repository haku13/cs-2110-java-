import java.util.ArrayList;
import java.util.Collections;

public class Song implements Comparable<Song>, Playable{

	private String artist, title;
	private int minutes, seconds;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		if(seconds >= 60){
			while(seconds >= 60){
				seconds -= 60;
				this.minutes += 1;
			}
		}
		this.seconds = seconds;
	}
	
	public Song(String artist, String title){
		this.artist = artist;
		this.title = title;
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public Song(String artist, String title, int minutes, int seconds){
		this.artist = artist;
		this.title = title;
		this.minutes = minutes;
		if(seconds >= 60){
			while(seconds >= 60){
				seconds -= 60;
				this.minutes += 1;
			}
		}
		this.seconds = seconds;
	}
	
	public Song(Song s){
		this.title = s.getTitle();
		this.artist = s.getArtist();
		this.minutes = s.getMinutes();
		this.seconds = s.getSeconds();
	}

	public boolean equals(Object o){
		boolean reVal = false;
		if(o instanceof Song){
			Song s = (Song)o;
			reVal = (this.artist.equals(s.getArtist()))&&(this.title.equals(s.getTitle())
						&& (this.minutes == s.getMinutes()) && this.seconds == s.getSeconds());
		}
		return reVal;
	}
	
	public String toString(){
		return "{Song:title = "+title+" artist = "+artist+"}";
	}
	
	public void play(){
		System.out.printf("Playing Song: artist = %-20s title = %s\n",artist,title);
	}
	
	@Override
	public int compareTo(Song s){
		int reVal = this.artist.compareTo(s.getArtist());
		if(reVal != 0) return reVal;
		else return this.title.compareTo(s.getTitle());
	}
	
	public int getPlayTimeSeconds(){
		return (this.minutes * 60) + this.seconds;
	}
	
	public String getName() {
		return title;
	}
	
	public static void main(String[] args){
		Song s = new Song("Me", "Your song", 2, 155);
		Song s1 = new Song("Me", "Song", 2, 200);
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(s1);
		songs.add(s);
		System.out.println(songs);
		Collections.sort(songs);
		System.out.println(songs);
		s1.setSeconds(45);
		System.out.println(s1.getMinutes() + " " + s1.getSeconds());
		System.out.println(s1.getPlayTimeSeconds());
	}
	
	
}
