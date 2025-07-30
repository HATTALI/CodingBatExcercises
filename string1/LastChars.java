public String lastChars(String a, String b) {
  char firstCharA;
    char lastCharB;

    if (a.length() == 0) {
        firstCharA = '@';
    } else {
        firstCharA = a.charAt(0);
    }

    if (b.length() == 0) {
        lastCharB = '@';
    } else {
        lastCharB = b.charAt(b.length() - 1);
    }

    return String.valueOf(firstCharA) + String.valueOf(lastCharB);
}
