/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TaxCalculate implements Calculate{
    @Override
    public double calculate(double x){
        if(x <= 5000){
            return 0;
        }
        else if (x <= 10000){
            return (x-5000)*0.1;
        }
        else if (x <= 20000){
            return (10000-5000)*0.1+(x-10000)*0.15;
        }
        else 
            return (x - 20000)*0.2+(20000-10000)*0.15+(10000-5000)*0.1;
    }
}
