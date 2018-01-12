package HashTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/11 13:11
 */
public class LeetCode690 {
    // Employee info
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int           id;
        // the importance value of this employee
        public int           importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return helper(map, id);
    }

    private int helper(Map<Integer, Employee> map, int rootId) {
        Employee root = map.get(rootId);
        int total = root.importance;
        for (int subordinate : root.subordinates) {
            total += helper(map, subordinate);
        }
        return total;
    }
}
