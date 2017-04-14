def isEven(num):
    return True if ((n & 1) == 0) else False 

if __name__ == '__main__':
    n = int(input())
    if (not isEven(n) or n in range(6,21)):
        print("Weird")
    else:
        print("Not Weird")
