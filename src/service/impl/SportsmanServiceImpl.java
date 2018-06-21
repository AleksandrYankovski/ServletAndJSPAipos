package service.impl;

import domain.Article;
import domain.Title;
import service.ISportsmanService;
import service.exception.ServiceException;

import java.util.List;
import java.util.Set;

public class SportsmanServiceImpl implements ISportsmanService {
    @Override
    public void addArticle(Article article) throws ServiceException {

    }

    @Override
    public void removeArticle(Title title) throws ServiceException {

    }

    @Override
    public String getContent(Title title) throws ServiceException {
        return null;
    }

    @Override
    public void updateContent(Title title, String content) throws ServiceException {

    }

    @Override
    public Set<Title> getTitles() throws ServiceException {
        return null;
    }
}
