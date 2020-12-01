package Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        //binarySearch Method
        int[] ages={18,19,20,21,22,23,24,25,26};
        //lets search for age 21
        int num=21;
        int result= java.util.Arrays.binarySearch(ages,0,8,num);
        if(result>=0){
            System.out.println("index de "+num+" est :"+result);
        }else {
            System.out.println("le nombre "+num+" n'existe pas dans la liste");
        }
        //equals Method
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        boolean isEqual= java.util.Arrays.equals(arr1,arr2);
        System.out.println(isEqual);
        if(isEqual){
            System.out.println("arr1 et arr2 sont egaux.");
        }else {
            System.out.println("arr1 et arr2 sont deffirent.");
        }
        //fill Method
        int[] arr3=new int[10];
        java.util.Arrays.fill(arr3,1);
        System.out.println("chaque valeur de arr3 va etre egal a 1 \n"+ java.util.Arrays.toString(arr3));
        java.util.Arrays.fill(arr3,5,10,2);
        System.out.println("chaque valeur de arr3 a partir de index 5 a 10 va etre egal a 1 \n"+ java.util.Arrays.toString(arr3));
        //parrallelSort Method
        int[] nombresDe1A10={3,8,9,4,10,1,5,2,7,6};
        System.out.println("le tableau nombreDe1A10 avant sort :"+ java.util.Arrays.toString(nombresDe1A10));
        java.util.Arrays.parallelSort(nombresDe1A10);
        System.out.println("le tableau nombreDe1A10 apres sort :"+ java.util.Arrays.toString(nombresDe1A10));

        //arraycopy Method
        int[] nombres=new int[nombresDe1A10.length];
        System.arraycopy(nombresDe1A10,0,nombres,0,10);
        System.out.println(java.util.Arrays.toString(nombres));
    }
}
