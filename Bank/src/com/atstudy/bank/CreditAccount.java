package com.atstudy.bank;

/**
 * @Author: 24570
 * @Date: 2021/12/5 14:53
 * @Description: CreditAccount
 * @Version 1.0.0
 */
public class CreditAccount extends Account implements IRepay{
    private int ceiling;

    public CreditAccount(String cardNo,String password,int balance, int ceiling) {
        super(cardNo, password, balance);
        this.ceiling = ceiling;
    }

    public void loan(int loanNum){
        if (loanNum <= this.ceiling){
            setBalance(getBalance() + loanNum);
            System.out.println("借贷成功！当前可用余额：" + getBalance());
        }else{
            System.out.println("借贷失败！此卡最高可借贷额度为："+ this.ceiling);
        }
    }
}
