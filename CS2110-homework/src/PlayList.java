import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayList implements Playable {

	private String name;
	private ArrayList<Playable> playableList = new ArrayList<Playable>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Playable> getPlayableList() {
		return playableList;
	}
	public void setPlayableList(ArrayList<Playable> playableList) {
		this.playableList = playableList;
	}
	
	public String toString(){
		String str = name + "\n";
		for(Playable pl:playableList){
			str += pl.toString() + "\n";
		}
		return str;
	}
	
	public PlayList(){
		name = "Untitled";
		playableList = new ArrayList<Playable>();
	}
	
	public PlayList(String name){
		this.name = name;
		playableList = new ArrayList<Playable>();
	}
	
	public boolean loadSongs(String filename){
		File input = new File(filename);
		Scanner inputFile;
		try{
			inputFile = new Scanner(input);
		} catch(FileNotFoundException e) {
			return false;
		}
		while(inputFile.hasNextLine()){
			String title = inputFile.nextLine().trim();
			String artist = inputFile.nextLine().trim();
			String time = inputFile.nextLine().trim();
			int minutes = Integer.parseInt(time.substring(0, time.indexOf(':')));
			int seconds = Integer.parseInt(time.substring(time.indexOf(':')+1));
			
			inputFile.nextLine();
			
			Song s = new Song(artist, title, minutes, seconds);
			this.addSong(s);
		}
		inputFile.close();
		return true;
			
	}
	
	public boolean clear(){
		playableList.clear();
		return true;
	}
	
	public boolean addSong(Song s){
		return playableList.add(s);
	}
	
	public Playable removePlayable(int index){
		if(index < 0 || index >= playableList.size()){
			return null;
		}
		return playableList.remove(index);
	}
	
	public Playable removePlayable(Playable p){
		while(playableList.contains(p)){
			playableList.remove(p);
		}
		return p;
	}
	
	public Playable getPlayable(int index){
		if(index < 0 || index >= playableList.size()){
			return null;
		}
		return playableList.get(index);
	}
	
	public boolean addPlayList(PlayList pl){
		for(Playable p: playableList){
			if(p instanceof PlayList){
				if(p.getName().equals(pl.getName())){
					return false;
				}
			}
		}
		playableList.add(pl);
		return true;
	}
	
	public void play(){
		for(Playable p: playableList){
			p.play();
		}
	}
	
	public int size(){
		int number = 0;
		for(Playable p : playableList){
			if(p instanceof PlayList){
				PlayList pl = (PlayList)p;
				number += pl.size() + 1;
			}
			if(p instanceof Song){
				System.out.println(p);
				number += 1;
			}
			
		}
		return number;
	}
	
	public int getPlayTimeSeconds(){
		int sec = 0;
		for(Playable p : playableList){
			sec += p.getPlayTimeSeconds();
		}
		return sec;
	}
	
	public void sortByName(){
		Collections.sort(playableList,new PlayableSortByName());
	}
	
	/*public void sortByTime(){
		Collections.sort(playableList, new PlayableSortByTime());
	}
	*/
	public static void main(String[] args){
		PlayList pl = new PlayList("mine");
		
		pl.loadSongs("simple.txt");
		Song s = new Song("me", "hello", 2, 5);
		pl.addSong(s);
		PlayList p2 = new PlayList("yours");
		
		Song s1 = new Song("goodby", "love", 1, 30);
		Song s2 = new Song("sweet", "good", 1, 45);
		
		p2.addSong(s2);
		p2.addSong(s1);
		pl.addPlayList(p2);
		
		System.out.println(pl.size());
		
	}
	
}
