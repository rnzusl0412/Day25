package com.test01;

import java.net.*;

public class MTest01 {
	public static void main(String[] args) throws UnknownHostException {
		/*
		 * InetAddress ia = InetAddress.getLocalHost(); System.out.println(ia);
		 * System.out.println(ia.getHostName());
		 * System.out.println(ia.getHostAddress());
		 */
		InetAddress ia = InetAddress.getByName("cnu.ac.kr");
		System.out.println(ia);
		System.out.println(ia.getHostName());
		System.out.println(ia.getHostAddress());
		// public byte[] getAddress()

		byte[] bip = ia.getAddress();
		System.out.println();
		for (byte r : bip) {
			System.out.print(r + ".");
		}
		System.out.println("\n\n===============================");
		InetAddress[] res = InetAddress.getAllByName("cnu.ac.kr");
		for (InetAddress r : res) {
			System.out.println(r.toString());
		}

	}
}
