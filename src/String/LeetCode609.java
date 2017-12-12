package String;

import java.util.*;

/**
 * @Author OovEver
 * @Date 2017/12/10 23:32
 */
public class LeetCode609 {
    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<>();
        if (paths == null || paths.length == 0) {
            return res;
        }
        int n = paths.length;
//        map的key存储content即文件内容
//        map的value存储包含当前文件的文件夹
        Map<String, Set<String>> map = new HashMap<>();
        for (String path : paths) {
//            过滤一个或者多个空格
            String[] strs = path.split("\\s+");
            for(int i=1;i<strs.length;i++) {
                int idx = strs[i].indexOf("(");
                String content = strs[i].substring(idx);
                String filename = strs[0] + "/" + strs[i].substring(0, idx);
                Set<String> filenames = map.getOrDefault(content, new HashSet<String>());
                filenames.add(filename);
                map.put(content, filenames);
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                res.add(new ArrayList<String>(map.get(key)));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        System.out.println(findDuplicate(paths));
    }
}
