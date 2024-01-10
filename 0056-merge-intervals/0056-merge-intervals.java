class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(row -> row[0]));
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        inner.add(intervals[0][0]);
        inner.add(intervals[0][1]);
        al.add(inner);
        for( int i = 1; i < intervals.length; i++)
        {
            inner = new ArrayList<>();
            if(al.get(al.size()-1).get(1) >= intervals[i][0]){
                if(al.get(al.size()-1).get(1) < intervals[i][1]){
                    inner.add(al.get(al.size()-1).get(0));
                    inner.add(intervals[i][1]);
                    al.set(al.size()-1, inner);
                }
                
            }
            else{
                inner.add(intervals[i][0]);
                inner.add(intervals[i][1]);
                al.add(inner);
            }
        }
        int[][] array2D = new int[al.size()][];
        for (int i = 0; i < al.size(); i++) {
            inner = al.get(i);
            array2D[i] = new int[inner.size()];
            for (int j = 0; j < inner.size(); j++) {
                array2D[i][j] = inner.get(j);
            }
        }
        return array2D;
    }
}