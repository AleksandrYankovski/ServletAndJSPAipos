package domain;

import java.io.Serializable;
import java.util.Objects;

public class Article implements Serializable {
    private static final long serialVersionUID = -4714696495245376463L;

    private Title title;
    private String content;

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Title getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(title, article.title) &&
                Objects.equals(content, article.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, content);
    }

    @Override
    public String toString() {
        return "Article{" +
                "title=" + title +
                ", content='" + content + '\'' +
                '}';
    }
}
