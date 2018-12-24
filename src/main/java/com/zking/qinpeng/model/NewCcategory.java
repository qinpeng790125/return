package com.zking.qinpeng.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class NewCcategory  implements Serializable{
    private Integer id;

    private Integer nid;

    private Integer cid;

    public NewCcategory(Integer id, Integer nid, Integer cid) {
        this.id = id;
        this.nid = nid;
        this.cid = cid;
    }

    public NewCcategory() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}