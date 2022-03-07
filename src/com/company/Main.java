package com.company;

public class Main {

    public static void main(String[] args) {
	String[][] scess = new String[8][8];
for(int i = 0;i<scess.length;i++){
    for(int j = 0;j<scess.length;j++){
        if((i+j)%2 == 0)
            scess[i][j]="W";
        if((i+j)%2 != 0)
            scess[i][j]="B";
        System.out.print(" "+scess[i][j]);
    }
    System.out.println();
}
    }
}
