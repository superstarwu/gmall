package com.yitong.gmall.bean;

import org.apache.ibatis.type.Alias;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "base_catalog1")
@Alias(value = "baseCatalog1")
public class BaseCatalog1 implements Serializable{
    private static final long serialVersionUID = -4592226929315554832L;

    public BaseCatalog1() {
    }

    public BaseCatalog1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;

    private String name;

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
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "BaseCatalog1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}