package dao;

import service.impl.SportsmanServiceImpl;

public final class DAOFactory {
    public static final DAOFactory instance = new DAOFactory();



    public static DAOFactory getInstance() {
        return instance;
    }

}
