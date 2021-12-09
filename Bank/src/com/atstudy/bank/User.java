package com.atstudy.bank;

/**
 * @Author: 24570
 * @Date: 2021/12/5 19:37
 * @Description: User
 * @Version 1.0.0
 */
public class User {
     ATM atm = new ATM();
    public static void main(String[] args) {
        User user = new User();
        user.atm.service();
    }
}
