/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.UsedService;

/**
 *
 * @author lamit
 */
public class ConfirmedUsedItemDAO extends DAO{

    public ConfirmedUsedItemDAO() {
    }
    public void updateUsedItems(UsedService us, int idBookedField){
        String sql = "insert tblusedservice(price,amount,saleoff,idBookedField,idService) values(?,?,?,?,?)";
        try{
            System.out.println(idBookedField + "--------------");
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, us.getPrice());
            pre.setInt(2, us.getAmount());
            pre.setInt(3, us.getSaleoff());
            pre.setInt(4, idBookedField);
            pre.setInt(5, us.getService().getId());
            pre.executeUpdate();
            System.out.println("Sucess!!");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
