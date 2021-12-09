/**
 * @Author: 24570
 * @Date: 2021/12/3 11:39
 * @Description: MaxStr
 * @Version 1.0.0
 */
public class MaxStr {
    public static void main(String[] args) {
        String str1 = "adfgasskhellosdf";
        String str2 = "sfahelloasd";
        String targetStr = "不存在最大相同字串！";
        Boolean flag = false;
        for (int i = str2.length(); i >=1 ; i--) {
            for (int j = 0; j+i <= str2.length(); j++) {
                if (str1.indexOf(str2.substring(j,j+i)) != -1){
                    targetStr = str2.substring(j,j+i);
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        System.out.println(targetStr);
    }
}
