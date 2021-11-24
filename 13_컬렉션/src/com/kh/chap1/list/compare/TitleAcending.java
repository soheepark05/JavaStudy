package com.kh.chap1.list.compare;

import java.util.Comparator;

import com.kh.chap1.list.model.vo.Music;

public class TitleAcending implements Comparator<Music> {

	@Override
	public int compare(Music music1, Music music2) {
		/*
		 * 반환되는 정수값을 가지고 정렬 기준을 잡는다.
		 *   - 두 개의 매개값을 받아서 비교 후 정수값을 리턴한다.
		 *   - 비교해서 같으면 0을 반환하고, 첫 번째 인자가 크다면 양의 정수를 반환하고, 두 번째 인자가 크다면 음의 정수를 반환한다.
		 */
		
		//문자열에서 구현되어 있는 compareTo() 메소드를 사용한다.
		return music1.getTitle().compareTo(music2.getTitle());
	}

}
