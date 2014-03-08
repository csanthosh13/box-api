/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.santhosh.box.model;

/**
 *
 * @author sanchand
 */
public class Comment {
    
    private String type;
    private String id;
    private boolean is_reply_comment;
    private String message;
    private String tagged_message;
    private User created_by;
    private String created_at;
    private String modified_at;
    private Item item;

    public Comment(String id) {
        this.id = id;
    }

    public Comment() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIs_reply_comment() {
        return is_reply_comment;
    }

    public void setIs_reply_comment(boolean is_reply_comment) {
        this.is_reply_comment = is_reply_comment;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTagged_message() {
        return tagged_message;
    }

    public void setTagged_message(String tagged_message) {
        this.tagged_message = tagged_message;
    }

    public User getCreated_by() {
        return created_by;
    }

    public void setCreated_by(User created_by) {
        this.created_by = created_by;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getModified_at() {
        return modified_at;
    }

    public void setModified_at(String modified_at) {
        this.modified_at = modified_at;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    
    
}

class Item{
    private String id;
    private String type;

    public Item(String id) {
        this.id = id;
    }

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
