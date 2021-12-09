package com.atstudy.bank;

/**
 * @Author: 24570
 * @Date: 2021/12/5 15:22
 * @Description: Bank
 * @Version 1.0.0
 */
public class Bank {
    private static Account[] accounts = new Account[100];

    public static Account[] getAccounts() {
        return accounts;
    }

    static {
        accounts[0] = new CreditAccount("1001","123456",1000,10000);
        accounts[1] = new SavingAccount("1002","123456",2000);
    }
    public boolean verify(String cardNo,String passwd){
        boolean flag = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getCardNo().equals(cardNo) && accounts[i].getPassWd().equals(passwd)){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public void withDraw(String cardNo,int num){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getCardNo().equals(cardNo)){
                accounts[i].withDraw(num);
                break;
            }
        }
    }
    public void deposit(String cardNo,int num){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getCardNo().equals(cardNo)){
                accounts[i].deposit(num);
                break;
            }
        }
    }
    public void loan(String cardNo,int num){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getCardNo().equals(cardNo)){
                ((CreditAccount) accounts[i]).loan(num);
                break;
            }
        }
    }
}
