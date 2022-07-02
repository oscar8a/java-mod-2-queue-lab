public class Party {
    String partyName;
    int guests;

    public Party() {
        this.partyName = "Empty";
        this.guests = 0;
    }

    public Party(String partyName, int guests) {
        this.partyName = partyName;
        this.guests = guests;
    }

    public String getPartyName() {
        return partyName;
    }

    public int getGuests() {
        return guests;
    }

    

}
