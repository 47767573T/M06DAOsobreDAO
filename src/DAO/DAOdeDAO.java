package DAO;

import factory.Empresa;
import org.xmldb.api.base.XMLDBException;

import java.awt.*;

/**
 * Created by Moises on 14/04/2016.
 */
public class DAOdeDAO {

    private static final String IP = "172.31.101.225";
    private static final String PORT = "8080";
    private static String adminUsername = "admin";
    private static String adminPassword = "dionis";
    private static String dbPath = "C:\\Users\\Moises\\Desktop\\Git\\M06DAOsobreDAO\\src";

    //Variables de base de datos
    String[] colecciones = {"clients", "empleats", "catalegs", "factures"};


    DAO1 subDAO = new DAO1(IP, PORT);
    Empresa empresaDB;

    public DAOdeDAO() throws XMLDBException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        //Parte inicial creamos la bbdd y sus colecciones específicas
        for (int i = 0; i < colecciones.length; i++) {
            guardarColeccion(colecciones[i]);
        }



    }

    public void guardarColeccion(String nombreCol) throws XMLDBException, ClassNotFoundException, InstantiationException
            , IllegalAccessException {
        subDAO.createCollection(adminUsername, adminPassword, nombreCol);
    }










}
