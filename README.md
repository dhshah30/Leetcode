# Leetcode
1. 933. Number of Recent Calls
      You have a RecentCounter class which counts the number of recent requests within a certain time frame.

      Implement the RecentCounter classs

      Example 1:

      Input
      ["RecentCounter", "ping", "ping", "ping", "ping"]
      [[], [1], [100], [3001], [3002]]
      Output
      [null, 1, 2, 3, 3]

2. Given a string s, find the length of the longest substring without repeating characters.

      Example 1:

      Input: s = "abcabcbb"
      Output: 3
      Explanation: The answer is "abc", with the length of 3.
      Example 2:

      Input: s = "bbbbb"
      Output: 1
      Explanation: The answer is "b", with the length of 1.

      3.Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

      Return the answer in an array.

      Example 1:

      Input: nums = [8,1,2,2,3]
      Output: [4,0,1,1,3]
      Explanation: 
      For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
      For nums[1]=1 does not exist any smaller number than it.
      For nums[2]=2 there exist one smaller number than it (1). 
      For nums[3]=2 there exist one smaller number than it (1). 
      For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
