class Solution {
    public boolean isProduct(int[] arr, long target) {

        HashMap<Long, Long> mpp = new HashMap<>();

        for (long num : arr) {
            mpp.put(num, mpp.getOrDefault(num, 0L) + 1);
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                if (target == 0 && arr.length > 1)
                    return true;
                continue;
            }

            if (target % arr[i] == 0) {

                long partner = target / arr[i];

                if (mpp.containsKey(partner)) {

                    if (partner == arr[i]) {
                        if (mpp.get(partner) >= 2)
                            return true;
                    } else {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}