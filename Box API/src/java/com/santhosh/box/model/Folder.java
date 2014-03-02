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
public class Folder {
    
    private String type;
    private String id;
    private String sequence_id;
    private String etag;
    private String name;
    private String created_at;
    private String modified_at;
    private String description;
    private String size;
    private FolderCollection path_collection;
    private User created_by;
    private User modified_by;
    private String trashed_at;
    private String purged_at;
    private String content_created_at;
    private String content_modified_at;
    private User owned_by;
    private SharedLink shared_link;
    private FolderEmail folder_email;
    private Folder parent;
    private String item_status;
    private ItemCollection item;
    private String sync_state;
    private boolean has_collaboration;
    private String[] tags;
    

    public Folder(String id) {
        this.id = id;
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

    public String getSequence_id() {
        return sequence_id;
    }

    public void setSequence_id(String sequence_id) {
        this.sequence_id = sequence_id;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public FolderCollection getPath_collection() {
        return path_collection;
    }

    public void setPath_collection(FolderCollection path_collection) {
        this.path_collection = path_collection;
    }

    public User getCreated_by() {
        return created_by;
    }

    public void setCreated_by(User created_by) {
        this.created_by = created_by;
    }

    public User getModified_by() {
        return modified_by;
    }

    public void setModified_by(User modified_by) {
        this.modified_by = modified_by;
    }

    public String getTrashed_at() {
        return trashed_at;
    }

    public void setTrashed_at(String trashed_at) {
        this.trashed_at = trashed_at;
    }

    public String getPurged_at() {
        return purged_at;
    }

    public void setPurged_at(String purged_at) {
        this.purged_at = purged_at;
    }

    public String getContent_created_at() {
        return content_created_at;
    }

    public void setContent_created_at(String content_created_at) {
        this.content_created_at = content_created_at;
    }

    public String getContent_modified_at() {
        return content_modified_at;
    }

    public void setContent_modified_at(String content_modified_at) {
        this.content_modified_at = content_modified_at;
    }

    public User getOwned_by() {
        return owned_by;
    }

    public void setOwned_by(User owned_by) {
        this.owned_by = owned_by;
    }

    public SharedLink getShared_link() {
        return shared_link;
    }

    public void setShared_link(SharedLink shared_link) {
        this.shared_link = shared_link;
    }

    public FolderEmail getFolder_email() {
        return folder_email;
    }

    public void setFolder_email(FolderEmail folder_email) {
        this.folder_email = folder_email;
    }

    public Folder getParent() {
        return parent;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }

    public String getItem_status() {
        return item_status;
    }

    public void setItem_status(String item_status) {
        this.item_status = item_status;
    }

    public ItemCollection getItem() {
        return item;
    }

    public void setItem(ItemCollection item) {
        this.item = item;
    }

    public String getSync_state() {
        return sync_state;
    }

    public void setSync_state(String sync_state) {
        this.sync_state = sync_state;
    }

    public boolean isHas_collaboration() {
        return has_collaboration;
    }

    public void setHas_collaboration(boolean has_collaboration) {
        this.has_collaboration = has_collaboration;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
    
    
        
}

class SharedLink{
    private String url;
    private String download_url;
    private String vanity_url;
    private boolean is_password_enabled;
    private String unshared_at;
    private int download_count;
    private int preview_count;
    private String access;
    private Permission permission;

    public SharedLink() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getVanity_url() {
        return vanity_url;
    }

    public void setVanity_url(String vanity_url) {
        this.vanity_url = vanity_url;
    }

    public boolean isIs_password_enabled() {
        return is_password_enabled;
    }

    public void setIs_password_enabled(boolean is_password_enabled) {
        this.is_password_enabled = is_password_enabled;
    }

    public String getUnshared_at() {
        return unshared_at;
    }

    public void setUnshared_at(String unshared_at) {
        this.unshared_at = unshared_at;
    }

    public int getDownload_count() {
        return download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }

    public int getPreview_count() {
        return preview_count;
    }

    public void setPreview_count(int preview_count) {
        this.preview_count = preview_count;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
    
    
    
}
class FolderEmail{
    private String access;
    private String email;

    public FolderEmail() {
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
class ItemCollection{
    private int total_count;
    private int offset;
    private int limit;
    private List<Folder> folderlist;
    private List<File> filelist;

    public ItemCollection() {
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<Folder> getFolderlist() {
        return folderlist;
    }

    public void setFolderlist(List<Folder> folderlist) {
        this.folderlist = folderlist;
    }

    public List<File> getFilelist() {
        return filelist;
    }

    public void setFilelist(List<File> filelist) {
        this.filelist = filelist;
    }
    
    
}