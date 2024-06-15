package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {
    public ResultSet generateNewOrderId() throws SQLException, ClassNotFoundException;

    public boolean exitOrderId(String orderId) throws SQLException, ClassNotFoundException;

    public int orderInset(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;
}
