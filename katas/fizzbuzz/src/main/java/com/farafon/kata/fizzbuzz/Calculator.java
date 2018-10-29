package com.farafon.kata.fizzbuzz;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Calculator {
    public static String getResults(String s) {
        LinkedList stack = new LinkedList();
        boolean array = false;

        String[] split = s.split(" ");
        for (String val : split) {
            if ("}".equals(val.trim())) {
                array = false;
            } else if (array) {
                ((List) stack.getLast()).add(val);
            } else if (StringUtils.isNumeric(val)) {
                stack.add(Integer.parseInt(val));
            } else if ("+".equals(val)) {
                stack.add(((Integer) stack.removeLast()) + ((Integer) stack.removeLast()));
            } else if ("*".equals(val)) {
                stack.add(((Integer) stack.removeLast()) * ((Integer) stack.removeLast()));
            } else if ("-".equals(val)) {
                stack.add(((Integer) stack.removeLast()) - ((Integer) stack.removeLast()));
            } else if ("drop".equals(val)) {
                stack.removeLast();
            } else if ("dup".equals(val)) {
                stack.add(stack.getLast());
            } else if ("{".equals(val)) {
                array = true;
                stack.add(new ArrayList<Integer>());
            } else if("?nth".equalsIgnoreCase(val)){
                int position = (Integer) stack.removeFirst();
                List<Integer> list = (List<Integer>) stack.removeFirst();
                stack.add(list.get(position));
            }

            System.out.println("[" + StringUtils.join(stack, ",") + "]");
        }
        return "" + stack.remove();
    }
}
