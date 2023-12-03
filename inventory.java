package org.example;

import org.antlr.v4.runtime.misc.Pair;

import java.lang.reflect.Array;
import java.util.List;

/*
[3:08 PM] Yuvraj Makode
    Compare and update the inventory stored in a 2D array against a second 2D array of a fresh delivery. 
    Update the current existing inventory item quantities (in arr1). 
    If an item cannot be found, add the new item and quantity into the inventory array. 
    The returned inventory array should be in alphabetical order by item.
function updateInventory(arr1, arr2) {​​
    return arr1;
}​​
// Example inventory lists
var curInv = [
    [21, "Bowling Ball"],
    [2, "Dirty Sock"],
    [1, "Hair Pin"],
    [5, "Microphone"]
];
var newInv = [
    [2, "Hair Pin"],
    [3, "Half-Eaten Apple"],
    [67, "Bowling Ball"],
    [7, "Toothpaste"]
];
updateInventory(curInv, newInv);
 */
public class Main {

    public static void main(String[] args) {

        List<Pair<Integer, String>()> arr1 = new ArrayList<Pair<Integer, String>>();
        List<Pair<Integer, String>()> arr2 = new ArrayList<(Pair<Integer, String>>();

        System.out.println(updateInventory(arr1, arr2));

    }
    
    public static  List<Pair<Integer, String>()> updateInventory(List<Pair<Integer, String>()> arr1, List<Pair<Integer, String>()> arr2) {

        List<Pair<Integer, String>()> retuner;
        Pair<Integer, String> itemList = new ArrayList<>();

        for(int i < 0; i < arr1.length(); i++) {
        
        itemList.put(arr2.stream()
            .filter($ -> $.getValue().equals(arr1.get(i).getValue()))
            .reduce((i,j) -> i.getKey() + j.getKey())
            .findFirst().orElse(0), arr1.get(i).getValue());

        }

        itemList.put(arr2.stream()
            .filter($ -> !$.getValue().equals(arr1.get(i).getValue()))
            .findFirst().orElse(0), arr1.get(i).getValue());


        return itemList;
    }

}




