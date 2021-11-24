package com.kh.chap2._abstract;

public abstract class Sports {
	// 참여하는 사람의 수
	private int numberOfPlayers;
	
	public Sports() {
	}

	public Sports(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public abstract void rule(); // 각 스포츠마다 그에 따른 룰을 반드시 정의해야 된다.
}
