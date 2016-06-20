// Problems by CodingBat.com 
// Solutions by David J. Davis 
// All solutions are first attempts, non-refactored code in the process of learning Java.  


// Problem 1 
// --------------------------------------------------------------------------------------
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


// Problem 2
// --------------------------------------------------------------------------------------
// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

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

// Problem 3
// --------------------------------------------------------------------------------------
// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

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

// Problem 4
// --------------------------------------------------------------------------------------
// Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

// missingChar("kitten", 1) → "ktten"
// missingChar("kitten", 0) → "itten"
// missingChar("kitten", 4) → "kittn"

// Initial (Not sure that this module would be better)

// public String missingChar(String str, int n) {
//   	StringBuilder newString = new StringBuilder(str); 
// 	return newString.deleteCharAt(n).toString(); 
// }

public String missingChar(String str, int n) {
	return str.substring(0, n) + str.substring(n + 1);
}


// Problem 5
// --------------------------------------------------------------------------------------
// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

// monkeyTrouble(true, true) → true
// monkeyTrouble(false, false) → true
// monkeyTrouble(true, false) → false

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if((aSmile && bSmile) || (!aSmile && !bSmile)){ 
    return true;  
  } else { 
    return false;  
  }
}


