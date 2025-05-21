├── README.md
├── arrays
│   └── two_sum.java
├── strings
├── hashmaps
├── linkedlists
├── trees
├── graphs

# README.md

# 🧠 DSA Practice Journey

This repository tracks my progress in mastering Data Structures and Algorithms (DSA), focused on cracking product-based SDE interviews in the next 6 months.

## 📅 Plan
- 6-month preparation roadmap
- 1-2 problems daily from NeetCode, LeetCode, or Striver's Sheet
- Track topics, approaches, and learning

## 📁 Folder Structure
- `arrays/` → Array-related problems
- `strings/` → String manipulation
- `hashmaps/` → HashMap logic & patterns
- `linkedlists/` → Single/Double Linked Lists
- `trees/` → Binary Trees, BST, DFS/BFS
- `graphs/` → Graph traversal, shortest path, etc.

## ✅ Progress

```markdown
- [x] Two Sum
- [ ] Best Time to Buy and Sell Stock
- [ ] Move Zeroes
- [ ] Longest Substring Without Repeating Characters
```

---

## 🔥 Example

```java
// arrays/two_sum.java

/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/
Approach: Use HashMap to store complements
Time: O(n), Space: O(n)
Learned: Always check for complement before inserting
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## 🚀 Let’s grind!
This is my commitment to improving daily. Let’s go 💪
