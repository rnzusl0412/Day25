package com.test01;

import java.io.*;
import java.net.*;

public class MTest02 {
	// URI에서 다른 URI를 생성하는 메소드
	public static void main(String[] args) throws URISyntaxException, Exception {
		URI base = new URI("http://host/root/abc");
		URI uri = new URI("http://host/root/def/zzz.html");
		URI rel = base.relativize(uri);
		System.out.println(rel);

		System.out.println("====================================");
		base = new URI("http://host/root/abc/../def/index.html").normalize();
		System.out.println(base); // 배제된다.
		System.out.println("====================================");

		base = new URI("http://host/root/abc/index.html");
		uri = new URI("../def/zzz.html");
		URI res = base.resolve(uri); // 정규URI 서식에 맞게 리턴해준다.
		System.out.println(res);

		URI u = new URI("file:/C:/test02/a.txt");
		File f = new File(u);
		FileWriter fw = new FileWriter(f);
		fw.write("abecdf");
		fw.close();
	}
}
