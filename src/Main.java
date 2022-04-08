public class Main {
    public static void main(String[] args) {
        double longitud;
        int arreglo[] ={1,3,8,6,7,4,2,5};
        longitud=arreglo.length;
        boolean cambio=false;
        for(double intervalo=longitud/2;intervalo>0;intervalo=Math.floor(intervalo/2)){
            System.out.println(intervalo);
            do {
                cambio=false;
                for (double i=0;i+intervalo<longitud;i++){
                    int numeroUno=arreglo[(int)i];
                    int numeroDos=arreglo[(int)(i+intervalo)];
                    if(numeroDos<numeroUno){
                        arreglo[(int)i]=numeroDos;
                        arreglo[(int)(i+intervalo)]=numeroUno;
                        cambio=true;
                    }//if del intercambio
                }//for del intervalo
            }while (cambio);

            cambio=false;
            for (int x=0;x<arreglo.length;x++){
                System.out.print(arreglo[x]+" ");
            }//for imprimir
            System.out.println();
        }//primer for
    }//psvm
}//main
