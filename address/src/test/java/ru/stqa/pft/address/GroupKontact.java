package ru.stqa.pft.address;

public class GroupKontact {
    private final String firstnam;
    private final String middlenam;
    private final String lastnam;
    private final String addres;
    private final String telef;
    private final String mail;

    public GroupKontact(String middlenam, String firstnam, String lastnam, String addres, String telef, String mail) {
        this.firstnam = firstnam;
        this.middlenam = middlenam;
        this.lastnam = lastnam;
        this.addres = addres;
        this.telef = telef;
        this.mail = mail;
    }

    public String getFirstname() {
        return firstnam;
    }

    public String getMiddlename() {
        return middlenam;
    }

    public String getLastname() {
        return lastnam;
    }

    public String getAddress() {
        return addres;
    }

    public String getTelef() {
        return telef;
    }

    public String getMail() {
        return mail;
    }
}
