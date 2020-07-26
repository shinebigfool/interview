package com.company;

public class PicCopy {
    /*
    原H*W矩阵，要将n*m矩阵存入，并从(x,y)点作为(0,0)点
    */
    public void copyBitmap(int W,int H,int m,int  n,int x, int y,byte[][] dest,byte[][] src) {
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){//遍历src数组
                dest[x+i][y+j]=src[i][j];//简单赋了下值，没理解透这个题目的意思
            }
        }
    }
}
