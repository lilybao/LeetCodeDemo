package com.leetCode.demo;/*
 * @项目名称: LeetCode
 * @日期: 2019/5/23 0023 上午 10:29
 * @版权: 2019 河南中审科技有限公司 Inc. All rights reserved.
 * @开发公司或单位：河南中审科技有限公司研发中心
 */

/**
 * @ClassName: AddTwoNumbers
 * @Description: 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。您可以假设除了数字 0 之外，这两个数都不会以 0 开头
 * @author: libaojian
 * @date: 2019/5/23 0023 上午 10:29
 * @version: V1.0
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2= new ListNode(5);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(8);
        ListNode l6 = new ListNode(9);
        l1.next=l2;
        l2.next=l3;
        l4.next=l5;
        l5.next=l6;
        //4>5>6  7>8>9   654+987=1641
        ListNode ln1= addTwoNumbers(l1,l4);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode targetNode = new ListNode(0);


        return  targetNode;
    }
}
