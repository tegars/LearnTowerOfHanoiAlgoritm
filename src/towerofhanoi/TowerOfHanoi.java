/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

/**
 *
 * @author Tegar
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        algorithm t= new algorithm();
        t.doTower(5, 'A', 'B', 'C');
        System.out.println("-----------------");
        System.out.println("Lots of recursion is: "+t.putaran);
    }
}