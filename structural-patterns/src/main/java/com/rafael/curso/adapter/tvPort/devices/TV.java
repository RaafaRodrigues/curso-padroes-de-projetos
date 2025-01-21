package com.rafael.curso.adapter.tvPort.devices;

import com.rafael.curso.adapter.tvPort.intefaces.HDMI;

public class TV implements HDMI {
	
	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(">>> This is your sound: " + sound);
	}

}
