package com.company;

import com.Boss;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Boss Boss1=new Boss();
       Boss1.setHealtheBoss(1500);
       Boss1.setDamageBoss(200);
       Boss1.setDefenceTypeBoss("BackFight");
       System.out.println("Boss1"+ " has: " + " Healthe "+Boss1.getHealtheBoss()+"  Damage  "
               +Boss1.getDamageBoss()+"  DefenceType  "+Boss1.getDefenceTypeBoss());

    }


}
