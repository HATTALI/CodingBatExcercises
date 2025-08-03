public int blueTicket(int a, int b, int c) {
  int abSum = a + b;
        int bcSum = b + c;
        int acSum = a + c;
        if (abSum == 10 || bcSum == 10 || acSum == 10) {
            return 10;
        }
        if (abSum - bcSum == 10 || abSum - acSum == 10) {
            return 5;
        }
        return 0;
}
