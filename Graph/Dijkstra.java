public class Dijkstra {
    // Dijkstra merupakan algoritma untuk mencari shortest path pada sebuah graph

    int nTown;
    double[][] map;
    double[] distance;
    int src;

    Dijkstra(double[][] map) {
        this.map = map;
        nTown = map.length; // Jumlah node
    }

    public void solve(int src, int dst) {
        this.src = src; // Set starting node
        boolean[] selected = new boolean[nTown]; // Untuk mengecek apakah node sudah dipilih atau belum
        distance = new double[nTown]; // Jarak terpendek ke tiap node

        for (int i = 0; i < nTown; i++) { // Inisialisasi jarak
            distance[i] = Double.MAX_VALUE; // Jarak terpendek = tak hingga
            selected[i] = false;
        }
        distance[src] = 0; // Jarak ke starting node = 0

        while (true) {
            // Dari node-node yang belum dipilih, pilih yang jaraknya terdekat
            int marked = minIndex(distance, selected);

            if (marked < 0) return; // Seluruh node sudah dipilih
            if (distance[marked] == Double.MAX_VALUE) return; // Ada node yang tidak terhubung
            selected[marked] = true; // Tandai node tersebut sebagai "sudah dipilih"
            if (marked == dst) return; // Sudah sampai tujuan, selesai

            for (int j = 0; j < nTown; j++) { // Untuk tiap node yang terhubung dengan node yang baru saja dipilih
                if (map[marked][j] > 0 && !selected[j]) { // Dan node tersebut belum dipilih
                    // Hitung jaraknya
                    double newDistance = distance[marked] + map[marked][j];
                    // Update jika nilainya lebih kecil
                    if (newDistance < distance[j]) distance[j] = newDistance;
                }
            }
        }
    }

    // Menentukan index node yang jaraknya terdekat
    private int minIndex(double[] distance, boolean[] selected) {
        double dist = Double.MAX_VALUE; // Inisialisasi nilai jarak untuk perbandingan
        int index = -1; // Inisialisasi index node yang akan dipilih

        for (int i = 0; i < nTown; i++) {
            if (!selected[i] && distance[i] < dist) { // Node dengan jarak terkecil yang belum dipilih
                dist = distance[i];
                index = i;
            }
        }
        return index;
    }

    public double getDistance(int dst) {
        return distance[dst];
    }
}
