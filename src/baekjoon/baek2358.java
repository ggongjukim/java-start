package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i] = input;
        }

        int ans = 0;
        // 기울기 찾기
        for(int i=0;i < n;i++){
            for(int j = i+1 ;j<n;j++){
                // 기울기 구하기
                int dx = Integer.parseInt(arr[i][0]) - Integer.parseInt(arr[j][0]);
                int dy = Integer.parseInt(arr[i][1]) - Integer.parseInt(arr[j][1]);
                if ((dx == 0 || dy == 0) && !(dx == 0 && dy == 0)) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

