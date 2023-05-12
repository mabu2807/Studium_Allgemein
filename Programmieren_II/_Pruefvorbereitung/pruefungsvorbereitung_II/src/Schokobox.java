
public class Schokobox {
    private int tafeln = 5;
    public void essen(int tafeln) throws SchokoLeer{
        if(tafeln <= this.tafeln){
            this.tafeln -= tafeln;
            System.out.println("Es sind noch " + this.tafeln +
                    " Tafeln in der Box.");
        }else{
            throw new SchokoLeer(this.tafeln, tafeln);
        }
    }
    public static void main (String[] args){
        System.out.println("Klausuranfang!");
        Schokobox Klausurnervennahrung = new Schokobox();
        System.out.println("Jetzt erst mal was essen...");
        try {
            Klausurnervennahrung.essen(2);
            System.out.println("Solange Schokolade da ist, ist die Klausur leicht!");
            Klausurnervennahrung.essen(1);
            Klausurnervennahrung.essen(3);
            System.out.println("Puh... ist Java kompliziert!");
            Klausurnervennahrung.essen(4);
        } catch (SchokoLeer e) {
            System.out.println(e.getMessage());
            System.out.println("Geh Schokolade kaufen!");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Ohne Schokolade kann man nicht arbeiten!");
        }
        System.out.println("Klausurende!");
    }
}
