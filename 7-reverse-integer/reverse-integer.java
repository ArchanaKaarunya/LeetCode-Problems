class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0)
        {
           int y=x%10;
        
        if(rev>Integer.MAX_VALUE/10||Integer.MAX_VALUE/10==rev&&y>7)
        {
            return 0;
        }
        else if(rev<Integer.MIN_VALUE/10||Integer.MIN_VALUE/10==rev&&y<-8)
        {
            return 0;

        }
        rev=rev*10+y;
        x=x/10;
    }
    return rev;




    }
        
    }
