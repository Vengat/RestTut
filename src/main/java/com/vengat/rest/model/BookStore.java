package com.vengat.rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/11/13
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "bookStore")
public class BookStore {

    private List<Book> books;
    @XmlElement(name = "storeName")
    private String name;

    public BookStore() {}

    public BookStore(List<Book> books, String name) {
        this.books = books;
        this.name = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
