public String doubleChar(String str) {
  String result = "";
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        result += ch;
        result += ch;
    }
    return result;
}
//////////////////////

public int countHi(String str) {
  int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.substring(i, i + 2).equals("hi")) {
            count++;
        }
    }
    return count;
}

////////////////////

public boolean catDog(String str) {
  int catCount = 0;
    int dogCount = 0;

    for (int i = 0; i < str.length() - 2; i++) {
        String sub = str.substring(i, i + 3);
        if (sub.equals("cat")) {
            catCount++;
        } else if (sub.equals("dog")) {
            dogCount++;
        }
    }
    return catCount == dogCount;
}

//////////////////////

public int countCode(String str) {
  int count = 0;
    for (int i = 0; i < str.length() - 3; i++) {
        if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
            count++;
        }
    }
    return count;
}

//////////////////////

public boolean endOther(String a, String b) {
  String aLower = a.toLowerCase();
  String bLower = b.toLowerCase();
  return aLower.endsWith(bLower) || bLower.endsWith(aLower);
}

/////////////////////

public boolean xyzThere(String str) {
  for (int i = 0; i < str.length() - 2; i++) {
        if (str.substring(i, i + 3).equals("xyz")) {
            if (i == 0 || str.charAt(i - 1) != '.') {
                return true;
            }
        }
    }
    return false;
}

////////////////////

public boolean bobThere(String str) {
  for (int i = 0; i < str.length() - 2; i++) {
        if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
            return true;
        }
    }
    return false;
}

//////////////////

public boolean sameStarChar(String str) {
  for (int i = 1; i < str.length() - 1; i++) {
        if (str.charAt(i) == '*') {
            if (str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
    }
    return true;
}

//////////////////

public String oneTwo(String str) {
  StringBuilder result = new StringBuilder();

    for (int i = 0; i <= str.length() - 3; i += 3) {
        char first = str.charAt(i);
        char second = str.charAt(i + 1);
        char third = str.charAt(i + 2);
        result.append(second).append(third).append(first);
    }
    return result.toString();
}
////////////////////

public String zipZap(String str) {
  StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < str.length()) {
        if (i <= str.length() - 3 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
            result.append("zp"); 
            i += 3;       
        } else {
            result.append(str.charAt(i));
            i++;
        }
    }
    return result.toString();
}
//////////////////

public String starOut(String str) {
  StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '*') {
            continue;
        }
        if (i > 0 && str.charAt(i - 1) == '*') {
            continue;
        }
        if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
            continue;
        }
        result.append(str.charAt(i));
    }
    return result.toString();
}

//////////////////

public String plusOut(String str, String word) {
  StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < str.length()) {
        if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
            result.append(word);
            i += word.length();
        } else {
            result.append("+");
            i++;
        }
    }
    return result.toString();
}

////////////////////

public String wordEnds(String str, String word) {
  StringBuilder result = new StringBuilder();
    int wordLen = word.length();
    for (int i = 0; i <= str.length() - wordLen; i++) {
        if (str.substring(i, i + wordLen).equals(word)) {
            if (i > 0) {
                result.append(str.charAt(i - 1));
            }
            if (i + wordLen < str.length()) {
                result.append(str.charAt(i + wordLen));
            }
        }
    }
    return result.toString();
}

////////////////////