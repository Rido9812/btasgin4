package authorr;

import java.util.Date;

public class Author {

    private String authorID;
    private String name;
    private Date dateOfBirth;

    // Constructor có tham số
    public Author(String authorID, String name, Date dateOfBirth) {
        this.authorID = authorID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Author() {
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Author{"
                + "authorID='" + authorID + '\''
                + ", name='" + name + '\''
                + ", dateOfBirth=" + dateOfBirth
                + '}';
    }
}
