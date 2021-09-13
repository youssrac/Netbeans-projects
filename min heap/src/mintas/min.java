/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author PAVILION
 */
public class min {
public int somme=0;
public ArrayList<Integer> list;
public min() {
  this.list = new ArrayList<Integer>();
    }

public void insert(int item) {
list.add(item);
        int i = list.size() - 1;
        int parent = parent(i);
    while (parent != i && list.get(i) < list.get(parent)) {
          permuter(i, parent);
            i = parent;
            parent = parent(i);
        }construire();
    }
  public void construire() {
 for (int i = list.size() / 2; i >= 0; i--) {
            mint(i);
        }
    }
  public int extrairemin() {
  if (list.size() == 0) {
        System.out.print("Tas est vide");
        } else if (list.size() == 1) {
        int min = list.remove(0);
        return min;
        }
        int min = list.get(0);
        int dernier = list.remove(list.size() - 1);
        list.set(0, dernier);
        mint(0);
        return min;
    }
  
 public void mint(int i) {
        int left =  2 * i + 1;
        int right = 2 * i + 2;
        int min = -1;
    if (left <= list.size() - 1 && list.get(left) < list.get(i)) {
            min = left;
        } else {
            min = i;
        }
      if (right <= list.size() - 1 && list.get(right) < list.get(min)) {
            min = right;
        }
         if (min != i) {
         permuter(i, min);
         mint(min);
        }
    }
 public int parent(int i) {
   if (i % 2 == 1) { 
            return i / 2; 
        }
    return (i - 1) / 2;
    } 
  public void permuter(int i, int parent) {
  int temp = list.get(parent);
        list.set(parent, list.get(i));
        list.set(i, temp);
    }
}

    
