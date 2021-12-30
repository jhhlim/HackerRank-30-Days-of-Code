#!/bin/python

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(raw_input().strip())
    maximum=0
    current=0
    while(n>0):
        
        if n%2==1:
            current+=1
            if current > maximum:
                maximum=current
        
            
        else:
            current=0
        n//=2
print(maximum)
