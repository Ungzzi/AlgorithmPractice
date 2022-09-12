def solution(nums):
    max_n = len(nums)/2
    nums = set(nums)
    
    if len(nums) < max_n:
        return len(nums)
    else:
        return max_n