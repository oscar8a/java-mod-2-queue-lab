class Table {
    boolean isEmpty;
    Party party;

    Table(){
        isEmpty = true;
        party = new Party();
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
}