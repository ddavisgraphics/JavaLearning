public String stringTimes(String str, int n) {
  String newString = "";
  for(int i = 0; i < n; i++){ 
    newString = newString.concat(str); 
  }
  return newString; 
}
