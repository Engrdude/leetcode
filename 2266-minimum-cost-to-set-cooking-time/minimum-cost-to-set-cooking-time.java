
      class Solution {
    public int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        int minCost = Integer.MAX_VALUE;
        
      
        for (int minutes = 0; minutes <= 99; minutes++) {
            for (int seconds = 0; seconds <= 99; seconds++) {
                if (minutes * 60 + seconds == targetSeconds) {
                   
                    String timeStr = String.format("%02d%02d", minutes, seconds).replaceFirst("^0+", "");
                    int cost = calculateCost(timeStr, startAt, moveCost, pushCost);
                    minCost = Math.min(minCost, cost);
                }
            }
        }
        
        return minCost;
    }

    private int calculateCost(String timeStr, int startAt, int moveCost, int pushCost) {
        int cost = 0;
        int currentPos = startAt;

        for (char ch : timeStr.toCharArray()) {
            int digit = ch - '0';
            if (digit != currentPos) {
                cost += moveCost; 
                currentPos = digit;
            }
            cost += pushCost; 
        }

        return cost;
    }
}
