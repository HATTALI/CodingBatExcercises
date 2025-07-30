public String withoutX2(String str) {
  if (str.length() < 2) {
        if (str.equals("x")) {
            return "";
        }
        return str;
    }

    StringBuilder result = new StringBuilder();
    if (str.charAt(0) != 'x') {
        result.append(str.charAt(0));
    }
    if (str.charAt(1) != 'x') {
        result.append(str.charAt(1));
    }

    if (str.length() > 2) {
        result.append(str.substring(2));
    }

    return result.toString();

}
