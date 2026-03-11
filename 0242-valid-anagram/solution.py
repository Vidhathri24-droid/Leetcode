class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        n = len(s)
        m = len(t)
        if n != m:
            return False
        else:
            if sorted(s) == sorted(t):
                return True
            else:
                return False
        
