package com.example.thuytq_pc.timbus.Model;

import java.util.ArrayList;

/**
 * Created by THUYTQ-PC on 04-Oct-17.
 */

public class BusCar {
    public String name;
    public boolean status;
    public ArrayList<String> chuyenDen;
    public ArrayList<String> chuyenDi;
    public int image;
    public BusCar(String name, boolean status, ArrayList<String> chuyenDen, ArrayList<String> chuyenDi) {
        this.name = name;
        this.status = status;
        this.chuyenDen = chuyenDen;
        this.chuyenDi = chuyenDi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<String> getChuyenDen() {
        return chuyenDen;
    }

    public void setChuyenDen(ArrayList<String> chuyenDen) {
        this.chuyenDen = chuyenDen;
    }

    public ArrayList<String> getChuyenDi() {
        return chuyenDi;
    }

    public void setChuyenDi(ArrayList<String> chuyenDi) {
        this.chuyenDi = chuyenDi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
