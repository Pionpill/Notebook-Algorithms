package pionpill.algorithm.sort;

import pionpill.algorithm.utils.CollectionUtils;
import pionpill.algorithm.utils.MathUtils;

public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;

    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    public Key delMax(Key v) {
        Key max = pq[1];
        pq[1] = pq[N--];
        pq[N + 1] = null;
        sink(1);
        return max;
    }

    private void swim(int k) {
        while (k > 1 && MathUtils.isLess(pq[k / 2], pq[k])) {
            CollectionUtils.exchange(pq, k / 2, k);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= pq.length) {
            int j = 2 * k;
            if (j < pq.length && MathUtils.isBig(pq[j + 1], pq[j]))
                j ++;
            if (MathUtils.isLess(pq[j], pq[k])) break;
            CollectionUtils.exchange(pq, k, j);
            k = j;
        }
    }
}
