package com.test02;

import java.net.*;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		String str = "egoing";
		byte[] bf = str.getBytes();
		DatagramPacket dp = new DatagramPacket(bf, bf.length, InetAddress.getByName("192.168.0.190"), 5000);
		ds.send(dp);
		ds.close();
	}
}
