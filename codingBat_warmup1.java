// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

// diff21(19) → 2
// diff21(10) → 11
// diff21(21) → 0

public int diff21(int n) {
  int num  = 21; 
  int diff; 
  
  if(n >= num){ 
    diff = (n-num) * 2; 
  } else { 
    diff = (num - n); 
  }
  
  return Math.abs(diff); 
}


// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
// 
// parrotTrouble(true, 6) → true
// parrotTrouble(true, 7) → false
// parrotTrouble(false, 6) → false

public boolean parrotTrouble(boolean talking, int hour) {
  if((hour < 7 || hour > 20) && talking){ 
      return true; 
  } else{ 
      return false; 
  }
}

// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
// 
// makes10(9, 10) → true
// makes10(9, 9) → false
// makes10(1, 9) → true

public boolean makes10(int a, int b){
    int num = 10; 
    int c = a + b; 
    if(a == 10 || b == 10 || c == 10){ 
        return true;     
    } else { 
        return false;
    }
}

