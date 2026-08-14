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
        while (izq<=der){
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
    public int[] bubbleSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        return new int[0];
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
