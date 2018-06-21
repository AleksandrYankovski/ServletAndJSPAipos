package service;

import domain.Article;
import domain.Title;
import service.exception.ServiceException;

import java.util.List;
import java.util.Set;

public interface ISportsmanService {

    void addArticle(Article article) throws ServiceException;

    void removeArticle(Title title) throws ServiceException;

    String getContent(Title title) throws ServiceException;

    void updateContent(Title title, String content) throws ServiceException;

    Set<Title> getTitles() throws ServiceException;

}
