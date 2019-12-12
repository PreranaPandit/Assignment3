package com.android.assignment3.model;


import java.util.ArrayList;
import java.util.List;

public class DataSet {

    private String stdname;
    private String stdaddress;
    private String stdage;
    private String stdgender;
    private int imageId;


    static List<DataSet> Slist=new ArrayList<>();

    public static List<DataSet> getSlist() {
        return Slist;
    }

    public static void setSlist(List<DataSet> slist) {
        Slist = slist;
    }

    public String getStdgender() {
        return stdgender;
    }

    public   DataSet(String stdname, String stdaddress, String stdage, String stdgender, int imageId) {
        this.stdname = stdname;
        this.stdaddress = stdaddress;
        this.stdage = stdage;
        this.stdgender = stdgender;
        this.imageId = imageId;
    }

    public void setStdgender(String stdgender) {
        this.stdgender = stdgender;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public String getStdaddress() {
        return stdaddress;
    }

    public void setStdaddress(String stdaddress) {
        this.stdaddress = stdaddress;
    }

    public String getStdage() {
        return stdage;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setStdage(String stdage) {
        this.stdage = stdage;
    }


}
