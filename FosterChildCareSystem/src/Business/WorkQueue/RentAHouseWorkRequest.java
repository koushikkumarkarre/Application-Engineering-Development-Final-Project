/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.House.House;
import Business.HouseLessor.HouseLessor;
import Business.Parent.Parent;

/**
 *
 * @author Koushik
 */
public class RentAHouseWorkRequest extends WorkRequest {
    
    public Parent parent;
    
    public HouseLessor lessor;
    
    public String Status;
    
    public House house;

    public RentAHouseWorkRequest(Parent parent, HouseLessor lessor) {
        this.parent = parent;
        this.lessor = lessor;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public HouseLessor getLessor() {
        return lessor;
    }

    public void setLessor(HouseLessor lessor) {
        this.lessor = lessor;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
