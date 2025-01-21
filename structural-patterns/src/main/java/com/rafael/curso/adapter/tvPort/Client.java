package com.rafael.curso.adapter.tvPort;

import com.rafael.curso.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import com.rafael.curso.adapter.tvPort.adapters.HDMIToVGAAdapter;
import com.rafael.curso.adapter.tvPort.devices.Computer;
import com.rafael.curso.adapter.tvPort.devices.OldMonitor;
import com.rafael.curso.adapter.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.connectPort(new HDMIToOldMonitorAdapter());
		computer.sendImageAndSound("IMAGE OLD MONITOR", "SOUND OLD MONITOR");

		System.out.println("------------------------------------------------");

		computer = new Computer();
		computer.connectPort(new TV());
		computer.sendImageAndSound("IMAGE TV", "SOUND TV");

		System.out.println("------------------------------------------------");

		computer = new Computer();
		computer.connectPort(new HDMIToVGAAdapter(new OldMonitor()));
		computer.sendImageAndSound("IMAGE OLD MONITOR", "SOUND OLD MONITOR");
	}
}
