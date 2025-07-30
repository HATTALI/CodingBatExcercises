public String lastTwo(String str) {
  if (str.length() < 2) {
        return str;
    }
    String beginning = str.substring(0, str.length() - 2);
    char lastChar = str.charAt(str.length() - 1);
    char secondLastChar = str.charAt(str.length() - 2);
    return beginning + lastChar + secondLastChar;
}
