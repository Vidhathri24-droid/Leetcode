class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        n = len(s)
        for i in range(n):
            ele = s[i]
            new_list = s[i+1::]
            if i != 0:
                if (s[i] not in s[i+1::]) and (s[i] not in s[:i]):
                    return i
            else:
                if (s[i] not in s[i+1::]):
                    return i

            
        return -1

        
