package jdbc;
//library
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.protocol.Resultset;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;


public class sqlMakanan {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DB = "kasir";
    private static final String MYCONN = "jdbc:mysql://localhost/" + DB;

    public static Connection getConnection (){
        
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(MYCONN, USERNAME, PASSWORD);
            System.out.println("koneksi berhasil");
        } catch (SQLException e) {
            Logger.getLogger(sqlMakanan.class.getName()).log(Level.SEVERE, null,e);
            e.printStackTrace();
            System.out.println("koneksi gagal");
        }
        return conn; 
    }

        public static ObservableList<Makanan> getMakanan(){
            Connection conn = getConnection();
            ObservableList<Makanan> mList = FXCollections.observableArrayList();
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM makanan ");
                ResultSet rs  = ps.executeQuery();

                while(rs.next()){
                    mList.add(new Makanan(rs.getString("nama"), Integer.parseInt(rs.getString("harga")), Integer.parseInt(rs.getString("jumlah"))));
                    
                }
            } catch (Exception e){

            } return mList;


}

}

