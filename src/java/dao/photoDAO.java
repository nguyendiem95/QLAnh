/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.photo;

/**
 *
 * @author Diem
 */
public interface photoDAO {

    public void getconnect();

    public ArrayList<photo> getAll();

    public boolean isExist(photo photo);

    public ArrayList<photo> getAllbyname(String name, String cap);
    
    public ArrayList<photo> getAllby(String name);

    public void add(photo p);

    public ArrayList<photo> seach(String str);

    public int delete(photo p);
}
