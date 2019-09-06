/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabOne;

import javax.swing.JOptionPane;

/**
 *
 * @author Chandana
 */
public class QuestionEight {
    public static void main(String[] args) {
        //40 cookies ,10 servings which mean each serving has 4 cookies
        //4 cookies => 300 calories
        // x number of cookies = (x*300)/4
        
         
        String cookies = JOptionPane.showInputDialog("Please enter the amount :");

        try {
            float  noOfcookies =  Float.parseFloat(cookies);
            float noOfCalaries = (noOfcookies * 300)/4;
            String strRounded = String.format("%.2f",noOfCalaries);
            JOptionPane.showMessageDialog(null, "Number of calories consumed :"+strRounded);
            System.out.println("Number of calories consumed :"+strRounded);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alphabets and special charecters are not allowed.");
        }  
    }
}
