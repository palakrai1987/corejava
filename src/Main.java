public class Main {

    public static void main(String[] args) {
        String [] names = {"Greg", "Aleksandra", "Martha", "Oliwka"};

        String wynik = findLongestName(names);
        System.out.println( wynik);
    }

    public static String findLongestName(String [] names){
        int size = names.length;
        String longestName = names[0];

        for(int i = 0; i <= 3; i++){
            if(names[i].length() > longestName.length()){
            longestName = names[i];
        }}

        return longestName;
    }
}