package pkg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.ThreadContext;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    private static final Marker Kerdes_marker = MarkerManager.getMarker("kerdes");
    private static final Marker Allapot_marker = MarkerManager.getMarker("allapot");

    public static void main(String[] args) throws InterruptedException {
        int it = Integer.parseInt(args[0]);
        for(int i = 1; i <= it; i++) {

            ThreadContext.put("it", String.valueOf(i));

            logger.fatal(Allapot_marker, "Itt a húsvét, eljött végre,");
            logger.error(Allapot_marker, "A szép lányok örömére.");
            logger.warn(Allapot_marker, "Mert a lányok szép virágok,");
            logger.info(Allapot_marker, "Illatos víz illik rájok.");
            logger.fatal(Allapot_marker, "Kit húsvétkor nem locsolnak,");
            logger.error(Allapot_marker, "Hervadt virág lesz már holnap.");
            logger.warn("Ne fuss el hát, szép virágom,");
            logger.info(Allapot_marker, "Locsolásért puszid várom!");
            logger.info(Kerdes_marker, "Szabad-e locsolni?");

            Thread.sleep(5000);
            ThreadContext.clearMap();
        }

    }

}
