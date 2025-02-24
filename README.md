# Connecting-Pairs-of-Persons

Assume that there are 𝒏 individuals (possibly couples) sitting in 𝟐𝒏 seats arranged in a row. They
are able to hold hands. These individuals and the seats are represented by an integer row, where
𝑟𝑜𝑤[𝑖] is the ID of the person sitting in the 𝑖 !" seat. The couples are arranged in order, the first
couple is presented as (0, 1), the second couple being (2, 3), and so on, until the last couple. The
last couple being (2𝑛 − 2, 2𝑛 − 1).
Design an algorithm that takes in any available number of couple and return the minimum number
of swaps, such that every couple is sitting side by side. A swap consists of choosing any two
people, and ensuring that they switch seats,
Below are some sample inputs and outcomes.
Sample 1:
Input: row = [0, 2, 1, 3]
Output: 1
Only the second (row[1]) needs to be swapped with the third (row[2]) individual
Sample 2:
Input: row = [3,2,0,1]
Output: 0
All couples are already seated side by side
Assume that 𝒏 is less or equal to 30 and even. 2𝑛 represents the length of each row. All elements
of the row are unique

## Mathematical analysis and correct Big O efficiency class

In the program there are 2 loops and at worst both run n/2 times, therefore at max it will run (n^2)/4 times and it's time complexity is O(n^2)
