package day14_doWhileLoop_Scope;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16, output: 4


        int input= 31;
        int karekok=1;
        boolean sonuc= false;


        while (karekok*karekok <= input){

            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else{
                karekok++;
            }
        }
        System.out.println(sonuc);


        // do while loop ile yapalim
        input=31;
        karekok=1;
        sonuc=false;


        do {
            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else{
                karekok++;
            }

        }while(karekok*karekok<=input);

        System.out.println(sonuc);

    }
}
