package com.lpp.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tangcheng on 6/13/2017.
 */
public class GeoVO implements Serializable {
    private String name;
    private List<String> value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }
}
