/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.photo;

/**
 *
 * @author Diem
 */
public class photoDAOImpl implements photoDAO{
    private Connection con;
    @Override
    public ArrayList<photo> getAll() {
        getconnect();
        String sql = "SELECT * FROM photo";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ArrayList<photo> photos = new ArrayList<>();
            photo p;

            while (rs.next()) {
                p = new photo();
                p.setLink(rs.getString("link"));
                p.setCap(rs.getString("cap"));
                p.setName(rs.getString("name"));
                photos.add(p);
            }
            return photos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<photo> getAllbyname(String name, String cap) {
        getconnect();
        String sql = "SELECT * FROM photo"
                + " WHERE cap=" + "'" + cap + "'" + "AND name =" + "'" + name + "'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<photo> photos = new ArrayList<>();
            photo p;
            while (rs.next()) {
                p = new photo();
                p.setLink(rs.getString("link"));
                p.setCap(rs.getString("cap"));
                p.setName(rs.getString("name"));
                photos.add(p);
            }
            return photos;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void getconnect() {
        String urlclass = "jdbc:mysql://localhost:3306/img";
        String user = "root";
        String pass = "";
        try {
            this.con = DriverManager.getConnection(urlclass, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        photoDAOImpl p = new photoDAOImpl();
        //photo ph = new photo("", "img/18157201_1292401437542500_4514155495486990153_n.jpg", "", "Diá»?m Nguyá»?n");
        ArrayList<photo> phList = p.getAllbyname("1281503618632282","Báº¡n bÃ¨");

        for( photo ph : phList){
            System.out.println(ph.getLink());
        }
    }

    @Override
    public void add(photo p) {
        getconnect();
        String sql = "INSERT INTO photo VALUES(?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(2, p.getLink());
            ps.setString(3, p.getCap());
            ps.setString(4, p.getName());
            ps.setString(1, p.getTime());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isExist(photo photo) {
        getconnect();
        String sql = "SELECT * FROM photo"
                + " WHERE link=" + "'" + photo.getLink() + "'" + "AND name =" + "'" + photo.getName() + "'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public ArrayList<photo> seach(String str) {
        getconnect();
        String sql = "SELECT * FROM photo"
                + " WHERE time LIKE " + "'%" + str + "%'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ArrayList<photo> photos = new ArrayList<>();
            photo photo;

            while (rs.next()) {
                photo = new photo();
                photo.setLink(rs.getString("link"));
                photo.setCap(rs.getString("cap"));
                photo.setName(rs.getString("name"));
                photo.setTime(rs.getString("time"));
                photos.add(photo);
            }
            return photos;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int delete(photo p) {
        getconnect();
        String query= "DELETE FROM photo "+"WHERE link=? AND name=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, p.getLink());
            ps.setString(2, p.getName());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }

    }
    
    @Override
    public ArrayList<photo> getAllby(String name) {
        getconnect();
        String sql = "SELECT * FROM photo"
                + " WHERE name =" + "'" + name + "'";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<photo> photos = new ArrayList<>();
            photo p;
            while (rs.next()) {
                p = new photo();
                p.setLink(rs.getString("link"));
                p.setCap(rs.getString("cap"));
                p.setName(rs.getString("name"));
                photos.add(p);
            }
            return photos;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
