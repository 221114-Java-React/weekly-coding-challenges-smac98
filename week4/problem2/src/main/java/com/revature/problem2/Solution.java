package com.revature.problem2;

import java.util.*;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        List<String> ac = new ArrayList<>();
        String one = list.get(0);
        //System.out.println(one);
        for(String string :list) {

            if(string.startsWith(one)) {
                ac.add(string);
            }
            if(string.equals(one)) {
                ac.remove(string);
            }
            Collections.sort(ac);
        }
        return ac;
    }
}
