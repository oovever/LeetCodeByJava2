package top150;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author OovEver
 * 2018/1/30 19:56
 */
public class LeetCode412 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
         final String Fizz = "Fizz";
        final String Buzz = "Buzz";
        final String FizzBuzz = "FizzBuzz";
        for(int i=1;i<=n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add(FizzBuzz);
                continue;
            } else if(i%3==0){
                res.add(Fizz);
                continue;
            } else if (i % 5 == 0) {
                res.add(Buzz);
                continue;

            }
            res.add(String.valueOf(i));
        }
        return res;
    }
}
