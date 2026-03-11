class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        result = ""
        for ch in s:
            if ch.isalnum():
                result += ch
        #without = result.replace(" ","")
        lower = result.lower()
        reversed_s = lower[::-1]
        if lower == reversed_s:
            return True
        else:
            return False
