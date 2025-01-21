package com.rafael.curso.adapter.tvPort.adapters;

import com.rafael.curso.adapter.tvPort.devices.OldMonitor;
import com.rafael.curso.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {
    // ADAPTER TO CLASS
    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don't work witch sound.");
    }
}
