package com.infox.dhruv.techfest;

/**
 * Created by Dhruv on 11-Feb-15.
 */
/**
 * Created by Dhruv on 11-Feb-15.
 */
public class Event {
    public String event_name;
    public int image_id;
    public String event_desc;
    public String category;
    public String date;

    public Event(String event_name, int image_id, String event_desc, String category,String date) {
        this.event_name = event_name;
        this.image_id = image_id;
        this.event_desc = event_desc;
        this.category = category;
        this.date = date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getEvent_desc() {
        return event_desc;
    }

    public void setEvent_desc(String event_desc) {
        this.event_desc = event_desc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
