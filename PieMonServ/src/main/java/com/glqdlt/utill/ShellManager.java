package com.glqdlt.utill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.glqdlt.system.OSSetter;

public class ShellManager {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("ipconfig");
		Process p = pb.start();

		try (InputStream is = p.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, OSSetter.windows.getEncoding());
				BufferedReader br = new BufferedReader(isr);) {

			String line = "";
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
			System.out.println(sb.toString());
		}
		String encoding = new java.io.OutputStreamWriter(System.out).getEncoding();
		System.out.println("Encoding : " + encoding);
		p.destroy();
	}
}
