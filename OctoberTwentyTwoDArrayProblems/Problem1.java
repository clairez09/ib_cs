package OctoberTwentyTwoDArrayProblems;

public class Problem1 {
    public static void main(String[] args){
    int map[][] = {{34,21,32,41,25},{14,42,43,14,31},{54,45,52,42,23},{33,15,51,31,35},{21,52,33,13,23}};
    int temp = map[1][1];
    int row = (temp / 10) - 1;
    int column = (temp % 10) - 1;
    while (row != column){
        temp = map[row][column];
        row = (temp / 10) - 1;
        column = (temp % 10) - 1;
    }
    int finalrow = row+1;
    int finalcolumn = column+1;
    System.out.println("The treasure is at" + finalrow + finalcolumn);
}
}
