import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet> {
    int x;
    int y;
    int dist;

    public Triplet(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }

    public int compareTo(Triplet t2) {
        return this.dist - t2.dist;
    }
}

public class kClosestPoints {
    public static ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {

        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int[] ele : points) {
            int x = ele[0];
            int y = ele[1];
            int dist = x * x + y * y;
            pq.add(new Triplet(x, y, dist));

            if (pq.size() > k)
                pq.remove();
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            Triplet top = pq.remove();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(top.x);
            temp.add(top.y);

            ans.add(temp);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        ArrayList<ArrayList<Integer>> ans = kClosest(points, k);

        for (ArrayList<Integer> ele : ans) {
            System.out.println(ele);
        }
    }
}

