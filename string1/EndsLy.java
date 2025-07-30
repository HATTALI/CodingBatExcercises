public boolean endsLy(String str) {
  if (str.length() < 2) {
        return false;
    }
    String lastTwoChars = str.substring(str.length() - 2);
    return lastTwoChars.equals("ly");
}
