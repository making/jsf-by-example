package org.javaserverfaces.chapter03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;

@Named(value = "authorController")
@Scope("session")
public class AuthorController implements Serializable {

    private String newAuthorFirst;
    private String newAuthorLast;
    private String bio;
    private List<Author> authorList;

    public AuthorController() {
        populateAuthorList();
    }

    private void populateAuthorList() {
        authorList = new ArrayList<>();
        authorList.add(new Author("Josh", "Juneau", null));
        authorList.add(new Author("Carl", "Dea", null));
        authorList.add(new Author("Mark", "Beaty", null));
        authorList.add(new Author("John", "O'Conner", null));
        authorList.add(new Author("Freddy", "Guime", null));
    }

    public void addAuthor() {
        getAuthorList().add(
                new Author(this.getNewAuthorFirst(),
                        this.getNewAuthorLast(), 
                        this.getBio()));
        
        this.setNewAuthorFirst(null);
        this.setNewAuthorLast(null);
        this.setBio(null);
    }

    public String getNewAuthorFirst() {
        return newAuthorFirst;
    }

    public void setNewAuthorFirst(String newAuthorFirst) {
        this.newAuthorFirst = newAuthorFirst;
    }

    public String getNewAuthorLast() {
        return newAuthorLast;
    }

    public void setNewAuthorLast(String newAuthorLast) {
        this.newAuthorLast = newAuthorLast;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

}
