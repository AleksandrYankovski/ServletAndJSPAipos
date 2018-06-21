package domain;

import java.io.Serializable;
import java.util.Objects;

public class Title implements Serializable {
    private static final long serialVersionUID = -4714696495245376463L;

    private String sportsmanFullName;
    private String authorPhoneNumber;

    public void setSportsmanFullName(String sportsmanFullName) {
        this.sportsmanFullName = sportsmanFullName;
    }

    public void setAuthorPhoneNumber(String authorPhoneNumber) {
        this.authorPhoneNumber = authorPhoneNumber;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSportsmanFullName() {
        return sportsmanFullName;
    }

    public String getAuthorPhoneNumber() {
        return authorPhoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return Objects.equals(sportsmanFullName, title.sportsmanFullName) &&
                Objects.equals(authorPhoneNumber, title.authorPhoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sportsmanFullName, authorPhoneNumber);
    }

    @Override
    public String toString() {
        return "Title{" +
                "sportsmanFullName='" + sportsmanFullName + '\'' +
                ", authorPhoneNumber='" + authorPhoneNumber + '\'' +
                '}';
    }
}
