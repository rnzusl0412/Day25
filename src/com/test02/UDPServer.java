package com.test02;

import java.net.*;

public class UDPServer {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		DatagramSocket ds = new DatagramSocket(5000);

		byte[] plz = new byte[10];

		InetAddress ia = InetAddress.getByName("192.168.0.190");
		DatagramPacket dp = new DatagramPacket(plz, plz.length);

		ds.receive(dp);

		for (byte r : dp.getData()) {
			System.out.print(r + " ");
		}

		ds.close();
	}

}
