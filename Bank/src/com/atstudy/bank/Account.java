package com.atstudy.bank;

/**
 * @Author: 24570
 * @Date: 2021/12/5 14:30
 * @Description: Account
 * @Version 1.0.0
 */
public class Account {
    private String cardNo;
    private String passWd;
    private int balance;

    public String getCardNo() {
        return cardNo;
    }

    public Account(String cardNo, String passWd, int balance) {
        this.cardNo = cardNo;
        this.passWd = passWd;
        this.balance = balance;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int saveNum){
        this.balance += saveNum;
        System.out.println("存款成功！当前账户可用余额为："+this.balance);
    }
    public void withDraw(int num){
        if (this.balance - num >= 0){
            this.balance -= num;
            System.out.println("取款成功！当前账户可用余额为："+this.balance);
        }else{
            System.out.println("账户余额不足!当前账户余额为:"+this.balance);
        }
    }
}
