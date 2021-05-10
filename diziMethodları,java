paket javaapplication12;

içe aktarma java.util.Arrays;

genel sınıf JavaApplication12 {

public static void main(String[] args) {
    int[] dizi={10,2,6,56,43,67};
    System.out.println(Arrays.toString(dizi));//dizi elamanlarını yazdırma
    System.out.println(Arrays.binarySearch(dizi, 67));//dizi içinde 67 elamanının kacıncı indexte old.arama.olmayan değerde -1 döner
    int[] copyOf=Arrays.copyOf(dizi,3);//copyOf methodu ile ilk 3 indexteki elamanı kopyladık
    System.out.println(Arrays.toString(copyOf));
    
     int[]copyOfRange= Arrays.copyOfRange(dizi, 0, 5);//0.indexten 5,indexe kadar yazdıracak
    System.out.println(Arrays.toString(copyOfRange));
    
    
    Arrays.sort(dizi);//dizi elamanlarını kucukten buyuge sıralayacak
    System.out.println(Arrays.toString(dizi));

    
    Arrays.fill(dizi,33);//dızı uzunlugu kadar 33 yazılacak
    System.out.println(Arrays.toString(dizi));

}
