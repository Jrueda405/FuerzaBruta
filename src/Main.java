import java.util.ArrayList;
import java.util.Date;

public class Main {

    //public String str = new String();
    public static String cancion = "hola";

    public static void main(String[] args) {

        String attempt = new String();
        Date start = new Date();
        FuerzaBruta in=new FuerzaBruta();

        while (true)
        {
            if (attempt.equals(cancion))
            {
                Date end = new Date();
                System.out.println("Cancionsita: " + attempt + "\nTiempo que se tomo: " + ((end.getTime() - start.getTime()) / 1000) + " seconds." + "\n");
                break;
            }
            attempt = in.toString();
            System.out.println("Msg-> " + attempt);
            in.siguiente();
        }

        /**/
        //in.generate(in.abecedario);

    }
}