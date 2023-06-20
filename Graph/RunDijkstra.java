// import java.util.*;

public class RunDijkstra {
    static double[][] map;
    static int src;
    static int dst;

    // Fungsi untuk mengubah node int menjadi representasi char
    public static char getChar(int i) {
        return (char) (i + 65);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Masukkan jumlah node:");
        // int nTown = sc.nextInt();
        // map = new double[nTown][nTown];

        // Inisialisasi nilai tiap elemen dari array 2d map[][]
        double[][] map = {
            {0, 1, 7, 2, 0, 0, 0, 0},
            {1, 0, 0, 0, 2, 4, 0, 0},
            {7, 0, 0, 0, 0, 2, 3, 0},
            {2, 0, 0, 0, 0, 0, 5, 0},
            {0, 2, 0, 0, 0, 1, 0, 0},
            {0, 4, 2, 0, 1, 0, 0, 6},
            {0, 0, 3, 5, 0, 0, 0, 2},
            {0, 0, 0, 0, 0, 6, 2, 0}
        };

        // System.out.println("Masukkan starting node");
        // src = sc.nextInt();
        // System.out.println("Masukkan destination node");
        // dst = sc.nextInt();

        // Dari A ke H
        src = 0;
        dst = 7;

        Dijkstra dj = new Dijkstra(map);
        dj.solve(src, dst);
        System.out.println("Jarak terpendek dari " + getChar(src) + " ke " 
                            + getChar(dst) + " adalah " + (int)dj.getDistance(dst));
    }
}
