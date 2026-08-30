
public class MisAlgoritmos  implements Busquedas,Ordenamientos{

    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        for (int i=0;i< arrayPorExplorar.length;i++){
            if (arrayPorExplorar[i]==elementoABuscar){
                return i;
            }

        }
        return -1;
    }


    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
        int izq=0;
        int der=arrayPorExplorar.length-1;
        while ((izq)<=(der)){
            int mid = (izq+der)/2;
            if (arrayPorExplorar[mid]==elementoABuscar) {
                return mid;
            }
            if(arrayPorExplorar[mid]<elementoABuscar){
                izq=mid+1;

            }
            else{
                der=mid-1;
            }
        }
        return -1;




    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado){
        int n=arrayDesordenado.length;
        for (int i=0;i<=n-1;i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayDesordenado[j]>arrayDesordenado[j+1]) {
                    int temp = arrayDesordenado[j];
                    arrayDesordenado[j]=arrayDesordenado[j+1];
                    arrayDesordenado[j+1]=temp;
                }


            }
        return arrayDesordenado;


    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        int n = arrayDesordenado.length;
        for (int i = 0; i < n - 1; i++) {
            int skibidiminimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arrayDesordenado[j] < arrayDesordenado[skibidiminimo]) {
                    skibidiminimo = j;
                }
            }
            int skibiditemporalvar = arrayDesordenado[skibidiminimo];
            arrayDesordenado[skibidiminimo] = arrayDesordenado[i];
            arrayDesordenado[i] = skibiditemporalvar;
        }
        return arrayDesordenado;

    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        int n = arrayDesordenado.length;
        for (int i=1; i < n; i++){
            int key = arrayDesordenado[i];
            int j=i-1;

            while (j>=0 && arrayDesordenado[j] > key){
                arrayDesordenado[j+1] = arrayDesordenado[j];
                j--;
            }
            arrayDesordenado[j+1]= key;
        }
        return arrayDesordenado;
    }




    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}
