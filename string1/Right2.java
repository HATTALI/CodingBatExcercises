public String right2(String str) {
        String lastTwoChars = str.substring(str.length() - 2);
        String remainingChars = str.substring(0, str.length() - 2);
        return lastTwoChars + remainingChars;
}