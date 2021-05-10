package com.hllbr.datacollectionv3_set

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Data Collection-Set = Birden fazla veribjesini bir arada tutabileceğim bir yapı Diziden çok farkı yok

        Set ws Dizi Farkları ==

        Set içerisinde bir eleman sadece bir adet bulunabilir.

         */

        println("------------Set------------")

        var myExampleArray = arrayOf(1,1,2,3,4,5)

        println("Dizi Boyutu : "+myExampleArray.size)

        println("0.İNDEX 1.ELEMAN : "+myExampleArray[0])

        println("1.INDEX 2.ELEMAN : "+myExampleArray[1])
        //iki elemanda Logout içerisinde görüntülenebilir.Çünkü bu elemanlar bir dizie içerisinde istediğim elemanı istedim adette ekleme şansına sahibim
        println("-------------------------------")
        println("first element :  myExampleArray[0]")//Stringtir içerideki kodu sistemimiz okumaz
        println("*******************************")
        println("first element : ${myExampleArray[0]} hllbr is connected")//içeride bulunan kodlar anlaşılacak ve çalıştırılacaktır artık
        println("*******************************")
        println("SECOND element : ${myExampleArray[1]} hllbr is connected")//içeride bulunan kodlar anlaşılacak ve çalıştırılacaktır artık
        //üst satırda yapmış olduğum işlemi dizilerde ve listelerde gerçekleştirebiliyorum fakat aynı elemandan birden fazla ekelem işlemi Set yapısı için geçerli olmuyor.

        //Setlerin Tanımlanması
         //Initialize && Defining operations
        var mySetArray = setOf<Int>(1,1,2,2,3,4,5,6,7)

        println("MySet Size : "+mySetArray.size)

        //For Each Loop ==
        println("**********************---------------------------")

        mySetArray.forEach { println(it) }//set içerisindeki herbir elemanı alan bir yapı aldığı elemanlarla ne yapılmasını istiyorsak bunları yapacak

        //it kelimesi herbir elemanı tanımlamak için kullandığımız Kotlinin sunduğu kolaylıklardan biri

        //kurmuş olduğum forEach yapısı içinde tüm elemanları sırası ile yazdırmak istediğimi ifade etmiş oldum

        //for each döngüsü içerisinde işlemlerde yapabilirim elde ettiğim varlıkları herhangi bir sayı ile çarpabilirim bölebilirim toplayabilirim kalan bulma.... gibi işlemleri yapabilrim yapabilceğim işlemler sadece bunlarla sınırlı değil bu listedeki elamanları başka bir class içerisinde gönderebilriim belki bir görünüme atayabilrim vb....

        println("**********************---------------------------")

        mySetArray.forEach { println(it * 3) }

        println("**********************---------------------------")

        mySetArray.forEach { println(it / 2) }

        println("**********************---------------------------")

        mySetArray.forEach { println(it + 58) }

        //Setler içinde sadece Int Double Float değil Aynı zamanda Char ve String ifadelerde bir kez bulunabilir.

        var myStringSet = setOf<String>("hl","hl","br","hllbr","rbllh")

        println("myStringSet size : ${myStringSet.size}")

        println("**********************---------------------------")

        myStringSet.forEach { println(it) }

    }
}