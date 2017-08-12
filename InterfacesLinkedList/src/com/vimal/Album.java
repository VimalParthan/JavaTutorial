package com.vimal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
	
	private String artist;
	private String name;
	private ArrayList<Song> songs;
	
	public Album(String artist, String name) {
		super();
		this.artist = artist;
		this.name = name;
		this.songs = new ArrayList<Song>();
	}

	public String getArtist() {
		return artist;
	}

	public String getNme() {
		return name;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}
	
	public boolean addSong(String title ,double duration){
		if(findSong(title)==null){
			this.songs.add(new Song(title,duration));
			return true;
		}
		return false;
		
	}

	private Song findSong(String  title){
		for(Song checkedSong: this.songs){
			if(checkedSong.getTitle().equals(title)){
				return checkedSong;
			}
		}
		return null;
	}
	
	public boolean addToPlayist(int trackNumber,List<Song> playList){
		
		int index = trackNumber-1;
		if((index>0)&&index<=this.songs.size()){
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not ahve a track "+ trackNumber);
		return false;
	}
	
	public boolean addToPlaylist(String title ,List<Song> playList){
		Song checkedSong = findSong(title);
		if(checkedSong!=null){
			playList.add(checkedSong);
			return true;
		}
		System.out.println("This song "+ title + " is not in the album");
		return false;
	}
	
}
