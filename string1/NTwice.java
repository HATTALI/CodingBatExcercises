public String nTwice(String str, int n) {
    if (str.length() < n){
      return str;
    }  
    String lastNChars = str.substring(str.length() - n);
    String FirstNChars = str.substring(0, n);
    
    return FirstNChars + lastNChars;

}
