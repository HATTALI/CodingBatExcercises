public int[] make2(int[] a, int[] b) {
  int[] result = new int[2];
        int count = 0;
        for (int i = 0; i < a.length && count < 2; i++) {
            result[count] = a[i];
            count++;
        }
        for (int i = 0; i < b.length && count < 2; i++) {
            result[count] = b[i];
            count++;
        }
        return result;
}
