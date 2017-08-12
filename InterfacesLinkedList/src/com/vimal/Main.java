package com.vimal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	private static List<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Album album = new Album("Stormbringer", "Deep Purple");
		album.addSong("Stormbringer", 4.6);
		album.addSong("Love don't mean a thing", 4.6);
		album.addSong("Holy man", 4.22);
		album.addSong("Hold on", 4.3);
		album.addSong("Lady double dealer", 5.6);
		album.addSong("You can't do it right", 3.21);
		album.addSong("High ball shooter", 6.23);
		album.addSong("The gypsy", 4.27);
		album.addSong("Soldier of Fortune", 3.13);
		albums.add(album);

		album = new Album("For thos about to rock", "AC/DC");
		album.addSong("For thos about to rock", 5.44);
		album.addSong("I put the finger on you", 3.25);
		album.addSong("Lets go", 3.45);
		album.addSong("Inject the venom", 3.33);
		album.addSong("Snowballed", 4.51);
		album.addSong("Evil walks", 3.45);
		album.addSong("C.O.D", 5.25);
		album.addSong("Breaking the rules", 5.32);
		album.addSong("Night of the long knives", 5.12);
		albums.add(album);

		List<Song> playList = new Vector<Song>();
		albums.get(0).addToPlaylist("You can't do it right", playList);
		albums.get(0).addToPlaylist("Holy man", playList);
		albums.get(0).addToPlaylist("Speaking", playList);
		albums.get(0).addToPlayist(9, playList);
		albums.get(1).addToPlayist(8, playList);
		albums.get(1).addToPlayist(3, playList);
		albums.get(1).addToPlayist(2, playList);
		albums.get(1).addToPlayist(24, playList);
		play(playList);
	}

	private static void play(List<Song> playlist) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playlist.listIterator();
		if (playlist.size() == 0) {
			System.out.println("No songs in playlist");
			scanner.close();
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}

		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				System.out.println("Playlist complete");
				quit = true;
				break;
			case 1:
				if (!forward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				} else {
					System.out.println("We have reached the end of the playlist");
					forward = false;

				}
				break;
			case 2:
				if (forward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				} else {
					System.out.println("We have reached the start of the playlist");
				}
				break;
			case 3:
				if (forward) {
					if (listIterator.hasPrevious()) {
						System.out.println("Now replaying " + listIterator.previous().toString());
						forward = false;
					} else {
						System.out.println("We are at the start of the list");
					}
				} else {
					if (listIterator.hasNext()) {
						System.out.println("Now replaying " + listIterator.next().toString());
						forward = true;
					} else {
						System.out.println("We have reached the end of the playlist;");
					}
				}
				break;
			case 4:
				printList(playlist);
				break;
			case 5:
				printMenu();
				break;
				
			case 6:
				if(playlist.size()>0){
					listIterator.remove();
					if(listIterator.hasNext()){
						System.out.println("now playing "+ listIterator.next());
					}else if (listIterator.hasPrevious()){
						System.out.println("Now playing "+ listIterator.previous());
					}
				}
				break;
			}
		}
		scanner.close();
	}

	private static void printMenu() {
		System.out.println("Available action:\npress");
		System.out.println("0 - to quit");
		System.out.println("1 - to play next song");
		System.out.println("2 - to play previous song");
		System.out.println("3 - to replay the current song");
		System.out.println("4 - list songs in the playlist");
		System.out.println("5 - print available actions.");
		System.out.println("6 - delete current song from playlist.");
	}

	private static void printList(List<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		System.out.println("==============================");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("================================");
	}
}
