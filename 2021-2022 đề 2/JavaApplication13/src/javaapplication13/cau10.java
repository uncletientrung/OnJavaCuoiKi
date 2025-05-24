/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author DELL
 */
public class cau10 {
    private int level=1;
    class cau11{
        private int level=2;
        class cau12{
            private int level=3;
            public void printReality(){
                for(int i=0; i<5;i++,level++){
                    System.out.print(level);
                    System.out.print(" "+cau10.cau11.this.level);
                    System.out.print(" "+cau11.this.level);
                    System.out.print("    ||    ");

                }
            }
        }
    }
    public static void main(String[] args){
        cau10.cau11.cau12 c=new cau10(). new cau11(). new cau12();
        c.printReality();
    }
}
