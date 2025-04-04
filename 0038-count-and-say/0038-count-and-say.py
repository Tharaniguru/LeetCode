class Solution(object):
    def countAndSay(self, n):
        
        result = "1"
        
        for _ in range(2, n + 1):
            next_sequence = []
            count = 1
            current = result[0]
            
            for digit in result[1:]:
                if digit == current:
                    count += 1
                else:
                    next_sequence.extend([str(count), current]) 
                    current = digit
                    count = 1
                    
            next_sequence.extend([str(count), current])
            result = "".join(next_sequence)
            
        return result