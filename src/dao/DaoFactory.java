package dao;

import dao.JDBCDao;
import dao.CountryDao;

/**
 * Created by aibar on 7/20/2017.
 */
public class DaoFactory {
    public static CountryDao getDaoInstance(int fileDao) {
        switch(fileDao) {
            case CountryDao.FILE_DAO:
                return new FileDao();
            case CountryDao.JDBC_DAO:
                return new JDBCDao();
            default:
                break;
        }
        return null;
    }
}