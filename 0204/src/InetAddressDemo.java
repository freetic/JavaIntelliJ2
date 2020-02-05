import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
//            InetAddress ia = InetAddress.getByName("DESKTOP-COJ9858");
            InetAddress[] array = InetAddress.getAllByName("DESKTOP-DFRJ86B");
            for(InetAddress ia : array){
                System.out.println(ia.toString());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
