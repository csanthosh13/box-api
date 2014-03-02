/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.santhosh.box.model;

import java.util.List;

/**
 *
 * @author sanchand
 */
class FolderCollection {
    
    private int total_count;
    private List<Folder> folderlist;

    public FolderCollection() {
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public List<Folder> getFolderlist() {
        return folderlist;
    }

    public void setFolderlist(List<Folder> folderlist) {
        this.folderlist = folderlist;
    }
    
    
    
    
}
