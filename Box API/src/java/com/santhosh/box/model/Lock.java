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
class Lock {
    
    private String type;
    private String id;
    private User created_by;
    private String created_at;
    private String expires_at;
    private boolean is_download_prevented;

    public Lock() {
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

    public String getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }

    public boolean isIs_download_prevented() {
        return is_download_prevented;
    }

    public void setIs_download_prevented(boolean is_download_prevented) {
        this.is_download_prevented = is_download_prevented;
    }
    
    
    
}
