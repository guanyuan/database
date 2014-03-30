package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class Cart {
    public String getNameById(String id) throws ClassNotFoundException, SQLException {
        Statement statement = connectDataBase();
        String query = "select user_name from item_list where user_id = '" +id+ "'";
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();
        return resultSet.getString("user_name");

    }

    private Statement connectDataBase() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://127.0.0.1:5432/exampledb";
        Connection conn = getConnection(url, "dbuser1", "dbuser1");
        return conn.createStatement();
    }

    public List<Item> getDetailByName(String user_name) {
        ArrayList<Item> itemList = new ArrayList<>();

        try {
            Statement statement = connectDataBase();
            String query = "select * from item_list where user_name = '" + user_name + "'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String userId = resultSet.getString("user_id");
                String userName = resultSet.getString("user_name");
                String itemId = resultSet.getString("item_id");
                String itemName = resultSet.getString("item_name");
                Item item = new Item();
                item.setUser_id(userId);
                item.setUser_name(userName);
                item.setItem_id(itemId);
                item.setItem_name(itemName);
                itemList.add(item);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return itemList;

    }
}
