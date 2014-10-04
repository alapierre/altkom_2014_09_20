/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import hospital.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class PatientDAOJdbcTest {
    
    private Connection conn;
    
    private PatientDAOJdbc dao;
    
    @Before
    public void setUp() throws SQLException {
         conn = DriverManager.getConnection("jdbc:derby://localhost:1527/hospital", "sa", "sa");
         dao = new PatientDAOJdbc(conn);
         
    }

    /**
     * Test of save method, of class PatientDAOJdbc.
     */
    @Test
    public void testSave() throws Exception {
        
        Patient patient = new Patient();
        
        patient.setName("Ala");
        patient.setLastName("Kowalska");
        patient.setNip("12345677889");
        
        int id = dao.save(patient);
        System.out.println("id = " + id);
        
    }
    
    @Test
    public void testFindAll() throws SQLException {
        
        List<Patient> res = dao.findAll();
        for(Patient p : res) {
            System.out.println(p);
        }
    }
    
    @Test
    public void testLoad() throws SQLException {
        
        Patient p = dao.load(1);
        
        System.out.println(p);
        
    }
}