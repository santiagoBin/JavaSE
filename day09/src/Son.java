/**
 * @Author: 24570
 * @Date: 2021/12/5 23:43
 * @Description: Son
 * @Version 1.0.0
 */
public class Son extends Father{
    public Son(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Son admin = new Son("admin");
        System.out.println(admin.name);
        admin.test();
//        System.out.println(super.name);
    }
    public void test(){
        System.out.println(super.name);
    }
}
