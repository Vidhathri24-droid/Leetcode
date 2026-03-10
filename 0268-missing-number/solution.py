class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        n = len(nums)
        for i in range(n):
            if i != nums[i]:
                return i
        if n not in nums:
            return n
