package com.kh.chap3.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class B_Properties {
	public void method1() {
		Properties prop = new Properties();
		
		// Key, Value 쌍으로 저장할 때 순서 유지 및 키값 중복은 안 된다.
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		System.out.println(prop);
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		System.out.println();
		
		// Value 값 읽어오기
		System.out.println(prop.getProperty("Set"));
		System.out.println();
		
		Set<Entry<Object, Object>> entrySet = prop.entrySet();
		Iterator<Entry<Object, Object>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<Object, Object> entry = iterator.next();
			
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		
		try {
//			prop.store(new FileOutputStream("test1.properties"), "Properties1");
//			prop.store(new FileWriter("test2.properties"), "Properties2");
			prop.storeToXML(new FileOutputStream("test.xml"), "Xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method2() {
		Properties prop = new Properties();
		
		try {
//			prop.load(new FileInputStream("test1.properties"));
//			prop.load(new FileReader("test2.properties"));
			prop.loadFromXML(new FileInputStream("test.xml"));
			
			System.out.println(prop);
			System.out.println(prop.getProperty("Set"));
			System.out.println(prop.getProperty("List"));
			System.out.println(prop.getProperty("Map"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
