package com.HelloWorld;
import java.util.Scanner;
import java.lang.Math;
public class Divisor {
    int a;
    int b;
    int biggestDvsor;
    public String findBiggestDivisor(){
        if(a == 0 && b == 0){
            return "khong co UCLN";
        }else if(a == 0 && b != 0){
            biggestDvsor = Math.abs(b);
            return "UCLN la " + biggestDvsor;
        }else if(a != 0 && b == 0){
            biggestDvsor = Math.abs(a);
            return "UCLN la " + biggestDvsor;
        }else{
            for(int i = 1; i <= Math.min(Math.abs(a), Math.abs(b)); i++){
                if(a % i == 0 && b % i == 0){
                    biggestDvsor = i;
                }
            }
            return "UCLN la " + biggestDvsor;
        }
    }
    public void getInfor(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }
    public static void main(String[] args) {
	// write your code here
        Divisor d = new Divisor();
        d.getInfor();
        System.out.println(d.findBiggestDivisor());
    }
}
