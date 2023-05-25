package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

enum Color
{
    RED, GREEN, BLUE;

    // 构造函数
    private Color()
    {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

public class Test
{
    // 输出
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
        Queue<Integer> l1 = new LinkedList<Integer>();
        Deque<Integer> l3 = new LinkedList<>();
    }
}
