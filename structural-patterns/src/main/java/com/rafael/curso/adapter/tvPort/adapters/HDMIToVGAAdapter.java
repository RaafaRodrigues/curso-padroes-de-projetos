package com.rafael.curso.adapter.tvPort.adapters;

import com.rafael.curso.adapter.tvPort.intefaces.HDMI;
import com.rafael.curso.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
    // ADAPTER TO OBJECT.
    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("Connecting the HDMI/VGA Adapter...");
        this.vga = vga;
    }


    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA.");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don't work witch sound.");
    }
}
