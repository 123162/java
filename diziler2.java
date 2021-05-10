paket cokboyutludizi;

içe aktarma java.util.Arrays;

public class CokBoyutluDizi {

public static void main(String[] args) {
   /* int[][] numbers=new int[2][3];//2 satır 3 sutundan olusan bır dızı olusacak.
    numbers[0][0]=2;
    numbers[0][1]=4;
    numbers[0][2]=5;
    //System.out.println(Arrays.toString(numbers));//cok boyutlu dızılerde bu ıse yaramaz.
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            System.out.println(numbers[i][j]);
            
        }
    }*/
   String[][] ogrenciler=new String[3][3];
   ogrenciler[0][0]="ali";
   ogrenciler[0][1]="veli";
   ogrenciler[0][2]="can";
   
   ogrenciler[1][0]="hasan";
   ogrenciler[1][1]="yusuf";
   ogrenciler[1][2]="mert";
   
   ogrenciler[2][0]="ahmet";
   ogrenciler[2][1]="zeynep";
   ogrenciler[2][2]="gül";
   
    for(int i=0;i<ogrenciler.length;i++){//ogrencıler dızısının boyutu kadra donme olucak
        for(int j=0;j<ogrenciler[i].length;j++){
            System.out.println(i+" "+j+":");//index degerleri ıle
            System.out.println(ogrenciler[i][j]);
        }
    }
           
    
}
}
