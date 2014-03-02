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
class User {
    
    private String type;
    private String id;
    private String name;
    private String login;
    private String created_at;
    private String modified_at;
    private String role;
    private String language;
    private int space_amount;
    private int space_used;
    private int max_upload_size;
    private String[] tracking_codes;
    private boolean can_see_managed_users;
    private boolean is_sync_enabled;
    private String status;
    private String job_title;
    private String phone;
    private String address;
    private String avatar_url;
    private boolean is_exempt_from_device_limits;
    private boolean is_exempt_from_login_verification;
    private User enterprise;
    private String[] my_tags;

    public User() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSpace_amount() {
        return space_amount;
    }

    public void setSpace_amount(int space_amount) {
        this.space_amount = space_amount;
    }

    public int getSpace_used() {
        return space_used;
    }

    public void setSpace_used(int space_used) {
        this.space_used = space_used;
    }

    public int getMax_upload_size() {
        return max_upload_size;
    }

    public void setMax_upload_size(int max_upload_size) {
        this.max_upload_size = max_upload_size;
    }

    public String[] getTracking_codes() {
        return tracking_codes;
    }

    public void setTracking_codes(String[] tracking_codes) {
        this.tracking_codes = tracking_codes;
    }

    public boolean isCan_see_managed_users() {
        return can_see_managed_users;
    }

    public void setCan_see_managed_users(boolean can_see_managed_users) {
        this.can_see_managed_users = can_see_managed_users;
    }

    public boolean isIs_sync_enabled() {
        return is_sync_enabled;
    }

    public void setIs_sync_enabled(boolean is_sync_enabled) {
        this.is_sync_enabled = is_sync_enabled;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public boolean isIs_exempt_from_device_limits() {
        return is_exempt_from_device_limits;
    }

    public void setIs_exempt_from_device_limits(boolean is_exempt_from_device_limits) {
        this.is_exempt_from_device_limits = is_exempt_from_device_limits;
    }

    public boolean isIs_exempt_from_login_verification() {
        return is_exempt_from_login_verification;
    }

    public void setIs_exempt_from_login_verification(boolean is_exempt_from_login_verification) {
        this.is_exempt_from_login_verification = is_exempt_from_login_verification;
    }

    public User getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(User enterprise) {
        this.enterprise = enterprise;
    }

    public String[] getMy_tags() {
        return my_tags;
    }

    public void setMy_tags(String[] my_tags) {
        this.my_tags = my_tags;
    }
    
    
    
}
