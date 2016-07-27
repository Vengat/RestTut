package com.vengat.rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/11/13
 * Time: 9:32 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "author")
public class Author {
    @XmlElement(name = "authorName")
    private String name;

    public Author() {}

    public Author(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
