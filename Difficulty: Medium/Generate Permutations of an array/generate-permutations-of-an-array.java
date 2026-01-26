class Solution {

    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];

        recurPermute(arr, ds, ans, freq);
        return ans;
    }

    public static void recurPermute(int[] arr,
                                    ArrayList<Integer> ds,
                                    ArrayList<ArrayList<Integer>> ans,
                                    boolean[] freq) {

        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);

                recurPermute(arr, ds, ans, freq);

                ds.remove(ds.size() - 1); // backtrack
                freq[i] = false;
            }
        }
    }
}
