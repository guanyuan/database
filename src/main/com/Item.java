package com;

public class Item {
    private String user_id;
    private String user_name;
    private String item_id;
    private String item_name;

    public Item(String user_id, String user_name, String item_id, String item_name) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.item_id = item_id;
        this.item_name = item_name;
    }

    public Item() {

    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getItem_id() {
        return item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }
}
