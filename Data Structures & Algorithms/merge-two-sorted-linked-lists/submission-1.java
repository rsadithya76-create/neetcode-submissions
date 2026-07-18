class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ArrayList<Integer> l1 = new ArrayList<>();
        ListNode curr1 = list1;
        while (curr1 != null) {
            l1.add(curr1.val);
            curr1 = curr1.next;
        }
        ListNode curr2 = list2;
        while (curr2 != null) {
            l1.add(curr2.val);
            curr2 = curr2.next;
        }
        Collections.sort(l1);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : l1) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }
}