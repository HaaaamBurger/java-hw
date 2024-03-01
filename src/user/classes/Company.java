package user.classes;

import user.interfaces.ICompany;

public class Company implements ICompany {
    protected String name;
    protected String catchPhrase;
    protected String bs;
    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    @Override
    public String getValues() {
        return "Name: " + this.name + "Catch Phrase: " + this.catchPhrase + "Bs: " + this.bs;
    }
}

