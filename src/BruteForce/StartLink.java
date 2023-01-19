package BruteForce;

import java.util.*;
import java.io.*;

public class StartLink {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        int[] inter = new int[N];
        boolean[] visited = new boolean[n];
        int [][] team = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] temp_string = bf.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                team[i][j] = Integer.parseInt(temp_string[j]);
            }
        }
    }

    public static void compute(int idx, int depth){
        for (int i = idx, i < (N+1); i++){
        }
    }
}
