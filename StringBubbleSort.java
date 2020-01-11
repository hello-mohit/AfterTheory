package AfterTheory;
import java.util.Arrays;
public class StringBubbleSort {
    public void sort(String[] values) {
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values.length-1;j++){
                String temp=values[j];
                if(temp.compareTo(values[j+1])>0){
                    values[j]=values[j+1];
                    values[j+1]=temp;
                    temp=values[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(values));
    }
    public static void main(String[] args) {
        StringBubbleSort obj = new StringBubbleSort();
        obj.sort(new String[]{"c", "d", "b", "a","e","f"});
    }
}
