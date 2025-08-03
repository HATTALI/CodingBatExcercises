public int caughtSpeeding(int speed, boolean isBirthday) {
  int speedAdjustment = 0;
        if (isBirthday) {
            speedAdjustment = 5;
        }
        if (speed <= (60 + speedAdjustment)) {
            return 0; 
        } else if (speed >= (61 + speedAdjustment) && speed <= (80 + speedAdjustment)) {
            return 1; 
        } else {
            return 2; 
        }
}
