class Solution(object):
    def fizzBuzz(self, n):
        li=[]
        for x in range(1,n+1):
            print(x)
            if(x%3==0 and x%5==0):
                li.append("FizzBuzz")
            elif(x%3==0):
                li.append("Fizz")
            elif(x%5==0):
                li.append("Buzz")
            else:
                li.append(str(x))
        return li
    
        