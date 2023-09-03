![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.001.png "aa")

![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.002.png "aaa")

Spring security default 

username:user

password:![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.003.png "A")

Bunu değiştirmek için app.properties:

spring.security.user.name=sinan

spring.security.user.password=test123

Erişim kısıtlamak için syntax olarak requestMatchers kullanırız.

![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.004.png "aa")

Role göre işlem tablosu(ADMIN>MANAGER>EMPLOYEE)

![C:\Users\sinan\AppData\Local\Microsoft\Windows\INetCache\Content.Word\aa.png](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.005.png)

![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.006.png "aa")

/\*\* ==> GET işlemi yapan EMPLOYEE rölündeki kullanıcı “/api/employees” altındakileri sayfaları görebilir.Yani employees ‘ a girdikten sonra id’ye göre çağırma yapabilir.

![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.007.png "aa")

![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.008.png "aa")






![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.009.png "AA")

CSRF(Cross Site Request Forgery) ya da XSRF : İnternet sitelerini hedef alan kötü niyetli bir Exploit(açıklar) türüdür.

Türkçesiyle "Site-Arası İstek Sahteciliği" anlamına gelir. İsminden de anlaşılabileceği gibi, bir sitenin isteklerini sahteleyerek yani taklit ederek, bir kullanıcının adına işlem yapmayı hedefler.

Daha basit bir anlatımla, sizin bilgisayarınızda oturum açıkken bir başkası sizin adınıza işlem yapmayı deneyebilir. Bu durumu daha iyi anlatabilmek için bir örnek üzerinden gidelim:

Diyelim ki bir sosyal medya platformunda oturum açtınız ve oturumunuzu kapatmadan başka bir web sitesine gittiniz. Bu yeni web sitesi kötü niyetli bir site olsun ve sizin adınıza oturum açık olan sosyal medya sitesine istek gönderip mesaj yayınlamayı hedeflesin.

Eğer sosyal medya sitesi CSRF saldırılarına karşı koruma sağlamazsa, kötü niyetli site sizin adınıza mesaj yayınlayabilir. Çünkü tarayıcınız hala sosyal medya sitesine oturum açmış olarak görünüyor ve dolayısıyla sizin adınıza işlem yapılabilir.

Ancak sosyal medya sitesi CSRF saldırılarına karşı koruma sağlıyorsa, her bir form gönderimi veya API isteği ile birlikte unique bir "token" gönderir. Bu token, bir nevi işlem yapma yetkisinin sizde olduğunu kanıtlar. Sosyal medya sitesi, gelen her istekte bu tokeni kontrol eder ve eğer token doğruysa işlemi gerçekleştirir. Kötü niyetli site, bu tokeni tahmin edemez veya elde edemez, dolayısıyla sizin adınıza işlem yapamaz. Bu şekilde CSRF saldırıları önlenebilir.

Proje canlıya alınmıyacaksa CSRF kullanma ama Projen canlıda çalışacak ise Spring ekibi CSRF’yi kullanmayı önerir.

![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.010.png "a")

UserDetailsManager veritabanındaki bilgilelerle oturum açmak için kullanılır.

{noop}password: burdaki noop encrtpyio edilmemiş şekilde tutar.

![](Aspose.Words.b10ba1c3-9945-46eb-a16b-f61f8e5d90e7.011.png "aa")

Bcrypt şifreleme kullanarak test123 şifresini şekildeki gibi tutar.(Hashing)

Password veritabanında 68 karekter olarak tanımlanmalıdır.(Bcrypt kullandığımız için)


