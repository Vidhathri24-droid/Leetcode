class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        new = list(set(nums))
        if len(new) == len(nums):
            return False
        else:
            return True
