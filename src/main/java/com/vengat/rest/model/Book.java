package com.vengat.rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.security.PublicKey;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/11/13
 * Time: 9:32 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "book")
public class Book {
    @XmlElement(name = "author")
    private Author author;
    private String title;

    public Book() {}

    public Book(Author author, String title) {
        this.author = author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
