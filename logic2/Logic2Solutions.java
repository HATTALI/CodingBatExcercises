public boolean makeBricks(int small, int big, int goal) {
  if (big * 5 + small < goal) {
        return false;
    }
    int bigBricksUsed = Math.min(big, goal / 5);
    int remainingGoal = goal - bigBricksUsed * 5;
    return small >= remainingGoal;
}

///////////

public int loneSum(int a, int b, int c) {
  int sum = 0;

    if (a != b && a != c) {
        sum += a;
    }
    if (b != a && b != c) {
        sum += b;
    }
    if (c != a && c != b) {
        sum += c;
    }

    return sum;
}

////////////

public int luckySum(int a, int b, int c) {
  if (a == 13) {
    return 0;
  }
  if (b == 13) {
    return a;
  }
  if (c == 13) {
    return a + b;
  }
  return a + b + c;
}

/////////////

    public int noTeenSum(int a, int b, int c)
    {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n)
    {
        if ((n >= 13 && n <= 19) && !(n == 15 || n == 16))
        {
            return 0;
        }
        return n;
    }

//////////////

public int blackjack(int a, int b) {
  if (a > 21 && b > 21) return 0;
    if (a > 21) return b;           
    if (b > 21) return a;           
    return Math.max(a, b);       
}

/////////////

public boolean evenlySpaced(int a, int b, int c) {
  int min = Math.min(a, Math.min(b, c));
    int max = Math.max(a, Math.max(b, c));
    int mid = a + b + c - min - max; 

    return (mid - min) == (max - mid);

}

//////////////

public int makeChocolate(int small, int big, int goal) {
  int maxBigBars = goal / 5;                
    int bigBarsUsed = Math.min(maxBigBars, big); 
    int remaining = goal - (bigBarsUsed * 5);

    if (small >= remaining) {
        return remaining; 
    } else {
        return -1; 
    }
}
/////////////

public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
}

public int round10(int num) {
    if (num % 10 >= 5) {
        return num + (10 - num % 10); 
    } else {
        return num - (num % 10);      
    }
}
/////////////

public boolean closeFar(int a, int b, int c) {
  boolean bClose = Math.abs(a - b) <= 1;
    boolean cClose = Math.abs(a - c) <= 1;
    boolean bFar = Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
    boolean cFar = Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;

    return (bClose && cFar) || (cClose && bFar);
}
//////////
