package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/11/13.
 */
public class LeetCode118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++) {
                row.set(j, row.get(j)+row.get(j + 1));
            }
            allrows.add(new ArrayList<>(row));
        }
        return allrows;
    }

    public static void main(String[] args) {
        System.out.println(generate(2));

    }

}
