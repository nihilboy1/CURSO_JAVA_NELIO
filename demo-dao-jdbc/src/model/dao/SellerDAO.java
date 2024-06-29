package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDAO{

    void insert(Seller department);

    void update(Seller department);

    void deleteById(Integer Id);

    Seller findById(Integer Id);

    List<Seller> findAll();

    List<Seller> findByDepartmentId(Integer departmentId);
}
