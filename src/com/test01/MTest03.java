package com.test01;

import java.io.File;
import java.net.URI;

public class MTest03 {
	public static void main(String[] args) {
		File dir = new File("c:\\Tomcat 8.5\\webapps\\");
		File f = new File("c:\\Tomcat 8.5\\webapps\\Test\\index.html");

		URI fru = dir.toURI().relativize(f.toURI());
		System.out.printf("URI : %s\n",fru);
		System.out.println("=========================");
		File rf = new File(fru.toString());

		System.out.println("File : " + rf + "\n");
		System.out.println(rf.isAbsolute());
	}
}
