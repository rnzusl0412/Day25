package com.test01;

import java.io.*;
import java.net.*;

public class MTest02 {
	// URI���� �ٸ� URI�� �����ϴ� �޼ҵ�
	public static void main(String[] args) throws URISyntaxException, Exception {
		URI base = new URI("http://host/root/abc");
		URI uri = new URI("http://host/root/def/zzz.html");
		URI rel = base.relativize(uri);
		System.out.println(rel);

		System.out.println("====================================");
		base = new URI("http://host/root/abc/../def/index.html").normalize();
		System.out.println(base); // �����ȴ�.
		System.out.println("====================================");

		base = new URI("http://host/root/abc/index.html");
		uri = new URI("../def/zzz.html");
		URI res = base.resolve(uri); // ����URI ���Ŀ� �°� �������ش�.
		System.out.println(res);

		URI u = new URI("file:/C:/test02/a.txt");
		File f = new File(u);
		FileWriter fw = new FileWriter(f);
		fw.write("abecdf");
		fw.close();
	}
}
