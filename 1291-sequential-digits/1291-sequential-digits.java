class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> l = new ArrayList<>();
        int temp = low, lowc = 0;
        while(temp != 0)
        {
            lowc++;
            temp /= 10;
        }
        int temp2 = 123456789;
        boolean flag = false;
        for(int i = 0; i < 8; i++)
        {
            temp = temp2  / (int)Math.pow(10, 9-lowc-i);
            for(int j = 0; j < 10-lowc-i; j++)
            {
                if(temp > high){
                    flag = true;
                    break;
                }
                
                else if(temp >= low){
                    l.add(temp);
                }
                if(temp == 123456789)
                {
                    flag = true;
                    break;
                }
                System.out.println(temp);
                int last = temp % 10;
                temp = temp % ((int)Math.pow(10, lowc-1+i));
                temp = temp * 10 + last + 1;
                System.out.println(temp);
                
            }
            if(flag)
                break;
        }
        return l;
    }
}