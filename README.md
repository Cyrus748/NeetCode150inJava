# NeetCode 150 in Java

🚀 **Welcome to NeetCode 150 in Java!** This repository contains well-optimized Java solutions for the **NeetCode 150** problems, a curated list of essential **Data Structures & Algorithms (DSA)** questions frequently asked in coding interviews.

## 📌 About This Repository
This repository serves as a structured guide for mastering DSA in Java. Each solution is:
- **Optimized** for performance
- **Well-commented** for better understanding
- **Categorized** based on problem types

📚 Whether you are preparing for **FAANG interviews** or brushing up on **competitive programming**, this repo will be your **one-stop resource**!

---

## 👨‍💻 About the Author
Hi, I'm **Aditya Negi**, a **Computer Science Engineering** student at **Chandigarh University** with a deep interest in:
- Blockchain Development ⛓️
- Cybersecurity 🔐
- Hardware & Software Development 💻
- Competitive Programming ⚡

I'm always excited to learn and work on cutting-edge technologies! 

### 📲 Connect with Me:
- **GitHub**: [github.com/Cyrus748](https://github.com/Cyrud748)
- **LinkedIn**: [linkedin.com/in/adityanegi748](https://linkedin.com/in/adityanegi748)
- **Twitter**: [twitter.com/_adityanegi69](https://twitter.com/_adityanegi69)
- **Portfolio**: [devbyaditya.vercel.app](https://devbyaditya.vercel.app)

Feel free to connect! 🚀

---

## 📌 Problem 1: Duplicate Integer
**Problem Link:** [NeetCode](https://neetcode.io/problems/duplicate-integer) [LeetCode](https://leetcode.com/problems/contains-duplicate/)

### 🔹 Problem Statement
Given an array of integers containing **n + 1** integers where each integer is between **1 and n (inclusive)**, find the **duplicate** integer. You must solve the problem **without modifying** the array and using **constant extra space**.

### 🔹 Approach 1: Brute Force
**Intuition:**
The brute force approach compares each element with every other element in the array to check for duplicates. If any duplicates are found, it returns `true`. This approach is straightforward but has a time complexity of **O(n²)**, making it less efficient for large arrays.

**Algorithm:**
1. Iterate through the array with an outer loop.
2. Use an inner loop to compare the current element with all other elements.
3. If a duplicate is found, return `true`.
4. If no duplicates are found after checking all elements, return `false`.

**Java Solution:**
```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}
```
**Time Complexity:** `O(n²)`, where `n` is the length of the array.

---

### 🔹 Approach 2: Sorting
**Intuition:**
Sorting the array brings duplicate elements next to each other, making it easier to detect duplicates by comparing adjacent elements.

**Algorithm:**
1. Sort the array in ascending order.
2. Iterate through the sorted array and check if any adjacent elements are the same.
3. If a duplicate is found, return `true`.
4. Otherwise, return `false`.

**Java Solution:**
```java
import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
```
**Time Complexity:** `O(n log n)` due to sorting.

---

### 🔹 Approach 3: Hash Set
**Intuition:**
Using a hash set allows for constant-time lookups, enabling an efficient solution with `O(n)` time complexity.

**Algorithm:**
1. Initialize an empty hash set.
2. Iterate through the array and check if an element is already in the set.
3. If a duplicate is found, return `true`.
4. Otherwise, add the element to the set.
5. If no duplicates are found, return `false`.

**Java Solution:**
```java
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}
```
**Time Complexity:** `O(n)`.

---

### 🔹 Approach 4: Hash Map
**Intuition:**
A hash map can be used to store the count of each element, allowing detection of duplicates efficiently.

**Algorithm:**
1. Initialize an empty hash map.
2. Iterate through the array and update the count of each element in the map.
3. If an element appears more than once, return `true`.
4. Otherwise, return `false`.

**Java Solution:**
```java
import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
```
**Time Complexity:** `O(n)`.

---

Stay tuned for more Java solutions! Happy Coding! 🚀
