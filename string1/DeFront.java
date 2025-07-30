public String deFront(String str) {    
  StringBuilder result = new StringBuilder();

        if (str.length() >= 1 && str.charAt(0) == 'a') {
            result.append('a');
        }

        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result.append('b');
        }

        if (str.length() >= 2) {
            result.append(str.substring(2));
        }

        return result.toString();
}
