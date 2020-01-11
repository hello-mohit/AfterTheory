package AfterTheory;

import java.util.Arrays;

public class SortAlphabaticaly {
    public void sortStrings(String[] stringsToSortArray) {
         for(int i=1;i<stringsToSortArray.length;i++){
             String temp=stringsToSortArray[i];
             for(int j=i-1;j>=0;j--){
              if(temp.compareTo(stringsToSortArray[j])<0){
                  stringsToSortArray[j+1]=stringsToSortArray[j];
                  stringsToSortArray[j]=temp;
              }
             }
         }
        System.out.println(Arrays.toString(stringsToSortArray));
    }

    public static void main(String[] args) {
        SortAlphabaticaly obj = new SortAlphabaticaly();
        obj.sortStrings(new String[]{"Mohit", "Rohit", "Sharma", "pawan", "1234"});
    }
}
