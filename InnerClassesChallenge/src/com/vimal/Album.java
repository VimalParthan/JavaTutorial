package com.vimal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
	
	private String artist;
	private String name;
	private SongList songList;
	
	public Album(String artist, String name) {
		super();
		this.artist = artist;
		this.name = name;
		this.songList = new SongList();
	}

	public String getArtist() {
		return artist;
	}

	public String getNme() {
		return name;
	}

	
	
	public SongList getSongList() {
		return songList;
	}

	public boolean addSong(String title ,double duration){
		return songList.add(new Song(title,duration));
	}

	
	
	public boolean addToPlayist(int trackNumber,LinkedList<Song> playList){
		
		Song checkedSong  = this.songList.findSong(trackNumber);
		if(checkedSong!=null){
			playList.add(checkedSong);
			return true;
		}
		System.out.println("This album does not ahve a track "+ trackNumber);
		return false;
	}
	
	public boolean addToPlaylist(String title ,LinkedList<Song> playList){
		Song checkedSong = this.songList.findSong(title);
		if(checkedSong!=null){
			playList.add(checkedSong);
			return true;
		}
		System.out.println("This song "+ title + " is not in the album");
		return false;
	}
	
	private class SongList{
		private List<Song> songs;
		
		public SongList() {
		
			this.songs = new ArrayList<Song>();
		}

		public boolean add(Song song){
			if(findSong(song.getTitle())==null){
				this.songs.add(song);
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
		
		public Song findSong(int trackNumber){
			int index = trackNumber -1;
			if((index>0)&&(index<songs.size())){
				return songs.get(index);
			}
			return null;
		}
		
	}
}
