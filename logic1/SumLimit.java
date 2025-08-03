public int sumLimit(int a, int b) {
  int sum = a + b;
        String aString = String.valueOf(a);
        String sumString = String.valueOf(sum);
        int aLength = aString.length();
        int sumLength = sumString.length();
        if (sumLength == aLength) {
            return sum;
        } else {
            return a;
        }
}
