package com.hibernate.songDemo.SongHibernate;

public class Song {
	private int songid;
	private String songName;
	private String singer;
	public int getSongid() {
		return songid;
	}
	public void setSongid(int songid) {
		this.songid = songid;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
}
