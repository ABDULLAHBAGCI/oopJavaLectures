package week5;
import java.util.ArrayList; // import the ArrayList class

public class arrayListEx {
    public static void main(String[] args) {
        /*
        String[] isimler={"abdullah","ahmet","burhan","yusuf"};

        for(int i=0; i< isimler.length;i++){
            System.out.println(isimler[i]);
        }*/

        /*Arraylist nasıl tanımlanız?*/
        ArrayList<String> cars = new ArrayList<String>();  // Create an ArrayList object
        /*Listeye eleman ekleme nasıl yapılır?*/
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Tesla");
        cars.add("Mercedes");


        /* Listedeki herhangi bir indeksdeki yapıyı okumak için*/
        cars.get(3);

        /*Listede herhangi bir indeksdeki veriyi değiştirmek istersek*/
        cars.set(3,"Porsche");

        /* remove yaparken ya index adresi ile ya da objenin ismi ile
        doğrudan veriyi listeden silebilirsiniz*/
        cars.remove("Tesla");

        /*Listede spesifik olarak eleman aramak istersek*/
        cars.contains("Volvo");

        /*listenin bütün elemanlarını yazdırmak istersek*/
        //for ile
        for(int k=0; k<cars.size();k++){
            System.out.println(cars.get(k));
        }
        //for-each ile
        for (String i : cars) {
            System.out.println(i); }

        /*Diyelim ki listedeki bütün verileri silmek istiyoruz*/
        cars.clear();

        // Listenin içinde kaç tane eleman olduğunu öğrenmek istersek
        cars.size();


    }
}
