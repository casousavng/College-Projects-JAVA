/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap_vs_hashtable;

import java.util.*;
import java.io.*;
import java. lang.*;


public class Hashmap_vs_hashtable {


public class Details {

   // An example Java program for demonstrating HashTable and HashMap

class Sample
{
public static void main(String args [1)
{
//hashtable
Hashtable<Integer,String> hasht=new Hashtable<Integer, String>();
hasht. put (500, '"Abi"); hasht. put (501, "Ragul");
hasht. put (502,
"Raja");
hasht. put (503, "Mani");
System.out.println("******Hash table******"); for (Map. Entry
mm: hasht.entrySet()) {
System.out.println(mm.getKey()+" "+mm.getValue());
}
-hashmap-
HashMap<Integer,String> hashm=new HashMap<Integer,String>();
hashm. put (500, "Ajith");
hashm. put (504," "); //One null value is allowed in HashMap hashm. put (501, "Sanjay"); hashm. put (502, "Vimal");
System. out.println('********Hash Map******''); for (Map.Entry
mm: hashm.entrySet()) {
System. out.println(mm.getKey() +" "+mm.getValue());