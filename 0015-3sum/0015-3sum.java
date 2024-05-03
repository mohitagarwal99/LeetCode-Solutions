class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int j = i+1;
            int k = arr.length-1;
            while(j < k){
                // System.out.println(3);
                int sum = arr[i] +arr[j] +arr[k];
                // System.out.println("sum is " + sum + " i is "+ i + " j is "+ j +" k is "+ k  );
                if(sum == 0){
                    // System.out.println(1);
                    ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
                    do{
                        k--;
                    }
                    while(j < k && arr[k+1] == arr[k]);
                    do{
                        j++;
                    }
                    while(j < k && arr[j-1] == arr[j]);
                }
                else if(sum > 0) 
                {
                    // System.out.println(4);
                    do{
                        k--;
                    }
                    while(j < k && arr[k+1] == arr[k]);
                        
                }
                else{
                    // System.out.println(5);
                    do{
                        j++;
                    }
                    while(j < k && arr[j-1] == arr[j]);
                        
                }
                
                
            }
            while(i < arr.length-1 && arr[i] == arr[i+1])
                i++;
                
            
        }
        return ans;
    }
}