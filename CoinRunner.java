class CoinRunner {
    public static void main(String[] args) {
        Coin coin1  = new Coin(); coin1.coinId = 1;   coin1.value = 1.0;   coin1.currency = "Rupee";  coin1.year = 2000; coin1.country = "India";  coin1.material = "Steel";   coin1.shape = "Round";
        Coin coin2  = new Coin(); coin2.coinId = 2;   coin2.value = 2.0;   coin2.currency = "Rupee";  coin2.year = 2005; coin2.country = "India";  coin2.material = "Copper";  coin2.shape = "Hexagon";
        Coin coin3  = new Coin(); coin3.coinId = 3;   coin3.value = 0.5;   coin3.currency = "Rupee";  coin3.year = 1998; coin3.country = "India";  coin3.material = "Nickel";  coin3.shape = "Round";
        Coin coin4  = new Coin(); coin4.coinId = 4;   coin4.value = 5.0;   coin4.currency = "Rupee";  coin4.year = 2010; coin4.country = "India";  coin4.material = "Steel";   coin4.shape = "Round";
        Coin coin5  = new Coin(); coin5.coinId = 5;   coin5.value = 10.0;  coin5.currency = "Rupee";  coin5.year = 2020; coin5.country = "India";  coin5.material = "Bimetal"; coin5.shape = "Round";
        Coin coin6  = new Coin(); coin6.coinId = 6;   coin6.value = 0.25;  coin6.currency = "Dollar"; coin6.year = 1995; coin6.country = "USA";    coin6.material = "Nickel";  coin6.shape = "Round";
        Coin coin7  = new Coin(); coin7.coinId = 7;   coin7.value = 0.10;  coin7.currency = "Dollar"; coin7.year = 1980; coin7.country = "USA";    coin7.material = "Copper";  coin7.shape = "Round";
        Coin coin8  = new Coin(); coin8.coinId = 8;   coin8.value = 2.0;   coin8.currency = "Euro";   coin8.year = 2015; coin8.country = "Germany"; coin8.material = "Steel";   coin8.shape = "Round";
        Coin coin9  = new Coin(); coin9.coinId = 9;   coin9.value = 1.0;   coin9.currency = "Euro";   coin9.year = 2017; coin9.country = "France";  coin9.material = "Nickel";  coin9.shape = "Round";
        Coin coin10 = new Coin(); coin10.coinId = 10; coin10.value = 0.50; coin10.currency = "Euro"; coin10.year = 2012; coin10.country = "Italy";  coin10.material = "Brass";   coin10.shape = "Round";

        Coin coin11 = new Coin(); coin11.coinId = 111; coin11.year = 1995; coin11.material = "Bronze";      coin11.denomination = "1 Rupee";   coin11.country = "India";   coin11.weight = 4.8;
        Coin coin12 = new Coin(); coin12.coinId = 112; coin12.year = 2000; coin12.material = "Nickel";      coin12.denomination = "5 Cents";   coin12.country = "USA";     coin12.weight = 5.0;
        Coin coin13 = new Coin(); coin13.coinId = 113; coin13.year = 1987; coin13.material = "Copper";      coin13.denomination = "2 Paisa";   coin13.country = "India";   coin13.weight = 2.5;
        Coin coin14 = new Coin(); coin14.coinId = 114; coin14.year = 2010; coin14.material = "Steel";       coin14.denomination = "10 Yen";    coin14.country = "Japan";   coin14.weight = 4.5;
        Coin coin15 = new Coin(); coin15.coinId = 115; coin15.year = 1978; coin15.material = "Aluminum";    coin15.denomination = "25 Paise";  coin15.country = "India";   coin15.weight = 2.3;
        Coin coin16 = new Coin(); coin16.coinId = 116; coin16.year = 1990; coin16.material = "Silver";      coin16.denomination = "1 Dollar";  coin16.country = "Canada";  coin16.weight = 7.2;
        Coin coin17 = new Coin(); coin17.coinId = 117; coin17.year = 2021; coin17.material = "Zinc";        coin17.denomination = "1 Peso";    coin17.country = "Mexico";  coin17.weight = 3.7;
        Coin coin18 = new Coin(); coin18.coinId = 118; coin18.year = 2005; coin18.material = "Brass";       coin18.denomination = "2 Euros";   coin18.country = "Germany"; coin18.weight = 8.5;
        Coin coin19 = new Coin(); coin19.coinId = 119; coin19.year = 1965; coin19.material = "Gold";        coin19.denomination = "10 Francs"; coin19.country = "France";  coin19.weight = 9.0;
        Coin coin20 = new Coin(); coin20.coinId = 120; coin20.year = 1983; coin20.material = "Tin";         coin20.denomination = "50 Lira";   coin20.country = "Italy";   coin20.weight = 6.6;

        coin1.getCoinInfo();  coin2.getCoinInfo();  coin3.getCoinInfo();  coin4.getCoinInfo();  coin5.getCoinInfo();
        coin6.getCoinInfo();  coin7.getCoinInfo();  coin8.getCoinInfo();  coin9.getCoinInfo();  coin10.getCoinInfo();
        coin11.getCoinInfo(); coin12.getCoinInfo(); coin13.getCoinInfo(); coin14.getCoinInfo(); coin15.getCoinInfo();
        coin16.getCoinInfo(); coin17.getCoinInfo(); coin18.getCoinInfo(); coin19.getCoinInfo(); coin20.getCoinInfo();
    }
}
