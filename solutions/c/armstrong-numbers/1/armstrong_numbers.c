#include "armstrong_numbers.h"
#include <math.h>

int countDigits(int number) 
{
    if (number == 0) 
    {
        return 1;
    }

    int count = 0;
    while (number != 0) 
    {
        number /= 10;
        count++;
    }
    return count;
}

bool is_armstrong_number(int candidate) 
{
    int loopingNum = candidate;
    int exp = countDigits(candidate);
    int armstrongNum = 0;
    
    if (loopingNum < 0) 
    {
        loopingNum = -loopingNum;
    } 

    while (loopingNum != 0) 
    {
        armstrongNum += pow(loopingNum % 10, exp);
        loopingNum /= 10;
    }

    if (armstrongNum == candidate) 
    {
        return true;
    }
    
    return false;
}