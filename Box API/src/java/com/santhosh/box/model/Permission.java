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
class Permission {
    
    private boolean can_download;
    private boolean can_preview;
    private boolean can_upload;
    private boolean can_comment;
    private boolean can_rename;
    private boolean can_delete;
    private boolean can_share;
    private boolean can_set_share_access;

    public boolean isCan_download() {
        return can_download;
    }

    public void setCan_download(boolean can_download) {
        this.can_download = can_download;
    }

    public boolean isCan_preview() {
        return can_preview;
    }

    public void setCan_preview(boolean can_preview) {
        this.can_preview = can_preview;
    }

    public boolean isCan_upload() {
        return can_upload;
    }

    public void setCan_upload(boolean can_upload) {
        this.can_upload = can_upload;
    }

    public boolean isCan_comment() {
        return can_comment;
    }

    public void setCan_comment(boolean can_comment) {
        this.can_comment = can_comment;
    }

    public boolean isCan_rename() {
        return can_rename;
    }

    public void setCan_rename(boolean can_rename) {
        this.can_rename = can_rename;
    }

    public boolean isCan_delete() {
        return can_delete;
    }

    public void setCan_delete(boolean can_delete) {
        this.can_delete = can_delete;
    }

    public boolean isCan_share() {
        return can_share;
    }

    public void setCan_share(boolean can_share) {
        this.can_share = can_share;
    }

    public boolean isCan_set_share_access() {
        return can_set_share_access;
    }

    public void setCan_set_share_access(boolean can_set_share_access) {
        this.can_set_share_access = can_set_share_access;
    }
    
    
}
