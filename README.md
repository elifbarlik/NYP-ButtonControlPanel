Buton kontrol paneli uygulaması, Java swing kütüphanesi ile 4*4 butonla tasarlanan ekranı içermektedir. Uygulama butonun durumunu güncelleyen bir GrapQL sunucusu ile çalışır.

Uygulama Yapısı: 
Uygulama, Main sınıfı ve Buton Özellikleri sınıflarından ve GrapQl şemasından oluşmaktadır.
Buton Özellikleri; butonun aktif renk, pasif renk, aktif simge, pasif simge, GrapQL şemasının adresini tutan değişken ve o anki aktif butonu tutan değişkenleri içerir. Butonun pasif ve aktif durumları için ve butonun çalışma anı için metotlar tanımlanmıştır. Aynı zamanda, sahte bir GraphQL mutasyonunu simüle eden bir iç içe Mutation sınıfını içerir.
Main sınıfı ise; Buton Özellikler sınıfını kullanarak 4*4 butonları oluşturur. Her buton, aktif ve pasif renkler, simgeler ve bir GraphQL şema adresi ile başlatılır. Main sınıfı, kullanıcı arayüzünü kurar ve pencereyi görüntüler.
GrapQL Şeması; Butonların özelliklerini ve butona ait bir mutasyonu tanımlar. Mutasyon butona tıklayışta metin ekler.

Çalıştırma:
Java dosyası derlenir ve uygulama çalıştırılır. 4*4lük butonları içeren uygulama penceresi açılır.

Test: 
Herhangi bir butona tıklandığında renginin değiştiği ve “Tiklandi” metninin yazıldığı görülebilir. 2. Bir butona basıldığında butonun aktif rengine döndüğü önceki butonun ise pasif rengini aldığı görülecektir.
