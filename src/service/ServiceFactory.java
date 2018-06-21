package service;

import domain.Article;
import domain.Title;
import service.impl.SportsmanServiceImpl;

import javax.naming.ServiceUnavailableException;

public final class ServiceFactory {
    public static final ServiceFactory instance = new ServiceFactory();

    private ISportsmanService sportsmanService = new SportsmanServiceImpl();


    public ISportsmanService getSportsmanService() {
        return sportsmanService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

}
