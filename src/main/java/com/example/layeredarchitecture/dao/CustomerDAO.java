package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    public void saveCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException;

    public void updateCustomer(String name, String address, String id) throws SQLException, ClassNotFoundException;

    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public boolean exitCustomer(String id) throws SQLException, ClassNotFoundException;

    public String generateNewId() throws SQLException, ClassNotFoundException;

    public boolean exitCustome(String id) throws SQLException, ClassNotFoundException;

    public ResultSet loadAllCustomer() throws SQLException, ClassNotFoundException;

    public ResultSet searchCustomer(String newValue) throws SQLException, ClassNotFoundException;
}
