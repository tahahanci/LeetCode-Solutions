package hncdev.strings;

public class DefangingIP {

    public String defangIpaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        DefangingIP defangingIP = new DefangingIP();
        String myIP = "1.1.1.1";
        myIP = defangingIP.defangIpaddr(myIP);
        System.out.println(myIP);
    }
}
