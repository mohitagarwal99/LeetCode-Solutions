class Solution {
    public List<List<Integer>> generate(int numRows) {
        int prev;
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> innerList1 = Arrays.asList(1);
        outer.add(innerList1);
        for(int i = 2; i <= numRows; i++)
        {
            prev = 0;
            List<Integer> inner = new ArrayList<>();
            for(int j = 1; j < i; j++)
            {
                inner.add(outer.get(i-2).get(j-1) + prev);
                prev = outer.get(i-2).get(j-1);
            }
            inner.add(1);
            outer.add(inner);
        }
        return outer;
    }
}