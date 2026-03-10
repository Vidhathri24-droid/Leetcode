class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        new_set = set(nums)
        for i in new_set:
            new_count = nums.count(i)
            if new_count > n//2:
                return i
