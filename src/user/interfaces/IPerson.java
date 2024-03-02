package user.interfaces;

public interface IPerson {
    int id = 0;
    String name = "Unknown";
    String username = "Unknown";
    String email = "unknown@gmail.com";
    String phone = "+x xxx xxx xxxx";
    String website = "www.unknown.com";

    String getValues();
}
