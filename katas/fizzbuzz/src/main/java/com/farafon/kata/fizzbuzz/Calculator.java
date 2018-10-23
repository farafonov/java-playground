package com.farafon.kata.fizzbuzz;


import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;

public class Calculator {
    public static String getResults(String s) {
        LinkedList stack = new LinkedList();
        boolean array = false;

        String[] split = s.split(" ");
        for (String val : split) {
            if(array) {
                   ((List)stack.getLast()).add(val);
            }
            else if (StringUtils.isNumeric(val)) {
                stack.add(Integer.parseInt(val));
            } else if ("+".equals(val)) {
                stack.add( stack.removeLast() + stack.removeLast());
            } else if("*".equals(val)){
                stack.add( (stack).removeLast() * stack.removeLast());
            } else if("-".equals(val)){
                stack.add( (stack).removeLast() - stack.removeLast());
            } else if("drop".equals(val)){
                stack.removeLast();
            } else if("dup".equals(val)){
                stack.add( stack.getLast());
            } else if("{".equals(val)){
                array = true; 
            } else if("}".equals(val)){
                array = false; 
            }
            System.out.println("[" + StringUtils.join(stack, ",") + "]");
        }
        return "" + stack.remove();
    }
}
