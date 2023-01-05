import java.util.Scanner;

public class burcbulma {


    public static void main(String[] args) {
       int day;
       String month;
       Scanner input=new Scanner(System.in);
       System.out.print("Doğduğunuz ay: ");
       month= input.nextLine();
       System.out.print("Doğduğunuz gün: ");
       day= input.nextInt();

       if(((month.equals("mart"))&&(day>=21))||((month.equals("nisan"))&&(day<=20))){
           System.out.print("Burcunuz:Koç");}

        else if(((month.equals("nisan"))&&(day>=21))||((month.equals("mayıs"))&&(day<=21))){
            System.out.print("Burcunuz:Boğa");}

        else if(((month.equals("mayıs"))&&(day>=22))||((month.equals("haziran"))&&(day<=22))){
            System.out.print("Burcunuz:İkizler");}

        else if(((month.equals("haziran"))&&(day>=23))||((month.equals("temmuz"))&&(day<=22))){
            System.out.print("Burcunuz:Yengeç");}

        else if(((month.equals("temmuz"))&&(day>=23))||((month.equals("ağustos"))&&(day<=22))){
            System.out.print("Burcunuz:Aslan");}

       else  if(((month.equals("ağustos"))&&(day>=23))||((month.equals("eylül"))&&(day<=22))){
            System.out.print("Burcunuz:Başak");}

        else if(((month.equals("eylül"))&&(day>=23))||((month.equals("ekim"))&&(day<=22))){
            System.out.print("Burcunuz:Terazi");}

       else if(((month.equals("ekim"))&&(day>=23))||((month.equals("kasım"))&&(day<=21))){
            System.out.print("Burcunuz:Akrep");}

        else if(((month.equals("kasım"))&&(day>=22))||((month.equals("aralık"))&&(day<=21))){
            System.out.print("Burcunuz:Yay");}

        else if(((month.equals("aralık"))&&(day>=22))||((month.equals("ocak"))&&(day<=21))){
            System.out.print("Burcunuz:Oğlak");}

        else if(((month.equals("ocak"))&&(day>=22))||((month.equals("şubat"))&&(day<=19))){
            System.out.print("Burcunuz:Kova");}

        else{
            System.out.print("Burcunuz:Balık");
       }
       }


            }
















