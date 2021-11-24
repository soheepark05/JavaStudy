package com.kh.chap2._abstract;

public class BasketBall extends Sports {
	
	public BasketBall() {
	}
	
	public BasketBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}
	
	@Override
	public void rule() {
		System.out.println("BasketBall의 선수는 " + super.getNumberOfPlayers() + "명, 공을 던져서 링에 넣어야한다.");
	}
}
