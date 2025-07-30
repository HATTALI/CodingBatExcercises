public String without2(String str) {
  if (str.length() >= 2) {
        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);

        if (firstTwo.equals(lastTwo)) {
            return str.substring(2);
        }
    }
    return str;
}
