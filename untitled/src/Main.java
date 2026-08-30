import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main(String[] args) {
        int [] miArray = {70,12,19,45,11,33,26};
        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();

        System.out.println("Lineal: " + misAlgoritmos.linearSearch(miArray, 45));
        System.out.println("Ordenado por bubbleSort: " + java.util.Arrays.toString(misAlgoritmos.bubbleSort(miArray)));
        System.out.println("Binaria: " + misAlgoritmos.binarySearch(miArray, 70)); // miArray ya se ordenó arriba
        System.out.println("Ordenado por selectionSort: " + java.util.Arrays.toString(misAlgoritmos.selectionSort(miArray)));
        System.out.println("Ordenado por insertionSort: " + java.util.Arrays.toString(misAlgoritmos.insertionSort(miArray)));
        System.out.println("Ordenado por mergeSort: " + java.util.Arrays.toString(misAlgoritmos.mergeSort(miArray)));
        System.out.println("Ordenado por quickSort: " + java.util.Arrays.toString(misAlgoritmos.quickSort(miArray)));
    }
}