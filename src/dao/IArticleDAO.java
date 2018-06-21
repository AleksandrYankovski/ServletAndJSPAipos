package dao;

import dao.exception.DAOException;
import domain.Article;
import domain.Title;
import service.exception.ServiceException;

import java.util.List;
import java.util.Set;

public interface IArticleDAO {

    void addArticle(Article article) throws DAOException;

    void removeArticle(Title title) throws DAOException;

    String getContent(Title title) throws DAOException;

    void updateContent(Title title, String content) throws DAOException;

    Set<Title> getTitles() throws DAOException;

}
