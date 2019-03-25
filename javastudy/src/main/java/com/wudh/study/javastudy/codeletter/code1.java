package com.wudh.study.javastudy.codeletter;

public class code1 {


    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数
     * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
     *
     * [1][2][10]
     * [2][4][20]
     * [5][7][21]
     */
    public static void main(String[] args) {
        int[][] target={{1,2,10},{2,4,20},{5,7,21}};
        int num=7;

        int j=target[0].length-1;
        for (int i=0;i<target.length;i++){
            if (num==target[i][j]){
                System.out.print("找到整数："+num+"在第"+(i+1)+"行第"+(j+1)+"列");
            }else if (num<target[i][j]){
                j--;
                i++;
            }
        }
    }
}
