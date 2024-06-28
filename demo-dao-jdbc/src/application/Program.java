package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Department department = new Department(1, "books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, department);
        System.out.print(department);
        System.out.println(seller);
    }
}