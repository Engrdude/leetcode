class Solution {
    public double angleClock(int hour, int minutes) {
        double hr=((double)(hour%12)+(double)minutes/60)*30;
        double min=(double)minutes*6;
        double ang=Math.abs(min-hr);
        if(ang>180)
        ang=360-ang;

        return ang;
        

      
        
    }
}