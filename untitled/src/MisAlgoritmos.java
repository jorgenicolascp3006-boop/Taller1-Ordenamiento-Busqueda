
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
        if (arrayDesordenado == null || arrayDesordenado.length <= 1) {
            return arrayDesordenado;
        }

        int medio = arrayDesordenado.length / 2;

        int[] izquierda = new int[medio];
        int[] derecha = new int[arrayDesordenado.length - medio];

        System.arraycopy(arrayDesordenado, 0, izquierda, 0, medio);
        System.arraycopy(arrayDesordenado, medio, derecha, 0, arrayDesordenado.length - medio);

        int[] izquierdaOrdenada = mergeSort(izquierda);
        int[] derechaOrdenada = mergeSort(derecha);

        return merge(izquierdaOrdenada, derechaOrdenada);
    }

    private int[] merge(int[] izquierda, int[] derecha) {
        int[] resultado = new int[izquierda.length + derecha.length];
        int i = 0, j = 0, k = 0;

        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                resultado[k++] = izquierda[i++];
            } else {
                resultado[k++] = derecha[j++];
            }
        }
        while (i < izquierda.length) {
            resultado[k++] = izquierda[i++];
        }

        while (j < derecha.length) {
            resultado[k++] = derecha[j++];
        }
        return resultado;
    }



    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        if (arrayDesordenado == null || arrayDesordenado.length <= 1) {
            return arrayDesordenado;
        }

        int pivote = arrayDesordenado[arrayDesordenado.length - 1];

        int menores = 0;
        int mayores = 0;
        for (int i = 0; i < arrayDesordenado.length - 1; i++) {
            if (arrayDesordenado[i] <= pivote) {
                menores++;
            } else {
                mayores++;
            }
        }
        int[] menor = new int[menores];
        int[] mayor = new int[mayores];

        int iMenores = 0;
        int iMayores = 0;

        for (int i = 0; i < arrayDesordenado.length - 1; i++) {
            if (arrayDesordenado[i] <= pivote) {
                menor[iMenores++] = arrayDesordenado[i];
            } else {
                mayor[iMayores++] = arrayDesordenado[i];
            }
        }

        int[] menoresOrdenados = quickSort(menor);
        int[] mayoresOrdenados = quickSort(mayor);

        int[] resultado = new int[arrayDesordenado.length];

        System.arraycopy(menoresOrdenados, 0, resultado, 0, menoresOrdenados.length);
        resultado[menoresOrdenados.length] = pivote;
        System.arraycopy(mayoresOrdenados, 0, resultado, menoresOrdenados.length + 1, mayoresOrdenados.length);

        return resultado;

    }
}

