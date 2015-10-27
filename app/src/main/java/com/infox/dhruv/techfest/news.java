package com.infox.dhruv.techfest;

/**
 * Created by Dhruv on 13-Mar-15.
 */
public class news {
    String header;
    String info;

    public news(String header, String info) {
        this.header = header;
        this.info = info;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
