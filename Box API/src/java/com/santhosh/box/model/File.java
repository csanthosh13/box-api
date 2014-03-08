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
class File {
    
    private String type;
    private String id;
    private String sequence_id;
    private String etag;
    private String sha1;
    private String name;
    private String description;
    private int size;
    private FolderCollection collection;
    private String created_at;
    private String modified_at;
    private String trashed_at;
    private String purged_at;
    private String content_created_at;
    private String content_modified_at;
    private User created_by;
    private User modified_by;
    private User owned_by;
    private SharedLink shared_link;
    private Folder parent;
    private String item_status;
    private String version_number;
    private int comment_count;
    private Permission permission;
    private String[] tags;
    private String extension;
    private Lock lock;

    public File(String id) {
        this.id = id;
    }

    public File() {
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

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public FolderCollection getCollection() {
        return collection;
    }

    public void setCollection(FolderCollection collection) {
        this.collection = collection;
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

    public String getVersion_number() {
        return version_number;
    }

    public void setVersion_number(String version_number) {
        this.version_number = version_number;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }
    
    
    
    
    
}
