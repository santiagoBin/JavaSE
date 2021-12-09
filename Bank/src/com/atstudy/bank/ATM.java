package com.atstudy.bank;

import java.util.Scanner;

/**
 * @Author: 24570
 * @Date: 2021/12/5 16:37
 * @Description: ATM
 * @Version 1.0.0
 */
public class ATM {
    Scanner sc = new Scanner(System.in);
    private Bank bank  = new Bank();
    public void service(){
        boolean flag = true;
        do{
            System.out.println("请输入您的账户号：");
            String cardNo = sc.next();
            System.out.println("请输入密码：");
            String passWd = sc.next();
            if (bank.verify(cardNo,passWd)){
                System.out.println("登录成功！");
                flag = false;
                for (int i = 0; i < bank.getAccounts().length; i++) {
                    if (bank.getAccounts()[i] != null && bank.getAccounts()[i].getCardNo().equals(cardNo) && bank.getAccounts()[i] instanceof CreditAccount){
                        boolean serviceFlag = true;
                        do {
                            System.out.println("请选择您要办理的业务：1、存款；2、取款；3、借贷；4、退出");
                            String serviceSelected = sc.next();
                            switch (serviceSelected){
                                case "1":
                                    System.out.println("请输入存款金额：");
                                    int saveNum = Integer.parseInt(sc.next());
                                    bank.deposit(cardNo,saveNum);
                                    break;
                                case "2":
                                    System.out.println("请输入取款金额：");
                                    int withdrawNum = Integer.parseInt(sc.next());
                                    bank.withDraw(cardNo,withdrawNum);
                                    break;
                                case "3":
                                    System.out.println("请输入需要借贷金额：");
                                    int loanNum = Integer.parseInt(sc.next());
                                    bank.loan(cardNo,loanNum);
                                    break;
                                case "4":
                                    serviceFlag = false;
                                    break;
                            }
                        }while (serviceFlag);
                        break;
                    }else if(bank.getAccounts()[i] != null && bank.getAccounts()[i].getCardNo().equals(cardNo) && bank.getAccounts()[i] instanceof SavingAccount){
                        boolean serviceFlag = true;
                        do {
                            System.out.println("请选择您要办理的业务：1、存款；2、取款；3、退出");
                            String serviceSelected = sc.next();
                            switch (serviceSelected){
                                case "1":
                                    System.out.println("请输入存款金额：");
                                    int saveNum = Integer.parseInt(sc.next());
                                    bank.deposit(cardNo,saveNum);
                                    break;
                                case "2":
                                    System.out.println("请输入取款金额：");
                                    int withdrawNum = Integer.parseInt(sc.next());
                                    bank.withDraw(cardNo,withdrawNum);
                                    break;
                                case "3":
                                    serviceFlag = false;
                                    break;
                            }
                        }while (serviceFlag);
                        break;
                    }
                }
            }else{
                System.out.println("账户不存在或密码错误！请重新输入。");
            }
        }while (flag);
    }
}
