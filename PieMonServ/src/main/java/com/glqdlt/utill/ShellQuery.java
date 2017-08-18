package com.glqdlt.utill;

public class ShellQuery {

	public static final String systemNetworkQuery = "ifconfig";
	public static final String systemNetworkPing = "ping 8.8.8.8";

	/**
	 * diskHealthCheck
	 * 
	 * @param diskVolume
	 * @return
	 */
	public static String diskHealthQueryMaker(String diskVolume) {
		return "smartctl --all " + diskVolume;
	}

	/**
	 * diskStorageCheck
	 * 
	 * @param diskVolume
	 * @return
	 */
	public static String diskStorageQueryMaker(String diskVolume) {
		return "df -h | grep " + diskVolume;
	}

	/**
	 * 
	 * @param order
	 *            0 == shutdown , 1 == restart
	 * @param time
	 * @return
	 */
	public static String systemPowerQueryMaker(Integer order, Integer time) {

		switch (order) {

		case 0:
			return "shutdown -s -t " + time;

		case 1:
			return "shutdown -r -t " + time;

		default:
			return "";
		}

	}

}
