/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parse.objectmodels;

import org.parse4j.ParseClassName;
import org.parse4j.ParseUser;

/**
 * Customer ParseObject
 * <li> Contains all the information needs to use this as a DTO and ParseObject
 * @author mark.milford
 */
@ParseClassName("Customer")
public class Customer extends BaseParseObject{
    private String firstName;
    private String middleName;
    private String lastName;
    private String description;
    
    public Customer(){}
    
    public void setDescription(String incomingDescription){
        this.description = incomingDescription;
        //this.put("description", incomingDescription);
        //this.put(DataFieldNames.description.toString(), incomingDescription);
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setFirstName(String incomingFirstName){
        this.firstName = incomingFirstName;
        //this.put("firstName", incomingFirstName);
        this.put(ParseDataFieldNames.firstName.toString(), incomingFirstName);
    }
    
    public String getMiddleName(){
        return this.middleName;
    }
    
    public void setMiddleName(String incomingMiddleName){
        this.middleName = incomingMiddleName;
        //this.put("middleName", incomingMiddleName);
        this.put(ParseDataFieldNames.middleName.toString(), incomingMiddleName);
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setLastName(String incomingLastName){
        this.lastName = incomingLastName;
        //this.put("lastName", incomingLastName);
        this.put(ParseDataFieldNames.lastName.toString(), incomingLastName);
    }
    
    /**
     * Override toString to display relevant info etc
     * @return 
     */
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
    }
}
