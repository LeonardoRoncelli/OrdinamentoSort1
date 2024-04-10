public class Main {
    public static void main(String[] args) {
        int [] numeri={3,6,2,8,7,8};
        int dim= numeri.length;
        int posMin=numeri[0];
        int temp;
        for (int i=0;i<dim-1;i++){
            posMin=i;
            for(int j=i+1;j<dim;j++){
                if (numeri[j]<numeri[posMin]){
                    posMin=j;
                    temp=numeri[i];
                    numeri[i]=numeri[posMin];
                    numeri[posMin]=temp;
                }
            }
        }
        System.out.println("Numeri ordinati in ordine crescente");
        for (int i=0;i< numeri.length;i++){
            System.out.println(numeri[i]);
        }
        for (int i=0;i<dim/2;i++){
            temp=numeri[i];
            numeri[i]=numeri[dim-1-i];
            numeri[dim-1-i]=temp;
        }
        System.out.println("Numeri ordinati in ordine crescente");
        for (int i=0;i< numeri.length;i++){
            System.out.println(numeri[i]);
        }
    }
}