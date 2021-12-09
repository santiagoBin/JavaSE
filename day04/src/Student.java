import java.util.Scanner;

/**
 * @Author: 24570
 * @Date: 2021/11/27 13:59
 * @Description: Student
 * @Version 1.0.0
 */
public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1、用户登录；2、退出");
        String userIn = scanner.next();
        int id = 1;
        String[][] users = new String[10][];
        users[0] = new String[]{"admin","123","1"};
        boolean flag = true;
        switch (userIn){
            case "1":
                while (flag){
                    System.out.println("请输入用户名：");
                    String userName = scanner.next();
                    System.out.println("请输入密码：");
                    String passwd = scanner.next();
                    for (int i = 0; i < users.length; i++) {
                        if (users[i] != null){
                            if (userName.equals(users[i][0]) && passwd.equals(users[i][1])){
                                flag = false;
                                boolean flagUserOrg = true;
                                System.out.println("登录成功！欢迎您，"+ users[i][0] + '。');
                                while (flagUserOrg){
                                    System.out.println("您可以选择进行如下操作：1、添加用户；2、查看所有用户；3、删除用户；4、修改用户信息；5、退出登录");
                                    String userOrg = scanner.next();
                                    switch (userOrg){
                                        case "1":
                                            id = addUser(scanner, id, users);
                                            break;
                                        case "2":
                                            getAllUsers(users);
                                            break;
                                        case "3":
                                            deleteUser(scanner, users);
                                            break;
                                        case "4":
                                            updateUser(scanner, users);
                                            break;
                                        case "5":
                                            flagUserOrg = false;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    if (flag){
                        System.out.println("用户名不存在或密码错误！请重新输入。");
                    }
                }
            case "2":
                break;
        }
    }

    private static void updateUser(Scanner scanner, String[][] users) {
        System.out.println("请输入要修改用户id:");
        String updateId = scanner.next();
        boolean updateUser = true;
        for (int j = 0; j < users.length; j++) {
            if (users[j] != null) {
                if (users[j][2].equals(updateId)){
                    updateUser =  false;
                    System.out.println("请输入新的用户名：");
                    String newName = scanner.next();
                    System.out.println("请输入新的密码：");
                    String newPasswd = scanner.next();
                    users[j] = new String[]{newName,newPasswd,updateId};
                    break;
                }
            }
        }
        if (updateUser){
            System.out.println("指定id的用户不存在！");
        }
    }

    private static void deleteUser(Scanner scanner, String[][] users) {
        System.out.println("请输入要删除用户id:");
        String deleteUserId = scanner.next();
        boolean deleteUser = true;
        for (int j = 0; j < users.length; j++) {
            if(users[j]!=null){
                if (users[j][2].equals(deleteUserId)) {
                    users[j] = null;
                    deleteUser = false;
                    break;
                }
            }
        }
        if (deleteUser){
            System.out.println("指定id的用户不存在！");
        }
    }

    private static void getAllUsers(String[][] users) {
        for (int j = 0; j < users.length; j++) {
            if (users[j] != null){
                System.out.println("id:"+ users[j][2]+",用户名："+ users[j][0]+",密码："+ users[j][1]);
            }
        }
    }

    private static int addUser(Scanner scanner, int id, String[][] users) {
        System.out.println("请输入要添加的用户名：");
        String newUserName = scanner.next();
        System.out.println("请输入要添加的密码：");
        String newUserPasswd = scanner.next();
        String userId = String.valueOf(++id);
        for (int j = 0; j < users.length; j++) {
            if (users[j] == null){
                users[j] = new String[]{newUserName,newUserPasswd,userId};
                break;
            }
        }
        return id;
    }
}
