package com.company;

public class MemberInfo2 {
    public String accountNumber;
    public String memberName;
    public double memberBal;
    //set balance
    public MemberInfo2 (String name,String account, double balance){
       // memberBal = 0.0;
        this.accountNumber=account;
        this.memberName=name;
        this.memberBal= balance;
        System.out.println("New account for"+ memberName +accountNumber+memberBal);
    }
    public void withdrawal(double amount){
        memberBal = memberBal - amount;
    }
    public void deposit(double amount){
        memberBal = memberBal + amount;
    }

    public double getMemberBal () {
        return memberBal;
    }
    public static void main (String[] args){
    }

}
