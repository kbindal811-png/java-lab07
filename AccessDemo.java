// File name: AccessDemo.java
package demo;

public class AccessDemo {
    public String publicText = "public member";
    protected String protectedText = "protected member";
    String defaultText = "default/package-private member";
    private String privateText = "private member";

    public void showInsideClass() {
        System.out.println(publicText);
        System.out.println(protectedText);
        System.out.println(defaultText);
        System.out.println(privateText);
    }
}
