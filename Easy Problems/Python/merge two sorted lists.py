from typing import Optional

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        '''exact same solution as the java imp, just written in python'''
        #solution also uses recursion

        '''IDE will throw a fit if the ListNode comes up as None (null), so we add "Optional" to let it know
        we're okay if ListNode comes up as None. '''

        if list1 is not None and list2 is not None:
            if list1.val < list2.val:
                list1.next = self.mergeTwoLists(list1.next, list2)
                return list1
            else:
                list2.next = self.mergeTwoLists(list1, list2.next)
                return list2
            
        #if either list is empty return the non-empty list 
        if list1 is None:
            return list2
        return list1
        '''have to understand both java and python implementations of all problems, and start medium 
        type problems soon '''