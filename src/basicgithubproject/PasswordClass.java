/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicgithubproject;

/**
 *
 * @author Alwande Ngcobo
 */
public class PasswordClass {
    private String password = "Hello";
    
    public boolean checkPassword(){
        if (password.contains("s")) {
            return true;
        }
        else{
            return false;
        }
    }
}
