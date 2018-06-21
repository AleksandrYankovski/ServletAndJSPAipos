package dao;

import domain.Article;
import domain.Title;
import service.exception.ServiceException;

import java.util.List;

public interface ISportsmanDAO {

    void addArticle(Article article) throws ServiceException;

    void removeArticle(Title title) throws ServiceException;

    String getContent(Title title) throws ServiceException;

    void updateContent(Title title, String content) throws ServiceException;

    List<Title> getTitles() throws ServiceException;

}
