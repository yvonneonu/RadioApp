package com.example.radioapp;

import java.util.ArrayList;
import java.util.List;

public class radioList {
    List<radiomodel> radioContainer = new ArrayList<>();

    public List<radiomodel> station() {
        return radioContainer;
    }

    public radioList() {
        addRadio();

    }

    public void addRadio() {
        radiomodel beatFm = new radiomodel("http://20323.live.streamtheworld.com/ASPEN_SC");
        radiomodel coolFm = new radiomodel("http://voa28.akacast.akamaistream.net/7/325/437810/v1/ibb.akacast.akamaistream.net/voa28");
        radioContainer.add(beatFm);
        radioContainer.add(coolFm);
    }

}
