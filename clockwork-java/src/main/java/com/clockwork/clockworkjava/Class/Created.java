package com.clockwork.clockworkjava.Class;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class Created {


    @JsonProperty
    public String id;
    @JsonProperty
    public String epic_name;
    @JsonProperty
    public String Summary;
    @JsonProperty
    public String Author;
    @JsonProperty
    public String time_master;
    @JsonProperty
    public String time_spent;
    @JsonProperty
    public String creation_date;
    @JsonProperty
    public String closed_date;
    @JsonProperty
    public String status;
    @JsonProperty
    public String resolution;
    @JsonProperty
    public String labels;

    private Map<String, Object> optional = new HashMap<>();

    public Created() { }

    @JsonAnySetter
    public void addOptional(String name, Object value) {
        optional.put(name, value);
    }
    @JsonAnyGetter
    public Object getOptional(String name)  {
        return optional.get(name);
    }






}
