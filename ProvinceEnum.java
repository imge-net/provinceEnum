package enumerate;

public enum ProvinceEnum {
    P01("Adana"),
    P02("Adıyaman"),
    P03("Afyon"),
    P04("Ağrı"),
    P05("Amasya"),
    P06("Ankara"),
    P07("Antalya"),
    P08("Artvin"),
    P09("Aydın"),
    P10("Balıkesir"),
    P11("Bilecik"),
    P12("Bingöl"),
    P13("Bitlis"),
    P14("Bolu"),
    P15("Burdur"),
    P16("Bursa"),
    P17("Çanakkale"),
    P18("Çankırı"),
    P19("Çorum"),
    P20("Denizli"),
    P21("Diyarbakır"),
    P22("Edirne"),
    P23("Elazığ"),
    P24("Erzincan"),
    P25("Erzurum"),
    P26("Eskişehir"),
    P27("Gaziantep"),
    P28("Giresun"),
    P29("Gümüşhane"),
    P30("Hakkari"),
    P31("Hatay"),
    P32("Isparta"),
    P33("İçel"),
    P34("İstanbul"),
    P35("İzmir"),
    P36("Kars"),
    P37("Kastamonu"),
    P38("Kayseri"),
    P39("Kırklareli"),
    P40("Kırşehir"),
    P41("Kocaeli"),
    P42("Konya"),
    P43("Kütahya"),
    P44("Malatya"),
    P45("Manisa"),
    P46("Kahramanmaraş"),
    P47("Mardin"),
    P48("Muğla"),
    P49("Muş"),
    P50("Nevşehir"),
    P51("Niğde"),
    P52("Ordu"),
    P53("Rize"),
    P54("Sakarya"),
    P55("Samsun"),
    P56("Siirt"),
    P57("Sinop"),
    P58("Sivas"),
    P59("Tekirdağ"),
    P60("Tokat"),
    P61("Trabzon"),
    P62("Tunceli"),
    P63("Şanlıurfa"),
    P64("Uşak"),
    P65("Van"),
    P66("Yozgat"),
    P67("Zonguldak"),
    P68("Aksaray"),
    P69("Bayburt"),
    P70("Karaman"),
    P71("Kırıkkale"),
    P72("Batman"),
    P73("Şırnak"),
    P74("Bartın"),
    P75("Ardahan"),
    P76("Iğdır"),
    P77("Yalova"),
    P78("Karabük"),
    P79("Kilis"),
    P80("Osmaniye"),
    P81("Düzce");

    private String name;

    ProvinceEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
