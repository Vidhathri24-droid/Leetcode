class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        curr_max, max_till_now = 0, -21345678907890987654567890
        for c in nums:
            curr_max = max(c,curr_max+c)
            max_till_now = max(max_till_now,curr_max)
        return max_till_now
