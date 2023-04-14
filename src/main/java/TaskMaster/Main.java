/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskMaster;

import java.sql.Connection;
import util.ConnectionFactory;

/**
 *
 * @author Wellington
 */
public class Main {

    public static void main(String[] args) {
        Connection c = ConnectionFactory.getConnection();
        
        ConnectionFactory.closeConnection(c);
    }
    
}
