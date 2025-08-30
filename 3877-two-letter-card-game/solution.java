class Solution {
    private static int sum(int[] a){
        int s = 0;
        for (int v : a) {
            s += v;
        }
        return s;
    }

    private static int pairsAfterRemoval(int[] counts, int s){
        int total = 0;
        int[] arr = new int[26];
        int m = 0;
        for (int v : counts){
            if (v > 0){
                arr[m++] = v;
                total += v;
            }
        }
        if (m == 0|| s >= total){
            return 0;
        }

        Arrays.sort(arr,0,m);

        for (int i = 0, j = m - 1; i < j; i++, j--){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        int Mprime = newMaxAfterRemoval(arr, m, s);
        int remaining = total - s;
        return Math.min(remaining / 2, remaining - Mprime);
    }

    private static int newMaxAfterRemoval(int[] a, int m, int s){
        if (s == 0){
            return a[0];
        }
        long S = s;
        int[] b = Arrays.copyOf(a,m);

        for (int k = 1; k < m; k++){
            long diff = b[k-1] - b[k];
            long need = diff * k;
            if (S >= need){
                for (int t = 0; t < k; t++){
                    b[t] -= diff;
                }
                S -= need;
            } else {
                long dec = (S + k - 1) / k;
                return b[0] - (int) dec;
            }
        }
        if (S > 0){
            long dec = (S + m - 1) / m;
            int v = b[m - 1] - (int) dec;
            return Math.max(0,v);
        }
        return b[0];
    }
    public int score(String[] cards, char x) {
        int xi = x - 'a';
        int[] A = new int[26];
        int[] B = new int[26];
        int xx = 0;

        for (String s: cards){
            char c0 = s.charAt(0), c1 = s.charAt(1);
            if (c0 != x && c1 != x){
                continue;
            }
            if (c0 == x && c1 == x){
                xx++;
            } else if (c0 == x){
                A[c1 - 'a']++;
            } else{
                B[c0 - 'a']++;
            }
        }
        A[xi] = 0;
        B[xi] = 0;
        int totalA = sum(A);
        int totalB = sum(B);
        int q = Math.min(xx, totalA + totalB);

        int best = 0;
        int low = Math.max(0, q - totalB);
        int high = Math.min(q, totalA);
        for (int sA = low; sA <= high; sA++){
            int sB = q - sA;
            int pairsA = pairsAfterRemoval(A, sA);
            int pairsB = pairsAfterRemoval(B, sB);
            best = Math.max(best, q + pairsA + pairsB);
        }
        return best;

    }
}
