/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import hospital.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class PatientDAOJdbc {

    private Connection connection;

    public PatientDAOJdbc(Connection connection) {
        this.connection = connection;
    }

    public List<Patient> findAll() throws SQLException {
        
        List<Patient> list = new ArrayList<>();
        
        String sql = "select * from person";
        
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()) {
            Patient p = mapPatient(rs);
            list.add(p);
        }
        
        return list;
        
    }
    
    public Patient load(int id) throws SQLException {
        
        String sql = "select * from person where id = ?";
        
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()) {
            return mapPatient(rs);
        } 
        
        return null;
        
    }
    
    public int save(Patient patient) throws SQLException {

        String sql = "insert into person (name, last_name, pesel) "
                + "values (?, ?, ?) ";

        PreparedStatement stmt = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
        
        stmt.setString(1, patient.getName());
        stmt.setString(2, patient.getLastName());
        stmt.setString(3, patient.getNip());

        stmt.executeUpdate();

        ResultSet rs = stmt.getGeneratedKeys();
        
        if(rs != null) {
            if(rs.next()) {
                return rs.getInt(1);
            }
        }

        return -1;
    }

    private Patient mapPatient(ResultSet rs) throws SQLException {
        Patient p = new Patient();
        p.setName(rs.getString("name"));
        p.setLastName(rs.getString("last_name"));
        p.setNip(rs.getString("pesel"));
        return p;
    }
}
