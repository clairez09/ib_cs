package OctoberTwentyTwoProblems;

public class Problem5 {
    public static void main(String[] args){
        int[][] rawdata = {{ 192   ,     48   ,      206  ,      37},
                            {147    ,    90     ,    312    ,    21},
                            {186    ,    12    ,     121    ,    38},
                            {114    ,    21   ,      408     ,   39},
                            { 267   ,     13    ,     382     ,   29}};
        String [][] newdata = new String [rawdata.length+1][rawdata[0].length+1];
        char [] alphabet = {'A','B','C','D','E'};
        for (int i = 1; i<rawdata[0].length+1;i++){
            newdata[0][i] = "Canidate" + alphabet[i-1];
        }
        newdata[0][0] = "Precinct";
        for (int k = 1; k<rawdata.length+1;k++){
            newdata[k][0] = Integer.toString(k);
            for (int j = 1; j<rawdata[0].length+1;j++){
                newdata[k][j]=Integer.toString(rawdata[k-1][j-1]);
            }
        } 
        for (int l = 0; l<rawdata.length+1;l++){
            for (int m = 0; m<rawdata[0].length+1;m++){
                System.out.print(newdata[l][m]+"  ");
            }
            System.out.println("");
        }
        int[] totals = new int[rawdata[0].length];
        int grandTotal = 0;

        for (int i = 0; i < rawdata.length; i++) {
            for (int j = 0; j < rawdata[0].length; j++) {
                totals[j] += rawdata[i][j];
                grandTotal += rawdata[i][j];
            }
        }

        System.out.println("\nTotal Votes and Percentages:");
        for (int i = 0; i < totals.length; i++) {
            double percent = (double) totals[i] / grandTotal * 100;
            System.out.printf("Candidate "+ alphabet[i] + ": " + totals[i] + " votes (" + percent+ "%%)\n");
        }

        boolean hasMajority = false;
        int winnerIndex = -1;

        for (int i = 0; i < totals.length; i++) {
            if ((double) totals[i] / grandTotal > 0.5) {
                hasMajority = true;
                winnerIndex = i;
                break;
            }
        }

        if (hasMajority) {
            System.out.printf("\nCandidate "+ alphabet[winnerIndex] +" wins with over 50%% of the votes!\n");
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < totals.length; i++) {
                if (first == -1 || totals[i] > totals[first]) {
                    second = first;
                    first = i;
                } else if (second == -1 || totals[i] > totals[second]) {
                    second = i;
                }
            }
            System.out.printf("\n⚔️ No candidate received over 50%%. Run-off between "+ alphabet[first]+" and "+ alphabet[second] +"c.\n");
        }


    }
}
