package SelfPractices;

public class Uniques {
    public static void main(String[] args) {
        System.out.println(uniques("aliasici"));

    }
    public static String uniques(String str ){
        String unique = "";

        for (int i = 0; i <= str.length()-1; i++){
            int count = 0;

            for(int j = 0 ; j <= str.length()-1; j++){
                if(str.charAt(i)== str.charAt(j))
                count ++;

                }
            if(count == 1){
                    unique += str.charAt(i);
            }

        }

        return unique;
    }
}
