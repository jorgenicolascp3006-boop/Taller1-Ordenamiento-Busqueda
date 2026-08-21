import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int [] skibidiArray = {70,12,19,45,11,33,26};
        //int [] skibidiArray = {11,12,19,26,33,45,70};
        MisAlgoritmos misalgoritmos = new MisAlgoritmos();

        //System.out.println(Arrays.toString(misalgoritmos.selectionSort(skibidiArray)));
        System.out.println(Arrays.toString(misalgoritmos.selectionSort(skibidiArray)));

    }

}