/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.and.enums.hw;

/**
 *
 * @author achap
 */
public class Person {
    int number;
    String fname;
    String lname;
    String email;
    
    public Person (int number, String fname, String lname, String email) {
        this.number = number;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    @Override
    public String toString() {
        return number + ", " + fname + ", " + lname + ", " + email;
    }
    
    
    
    
}
