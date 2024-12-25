class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        a = len(nums)
        b = set(nums)
        for num in range(a+1):
            if num not in b:
                return num
