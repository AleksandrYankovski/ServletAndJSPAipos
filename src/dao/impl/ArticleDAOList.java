package dao.impl;

import dao.IArticleDAO;
import dao.exception.DAOException;
import domain.Article;
import domain.Title;

import java.util.*;

public class ArticleDAOList implements IArticleDAO {

    private static Map<Title, Article> map = new HashMap<>();

    @Override
    public void addArticle(Article article) throws DAOException {
        map.put(article.getTitle(), article);
    }

    @Override
    public void removeArticle(Title title) throws DAOException {
        map.remove(title);
    }

    @Override
    public String getContent(Title title) throws DAOException {
        return map.get(title).getContent();
    }

    @Override
    public void updateContent(Title title, String content) throws DAOException {
        Article article = new Article();
        article.setContent(content);
        article.setTitle(title);

        map.replace(title, article);
    }

    @Override
    public Set<Title> getTitles() throws DAOException {
        return map.keySet();
    }
}
