package com.kh.chap3.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class A_Date {
	public void method1() {
		// Date 클래스에서 날짜, 시간을 어떻게 처리하는지
		// 기본 생성자를 통해서 Date 객체를 생성하면 현재 시간과 날짜에 대한 정보를 가지고 객체를 생성한다.
		Date now = new Date();
		
		System.out.println(now.toString());
		
		// 1970년 1월 1일 00시를 기준으로 밀리 세컨드 단위로 표기된다.
		// 한국시간(KST)로 출력 될 땐 GMT(그리니치평균시) 보다 +9 증가된 시간으로 표시된다.
		Date when = new Date(1);
		
		System.out.println(when);
		
		when = new Date(1000);
		
		System.out.println(when);
		
		// Deprecated 된 생성자를 사용한 Date 객체 생성
		Date when2 = new Date((2021 - 1900), (9 - 1), 7);
		
		System.out.println(when2);
		
		System.out.println(now.getTime());
		System.out.println(now.getYear() + 1900);
		System.out.println(now.getMonth() + 1);
		System.out.println(now.getDate());
		System.out.println(now.getDay());
		System.out.println(now.getHours());
		System.out.println(now.getMinutes());
		System.out.println(now.getSeconds());
		
		// SimpleDateFormat 클래스 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss:SSS초 (E) a");
		String formatDate = sdf.format(now);
		
		System.out.println(formatDate);
	}

	public void method2() {
		/*
		 * Date는 대부분의 메소드가 Deprecated 되었고, 단순히 특정 시점의 날짜 정보를 저장하는 역할만 한다.
		 * 자바 8부터는 날짜와 시간을 나타내는 java.time 패키지를 제공한다.
		 */
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime when = LocalDateTime.of(2021, 5, 25, 22, 30, 25);
		
		System.out.println(now);
		System.out.println(when);
		System.out.println();
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		System.out.println();
		
		LocalDateTime plusDays = now.plusDays(1).plusMonths(1).plusYears(1);
		LocalDateTime minusDays = now.minusDays(1);
		
		System.out.println(now);
		System.out.println(plusDays);
		System.out.println(minusDays);
		System.out.println();
		
		System.out.println(now.isAfter(plusDays));
		System.out.println(now.isBefore(plusDays));
		System.out.println(now.isAfter(minusDays));
		System.out.println(now.isBefore(minusDays));
		System.out.println();
		
//		LocalDate localDate = LocalDate.now();
//		LocalDate localDate = LocalDate.of(2021, 05, 25);
		LocalDate localDate = now.toLocalDate();
//		LocalTime localTime = LocalTime.now();
//		LocalTime localTime = LocalTime.of(22, 30, 50);
		LocalTime localTime = now.toLocalTime();
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println();
		
		// D-DAY
//		Period perior = Period.between(plusDays.toLocalDate(), minusDays.toLocalDate());
//		System.out.println("D-DAY : " + perior.getDays());
//		
//		long between = ChronoUnit.DAYS.between(plusDays.toLocalDate(), minusDays.toLocalDate());
//		System.out.println(between);
		
		// 문자열을 LocalDate 객체로 파싱
//		localDate = LocalDate.parse("2021-06-25");
//		localDate = LocalDate.parse("2021.06.25", DateTimeFormatter.ofPattern("yyyy.MM.dd"));
		localDate = LocalDate.parse("20210625", DateTimeFormatter.BASIC_ISO_DATE);
		
		System.out.println(localDate);
		System.out.println();
		
		// LocalDateTime 객체를 문자열로 포맷팅
		System.out.println(now.toString());
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초")));
		System.out.println(now.format(DateTimeFormatter.ISO_ORDINAL_DATE));
		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(ZonedDateTime.now());
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
	}

}
