package countOfAtoms726;

public class Solution {
    public String countOfAtoms(String formula) {
        String formula1="";

        for (int i=0;i<formula.length();i++){

            Character first=formula.charAt(i);
            formula1+=first;
            Character last=formula.charAt(i+1);
            if (first>=65&&first<=90&&last>=65&&last<=90){
                formula+=1;
            }
        }
        return formula1;

    }


    public static void main(String[] args) {
        System.out.println(new Solution().countOfAtoms("H2O"));
    }
}

