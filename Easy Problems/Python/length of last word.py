class Solution:
    def lengthOfLastWord(self, s: str) -> int:

        words = s.split(" ")
        lastWordCounter = 0

        for i in range(len(words)):
            if i == len(words)-1:
                lastWordCounter = len(words[i])

        return lastWordCounter