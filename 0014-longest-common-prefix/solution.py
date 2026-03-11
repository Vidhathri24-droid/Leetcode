class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        pre = strs[0]
        for i in range(1,len(strs)):
            while not strs[i].startswith(pre):
                pre = pre[:-1]
                if pre == "":
                    return ""
        return pre
