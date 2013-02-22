/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.tp;

import java.util.ArrayList;

/**
 *
 * @author Karriem
 */
public class ArrayListClass implements ArrayListInterface {
   
    @Override
   public ArrayList arrayClass(){
       
       ArrayList names = new ArrayList();
       
       System.out.println("Array size " +names.size());
       names.add("Nagato");
       names.add("Itachi");
       names.add("Hisagi");
       
       return names;
   }
}
