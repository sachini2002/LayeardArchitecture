package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;

    public void saveItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException;

    public void updateItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException;

    public String generateId() throws SQLException, ClassNotFoundException;

    public boolean exit(String code) throws SQLException, ClassNotFoundException;

    public ResultSet loadAllItem() throws SQLException, ClassNotFoundException;

    public ResultSet findItem(String newItemCode) throws SQLException, ClassNotFoundException;

    public ResultSet findItems(String code) throws SQLException, ClassNotFoundException;

    public int update(ItemDTO item) throws SQLException, ClassNotFoundException;

}
