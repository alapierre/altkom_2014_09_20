/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;


public class WhiteTherapyImpl extends MenagementImpl {
    private String branches;

    public WhiteTherapyImpl(String branches, String name, String surname, String pesel, String responsibility) {
        super(name, surname, pesel, responsibility);
        this.branches = branches;
    }
    

    
    
}
