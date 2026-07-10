class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        if len(s) >= 2:
            for i in range(len(s)):
                if s[i] == "(" or s[i] == "{" or s[i]=="[":
                    stack.append(s[i])
                if s[i] == "]":
                    if not stack:
                        return False
                    peek = stack.pop()
                    if peek != "[" :
                        return False
                if s[i] == ")":
                    if not stack:
                        return False
                    peek = stack.pop()
                    if peek != "(" :
                        return False
                
                if s[i] == "}":
                    if not stack:
                        return False
                    peek = stack.pop()
                    if peek != "{" :
                        return False
            if len(stack) == 0:
                return True
            return False
        else:
            return False
                  
