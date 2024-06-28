package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Department department = new Department(1, "books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, department);
        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
    }
}