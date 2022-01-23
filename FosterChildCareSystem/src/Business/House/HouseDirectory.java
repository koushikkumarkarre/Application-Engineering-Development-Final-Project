/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.House;

import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class HouseDirectory {
    
    public ArrayList<House> HouseList;
    
    public HouseDirectory(){
        this.HouseList = new ArrayList<>();
    }

    public ArrayList<House> getHouseList() {
        return HouseList;
    }

    public void setHouseList(ArrayList<House> HouseList) {
        this.HouseList = HouseList;
    }
    
    public void AddHouse(House h){
        this.HouseList.add(h);
    }
    
    public House getHouseById(int id){
        House house = null;
        for(House h: this.HouseList){
            if(h.getId() ==(id)){
                house = h;
                break;
            }
        }
        return house;
    }
    
    public House CreateHouse(String name, String City, String Address){
        House h = new House( name, Address, City);
        h.setId(this.HouseList.size()+1);
        this.HouseList.add(h);
        return h;
    }
    
    public void DelereHouse(int id){
        
        House toDelete = null;
        
        for(House h: this.HouseList){
            if(h.getId()==(id)){
                toDelete = h;
            }
        }
        
        this.HouseList.remove(toDelete);
    }
}
