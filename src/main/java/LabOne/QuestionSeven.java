/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabOne;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Chandana
 */
public class QuestionSeven {
    public static void main(String[] args) {
       
        String strAmount = JOptionPane.showInputDialog("Please enter the amount :");

        try {
            float amount = Float.parseFloat(strAmount);
            float stateTax = amount * 0.04F;
            float countryTax = amount *0.02F;
            float finalAmount = amount+stateTax+countryTax;
            String strRounded = df.format(finalAmount);
            JOptionPane.showMessageDialog(null, "Total amount including 4% of State tax and 2% Country tax is :"+strRounded);
            System.out.println("Total amount including 4% of State tax and 2% Country tax is :"+strRounded);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alphabets and special charecters are not allowed.");
        }  
    }
    private static DecimalFormat df = new DecimalFormat("0.00");

}
