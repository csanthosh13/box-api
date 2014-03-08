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
public class Collaboration {
    
    private String type;
    private String id;
    private User created_by;
    private String created_at;
    private String modified_at;
    private String expires_at;
    private String status;
    private User accessible_by;
    private String role;
    private String acknowledged_at;
    private Folder item;

    public Collaboration(String id) {
        this.id = id;
    }

    public Collaboration() {
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

    public String getModified_at() {
        return modified_at;
    }

    public void setModified_at(String modified_at) {
        this.modified_at = modified_at;
    }

    public String getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getAccessible_by() {
        return accessible_by;
    }

    public void setAccessible_by(User accessible_by) {
        this.accessible_by = accessible_by;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAcknowledged_at() {
        return acknowledged_at;
    }

    public void setAcknowledged_at(String acknowledged_at) {
        this.acknowledged_at = acknowledged_at;
    }

    public Folder getItem() {
        return item;
    }

    public void setItem(Folder item) {
        this.item = item;
    }
    
    
    
    
}
