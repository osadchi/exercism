package org.example;

class PascalsTriangleGenerator {

    int[][] generateTriangle(int rows) {
        int[][] triangle = new int[rows][];
        int n = 1;
        for (int i = 0; i < rows; ++i)
        {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; ++j)
            {
                triangle[i][j] = n;
                n = Integer.max(n * (i - j) / (j + 1), 1);

            }
        }
        return triangle;
    }

}
