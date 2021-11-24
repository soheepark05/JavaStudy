package com.kh.chap2._abstract;

public class FootBall extends Sports {
	
	public FootBall() {
	}
	
	public FootBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}	
	
	@Override
	public void rule() {
		System.out.println("FootBall의 선수는 " + super.getNumberOfPlayers() + "명, 손이 아닌 발로 공을 차야한다.");
	}
}
