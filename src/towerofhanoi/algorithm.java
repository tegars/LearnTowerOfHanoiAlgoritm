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
public class algorithm {
    static int putaran=0;
    public void doTower(int disk, char from, char inter, char to){
        if(disk==1){
            System.out.println("Disk 1 from "+from+ " to "+to);
        }else{
            doTower(disk-1, from, to, inter);
            System.out.println("Disk "+disk+" from "+from+" to "+to);
            doTower(disk-1, inter, from, to);
        }
        putaran++;
    }
}
