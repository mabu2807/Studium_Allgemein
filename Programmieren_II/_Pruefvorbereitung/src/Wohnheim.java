public class Wohnheim {

    private String Straße;
    private byte Hausnummer;
    private String Adresszusatz;
    private byte Stockwerke;
    private byte WohnungJeStockwerke;
    private Wohnung[][] Wohnheim;

    public Wohnheim(String pstraße, byte phausnummer, String padresszusatz, byte pstockwerke, byte pwohnungJeStockwerke) {
        Straße = pstraße;
        Hausnummer = phausnummer;
        Adresszusatz = padresszusatz;
        Stockwerke = pstockwerke;
        WohnungJeStockwerke = pwohnungJeStockwerke;
        initWohnheim(pstockwerke,pwohnungJeStockwerke);

    }

    public String getStraße() {
        return Straße;
    }

    public void setStraße(String straße) {
        Straße = straße;
    }

    public byte gethausnummer() {
        return Hausnummer;
    }

    public void setHausnummer(byte hausnummer) {
        Hausnummer = hausnummer;
    }

    public String getAdresszusatz() {
        return Adresszusatz;
    }

    public void setAdresszusatz(String adresszusatz) {
        Adresszusatz = adresszusatz;
    }

    public byte getStockwerke() {
        return Stockwerke;
    }

    public void setStockwerke(byte stockwerke) {
        Stockwerke = stockwerke;
    }

    public byte getWohnungJeStockwerke() {
        return WohnungJeStockwerke;
    }

    public void setWohnungJeStockwerke(byte wohnungJeStockwerke) {
        WohnungJeStockwerke = wohnungJeStockwerke;
    }
    private void initWohnheim(int pStockwerk, int pWohnungJeStockwerk){
        Wohnheim = new Wohnung[pStockwerk][pWohnungJeStockwerk];
        for (int i = 0; i < pStockwerk; i++){
            for (int j = 1; i <= pWohnungJeStockwerk;i++){
                Wohnheim[i][j] =  new Wohnung();
            }
        }
    }

}
