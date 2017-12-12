package String;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/12/12 16:06
 */
public class LeetCode722 {
    public List<String> removeComments(String[] source) {
        List<String> res = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean mode = false;
        for (String s : source) {
            for(int i=0;i<s.length();i++) {
//               如果是多行注释
                if (mode) {
                    if (s.charAt(i) == '*' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
                        mode = false;
//                        跳过“/”
                        i++;
                    }
                } else {
                    if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
                        break;
                    } else if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '*') {
                        mode = true;
                        i++;//跳过*
                    } else {
                        stringBuilder.append(s.charAt(i));
                    }
                }
            }
            if (!mode && stringBuilder.length() > 0) {
                res.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        }
        return res;
    }
}
