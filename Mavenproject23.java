/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject23;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.LinkedHashSet;

public class Mavenproject23   {
    
    
    
    public ArrayList<String> ArrayListClass(){
        
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ant");
        arrayList.add("Bird");
        arrayList.add("Cat");
        arrayList.add("Dog");
        return arrayList;
    }
    public LinkedList<String> LinkedListClass(){
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("mango");
        linkedlist.add("orange");
        linkedlist.add("banana");
        linkedlist.add("watermelon");
        System.out.println(linkedlist);
        return  linkedlist;
    }
    public HashSet<String> HashSetClass(){
        HashSet<String> set = new HashSet<String>();
        set.add("Thailand");
        set.add("USD");
        set.add("China");
        set.add("Japan");
        return set;
    }
    public TreeSet<String> TreeSetClass ()
    {
       TreeSet<String> treeSet = new TreeSet<String>();
       treeSet.add("Tuna");
       treeSet.add("Salmon");
       treeSet.add("Shark");
       treeSet.add("whale");
       return treeSet;
    }
    public LinkedHashSet<String> LinkedHashSetClass()
    {
       LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
       linkedHashSet.add("Pizza");
       linkedHashSet.add("Hamburger");
       linkedHashSet.add("Soup");
       linkedHashSet.add("Barbecue");
       return  linkedHashSet;
    }
    public Map MapClas(){
        Map map = new HashMap();
        map.put("A", "test1");
        map.put("B", "test2");
        map.put("C", "test3");
        map.put("D", "test4");
        System.out.println(map);
        System.out.println(map.get("A"));
        return map;
    }
    
      
    public static void main(String[] args) {
    
        int i = 0;
        Mavenproject23 Extends = new Mavenproject23();
         for(String item : Extends.ArrayListClass()){
            i+=1;
            System.out.println(i+"."+item+"(arrayList)");
           
        }
        for(String item : Extends.LinkedListClass()){
             i+=1;
            System.out.println(i+"."+item+"(linkedlist)");
        }
        for(String item : Extends.TreeSetClass())
        {
            i+=1;
            System.out.println(i+"."+item+"(TreeSet)");
        }
        for(String item : Extends.HashSetClass())
        {
            i+=1;
            System.out.println(i+"."+item+"(HashSet)");
        }
        for(String item : Extends.LinkedHashSetClass())
        {
            i+=1;
            System.out.println(i+"."+item+"(LinkedHashSet)");
        }
        Extends.MapClas();
    }
}
