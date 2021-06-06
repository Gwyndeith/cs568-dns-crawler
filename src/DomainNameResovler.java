import javafx.util.Pair;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.net.UnknownHostException;

public class DomainNameResovler {

    public static void main(String[] args) throws UnknownHostException {
        ArrayList<Pair<String, String>> domainNameIPPairs = new ArrayList<>();
        InetAddress netflixDomainNameExample = java.net.InetAddress.getByName("ipv4-c051-fra002-ix.1.oca.nflxvideo.net");
        InetAddress netflixDomainNameExample2 = java.net.InetAddress.getByName("ipv4-c006-pmo001-tis-isp.1.oca.nflxvideo.net");
        InetAddress netflixDomainNameExample3 = java.net.InetAddress.getByName("ipv4-c112-cdg001-ix.1.oca.nflxvideo.net");
        InetAddress netflixDomainNameExample4 = java.net.InetAddress.getByName("ipv4-c003-pmo001-tis-isp.1.oca.nflxvideo.net");
        System.out.println(netflixDomainNameExample.getHostAddress());
        System.out.println(netflixDomainNameExample2.getHostAddress());
        System.out.println(netflixDomainNameExample3.getHostAddress());
        System.out.println(netflixDomainNameExample4.getHostAddress());

        ArrayList<String> listOfIATACodes = new ArrayList<>();
        ArrayList<String> listOfPossibleISPAbbr = new ArrayList<>();

//        findCanadianDomains(domainNameIPPairs);

        // Germany Airport Codes
        listOfIATACodes.add("fra");
        listOfIATACodes.add("txl");
        listOfIATACodes.add("muc");
        listOfIATACodes.add("dus");
        listOfIATACodes.add("ham");
        listOfIATACodes.add("str");
        listOfIATACodes.add("cgn");
        listOfIATACodes.add("sxf");
        listOfIATACodes.add("bsl");
        listOfIATACodes.add("haj");
        listOfIATACodes.add("nue");
        listOfIATACodes.add("hhn");
        listOfIATACodes.add("bre");
        listOfIATACodes.add("lej");
        listOfIATACodes.add("dtm");
        listOfIATACodes.add("nrn");
        listOfIATACodes.add("drs");
        listOfIATACodes.add("fkb");
        listOfIATACodes.add("fmm");
        listOfIATACodes.add("fmo");
        listOfIATACodes.add("pad");
        listOfIATACodes.add("fdh");
        listOfIATACodes.add("scn");
        listOfIATACodes.add("erf");
        listOfIATACodes.add("rlg");
        // Turkish Airport Codes
//        listOfIATACodes.add("ist");
//        listOfIATACodes.add("saw");
//        listOfIATACodes.add("ayt");
//        listOfIATACodes.add("esb");
//        listOfIATACodes.add("adb");
//        listOfIATACodes.add("ada");
//        listOfIATACodes.add("dlm");
//        listOfIATACodes.add("bjv");
//        listOfIATACodes.add("tzx");
//        listOfIATACodes.add("gzt");
//        listOfIATACodes.add("asr");
//        listOfIATACodes.add("szf");
//        listOfIATACodes.add("van");
//        listOfIATACodes.add("hty");
//        listOfIATACodes.add("gzp");
//        listOfIATACodes.add("mlx");
//        listOfIATACodes.add("kzr");
//        listOfIATACodes.add("yei");
//        listOfIATACodes.add("aoe");

        // Turkish ISP abbreviations
//        listOfPossibleISPAbbr.add("turktelekom");
//        listOfPossibleISPAbbr.add("turktelekom-isp");
//        listOfPossibleISPAbbr.add("ttk");
//        listOfPossibleISPAbbr.add("ttk-isp");
//        listOfPossibleISPAbbr.add("turktelecom");
//        listOfPossibleISPAbbr.add("turktelecom-isp");
//        listOfPossibleISPAbbr.add("turkcell");
//        listOfPossibleISPAbbr.add("turkcell-isp");
//        listOfPossibleISPAbbr.add("turkcelltr");
//        listOfPossibleISPAbbr.add("turkcelltr-isp");
//        listOfPossibleISPAbbr.add("superonline");
//        listOfPossibleISPAbbr.add("superonline-isp");
//        listOfPossibleISPAbbr.add("superonlinetr");
//        listOfPossibleISPAbbr.add("superonlinetr-isp");
//        listOfPossibleISPAbbr.add("turkcellsuperonline");
//        listOfPossibleISPAbbr.add("turkcellsuperonline-isp");
//        listOfPossibleISPAbbr.add("turkcellsuperonlinetr");
//        listOfPossibleISPAbbr.add("turkcellsuperonlinetr-isp");
//        listOfPossibleISPAbbr.add("turksat");
//        listOfPossibleISPAbbr.add("turksattr");
//        listOfPossibleISPAbbr.add("turksat-isp");
//        listOfPossibleISPAbbr.add("turksattr-isp");
//        listOfPossibleISPAbbr.add("turksatkablo");
//        listOfPossibleISPAbbr.add("turksatkablo-isp");
//        listOfPossibleISPAbbr.add("turksatkablotr");
//        listOfPossibleISPAbbr.add("turksatkablotr-isp");
//        listOfPossibleISPAbbr.add("turknet");
//        listOfPossibleISPAbbr.add("turknettr");
//        listOfPossibleISPAbbr.add("turknet-isp");
//        listOfPossibleISPAbbr.add("turknettr-isp");
//        listOfPossibleISPAbbr.add("vodafonetr");
//        listOfPossibleISPAbbr.add("vodafonetr-isp");
//        listOfPossibleISPAbbr.add("d-smart");
//        listOfPossibleISPAbbr.add("d-smarttr");
//        listOfPossibleISPAbbr.add("d-smart-isp");
//        listOfPossibleISPAbbr.add("d-smarttr-isp");

        // Foreign IXP/ISP Abbreviations
        listOfPossibleISPAbbr.add("ix");
        listOfPossibleISPAbbr.add("ix-ixp");
        listOfPossibleISPAbbr.add("akl-ix");
        listOfPossibleISPAbbr.add("ams-ix");
        listOfPossibleISPAbbr.add("ams-ix-ixp");
        listOfPossibleISPAbbr.add("ams-ix-mumbai");
        listOfPossibleISPAbbr.add("ams-ix-mumbai-ixp");
        listOfPossibleISPAbbr.add("a2d");
        listOfPossibleISPAbbr.add("atd");
        listOfPossibleISPAbbr.add("atw");
        listOfPossibleISPAbbr.add("atw-ixp");
        listOfPossibleISPAbbr.add("a2w");
        listOfPossibleISPAbbr.add("a2w-ixp");
        listOfPossibleISPAbbr.add("ape-ixp");
        listOfPossibleISPAbbr.add("ape");
        listOfPossibleISPAbbr.add("bbix");
        listOfPossibleISPAbbr.add("bb-ix");
        listOfPossibleISPAbbr.add("bbix-hk");
        listOfPossibleISPAbbr.add("bb-ix-hk");
        listOfPossibleISPAbbr.add("bbix-osaka");
        listOfPossibleISPAbbr.add("bb-ix-osaka");
        listOfPossibleISPAbbr.add("bbix-sngpr");
        listOfPossibleISPAbbr.add("bbix-singapre");
        listOfPossibleISPAbbr.add("bb-ix-sngpr");
        listOfPossibleISPAbbr.add("bb-ix-singapore");
        listOfPossibleISPAbbr.add("bbix-tokyo");
        listOfPossibleISPAbbr.add("bb-ix-tokyo");
        listOfPossibleISPAbbr.add("bbix-tky");
        listOfPossibleISPAbbr.add("bb-ix-tky");
        listOfPossibleISPAbbr.add("bcix");
        listOfPossibleISPAbbr.add("bc-ix");
        listOfPossibleISPAbbr.add("bharatix");
        listOfPossibleISPAbbr.add("bharatix-mumbai");
        listOfPossibleISPAbbr.add("bharat-ix");
        listOfPossibleISPAbbr.add("bharat-ix-mumbai");
        listOfPossibleISPAbbr.add("bnix");
        listOfPossibleISPAbbr.add("bn-ix");
        listOfPossibleISPAbbr.add("boston-ix");
        listOfPossibleISPAbbr.add("chix");
        listOfPossibleISPAbbr.add("ch-ix");
        listOfPossibleISPAbbr.add("cix-atl");
        listOfPossibleISPAbbr.add("c-ix-atl");
        listOfPossibleISPAbbr.add("cyrusone-ix-houston");
        listOfPossibleISPAbbr.add("de-cix-chicago");
        listOfPossibleISPAbbr.add("de-c-ix-chicago");
        listOfPossibleISPAbbr.add("de-cix-chi");
        listOfPossibleISPAbbr.add("de-c-ix-chi");
        listOfPossibleISPAbbr.add("de-cix-frankfurt");
        listOfPossibleISPAbbr.add("de-c-ix-frankfurt");
        listOfPossibleISPAbbr.add("de-cix-fra");
        listOfPossibleISPAbbr.add("de-c-ix-fra");
        listOfPossibleISPAbbr.add("de-cix-mad");
        listOfPossibleISPAbbr.add("de-c-ix-mad");
        listOfPossibleISPAbbr.add("de-cix-madrid");
        listOfPossibleISPAbbr.add("de-c-ix-madrid");
        listOfPossibleISPAbbr.add("de-c-ix-mumbai");
        listOfPossibleISPAbbr.add("de-c-ix-mumbai");
        listOfPossibleISPAbbr.add("de-cix-mum");
        listOfPossibleISPAbbr.add("de-c-ix-mum");
        listOfPossibleISPAbbr.add("de-cix-ny");
        listOfPossibleISPAbbr.add("de-c-ix-ny");
        listOfPossibleISPAbbr.add("digitalrealty-atlanta");
        listOfPossibleISPAbbr.add("1n1");
        listOfPossibleISPAbbr.add("1n1-isp");
        listOfPossibleISPAbbr.add("ewe");
        listOfPossibleISPAbbr.add("ewe-isp");
        listOfPossibleISPAbbr.add("m-net-isp");
        listOfPossibleISPAbbr.add("m-net");
        listOfPossibleISPAbbr.add("netcologne-isp");
        listOfPossibleISPAbbr.add("netcologne");
        listOfPossibleISPAbbr.add("telefonica");
        listOfPossibleISPAbbr.add("telefonica-isp");
        listOfPossibleISPAbbr.add("telekom");
        listOfPossibleISPAbbr.add("telekom-isp");
        listOfPossibleISPAbbr.add("vodafone");
        listOfPossibleISPAbbr.add("vodafone-isp");


        System.out.println(Arrays.toString(listOfIATACodes.toArray()));

        StringBuilder domainNameToTry = new StringBuilder("ipv4-c");
        int ispCodeLength = 0;

        //fix the domain name generation, it's not working correctly after some point
        //cao number
        for (int i = 1; i <= 999; i++) {
            domainNameToTry.append(String.format("%03d", i));
            for (String airportCode : listOfIATACodes) {
                domainNameToTry.append("-").append(airportCode);
                    for (int j = 1; j < 5; j++) {
                        domainNameToTry.append(String.format("%03d", j));
                        for (String ispCode : listOfPossibleISPAbbr) {
                            ispCodeLength = ispCode.length();
                            domainNameToTry.append("-").append(ispCode).append(".1.oca.nflxvideo.net");
                            try {
                                InetAddress netflixDomainName = java.net.InetAddress.getByName(domainNameToTry.toString());
                                System.out.println(netflixDomainName.getHostAddress());
                                if (!netflixDomainName.getHostAddress().equals("")) {
                                    domainNameIPPairs.add(new Pair(domainNameToTry.toString(), netflixDomainName.getHostAddress()));
                                }
                            } catch (UnknownHostException e) {
                                System.out.println(domainNameToTry);
                            }
                            domainNameToTry.delete(16, 16 + ispCode.length() + 21);
                        }
                        domainNameToTry.delete(13, 16);
                }
                domainNameToTry.delete(9, 13);
            }
            domainNameToTry.delete(6, 9);
         }

        System.out.println(domainNameIPPairs);
    }

    public static void findCanadianDomains(ArrayList<Pair<String, String>> domainNameIPPairs) {
        ArrayList<String> listOfCanadianIATACodes = new ArrayList<>();
        ArrayList<String> listOfCanadianISPAbbr = new ArrayList<>();

        // Canadian ISPs
        listOfCanadianISPAbbr.add("allotel-isp");
        listOfCanadianISPAbbr.add("accesscom-isp");
        listOfCanadianISPAbbr.add("acccom-isp");
        listOfCanadianISPAbbr.add("aurora-isp");
        listOfCanadianISPAbbr.add("bellint-isp");
        listOfCanadianISPAbbr.add("bellaliant-isp");
        listOfCanadianISPAbbr.add("cableax-isp");
        listOfCanadianISPAbbr.add("cablevis-isp");
        listOfCanadianISPAbbr.add("chebuctocomm-isp");
        listOfCanadianISPAbbr.add("ciktel-isp");
        listOfCanadianISPAbbr.add("cogeco-isp");
        listOfCanadianISPAbbr.add("comwave-isp");
        listOfCanadianISPAbbr.add("craig-isp");
        listOfCanadianISPAbbr.add("derytel-isp");
        listOfCanadianISPAbbr.add("eastlink-isp");
        listOfCanadianISPAbbr.add("everus-isp");
        listOfCanadianISPAbbr.add("everuscomm-isp");
        listOfCanadianISPAbbr.add("execulinktel-isp");
        listOfCanadianISPAbbr.add("fido-isp");
        listOfCanadianISPAbbr.add("internex-isp");
        listOfCanadianISPAbbr.add("jet2-net-isp");
        listOfCanadianISPAbbr.add("leadtel-isp");
        listOfCanadianISPAbbr.add("lookcomm-isp");
        listOfCanadianISPAbbr.add("mnsitel-isp");
        listOfCanadianISPAbbr.add("northwestel-isp");
        listOfCanadianISPAbbr.add("net-crawler-isp");
        listOfCanadianISPAbbr.add("mtcable-isp");
        listOfCanadianISPAbbr.add("free-net-isp");
        listOfCanadianISPAbbr.add("novus-ent-isp");
        listOfCanadianISPAbbr.add("novusent-isp");
        listOfCanadianISPAbbr.add("ontera-isp");
        listOfCanadianISPAbbr.add("personacomm-isp");
        listOfCanadianISPAbbr.add("chapleau-isp");
        listOfCanadianISPAbbr.add("qiniq-isp");
        listOfCanadianISPAbbr.add("sasktel-isp");
        listOfCanadianISPAbbr.add("rogers-isp");
        listOfCanadianISPAbbr.add("rushcomm-isp");
        listOfCanadianISPAbbr.add("seasidecomm-isp");
        listOfCanadianISPAbbr.add("shaw-isp");
        listOfCanadianISPAbbr.add("source-isp");
        listOfCanadianISPAbbr.add("ssi-isp");
        listOfCanadianISPAbbr.add("tbaytel-isp");
        listOfCanadianISPAbbr.add("teksavvy-isp");
        listOfCanadianISPAbbr.add("telebac-isp");
        listOfCanadianISPAbbr.add("telus-isp");
        listOfCanadianISPAbbr.add("velcom-isp");
        listOfCanadianISPAbbr.add("vacouver-net-isp");
        listOfCanadianISPAbbr.add("videotron-isp");
        listOfCanadianISPAbbr.add("virgin-can-isp");
        listOfCanadianISPAbbr.add("vmedia-isp");
        listOfCanadianISPAbbr.add("nomad-isp");
        listOfCanadianISPAbbr.add("xplor-net-isp");

        // Canadian Airport Codes
        listOfCanadianIATACodes.add("yaa");        listOfCanadianIATACodes.add("yab");        listOfCanadianIATACodes.add("yac");
        listOfCanadianIATACodes.add("yad");        listOfCanadianIATACodes.add("yag");        listOfCanadianIATACodes.add("yah");
        listOfCanadianIATACodes.add("yai");        listOfCanadianIATACodes.add("yaj");        listOfCanadianIATACodes.add("yak");
        listOfCanadianIATACodes.add("yal");        listOfCanadianIATACodes.add("yam");        listOfCanadianIATACodes.add("yan");
        listOfCanadianIATACodes.add("yao");        listOfCanadianIATACodes.add("yap");        listOfCanadianIATACodes.add("yar");
        listOfCanadianIATACodes.add("yas");        listOfCanadianIATACodes.add("yat");        listOfCanadianIATACodes.add("yau");
        listOfCanadianIATACodes.add("yav");        listOfCanadianIATACodes.add("yax");        listOfCanadianIATACodes.add("yay");
        listOfCanadianIATACodes.add("yaz");        listOfCanadianIATACodes.add("yba");        listOfCanadianIATACodes.add("ybb");
        listOfCanadianIATACodes.add("ync");        listOfCanadianIATACodes.add("ybe");        listOfCanadianIATACodes.add("ybf");
        listOfCanadianIATACodes.add("ybg");        listOfCanadianIATACodes.add("ybh");        listOfCanadianIATACodes.add("ybi");
        listOfCanadianIATACodes.add("ybj");        listOfCanadianIATACodes.add("ybk");        listOfCanadianIATACodes.add("ybl");
        listOfCanadianIATACodes.add("ybo");        listOfCanadianIATACodes.add("ybp");        listOfCanadianIATACodes.add("ybq");
        listOfCanadianIATACodes.add("ybr");        listOfCanadianIATACodes.add("ybs");        listOfCanadianIATACodes.add("ybt");
        listOfCanadianIATACodes.add("ybv");        listOfCanadianIATACodes.add("ybw");        listOfCanadianIATACodes.add("ybx");
        listOfCanadianIATACodes.add("yby");        listOfCanadianIATACodes.add("yca");        listOfCanadianIATACodes.add("ycb");
        listOfCanadianIATACodes.add("ycc");        listOfCanadianIATACodes.add("ycd");        listOfCanadianIATACodes.add("yce");
        listOfCanadianIATACodes.add("ycf");        listOfCanadianIATACodes.add("ycg");        listOfCanadianIATACodes.add("ych");
        listOfCanadianIATACodes.add("yck");        listOfCanadianIATACodes.add("ycl");        listOfCanadianIATACodes.add("ycm");
        listOfCanadianIATACodes.add("ycn");        listOfCanadianIATACodes.add("yco");        listOfCanadianIATACodes.add("ycq");
        listOfCanadianIATACodes.add("ycr");        listOfCanadianIATACodes.add("ycs");        listOfCanadianIATACodes.add("yct");
        listOfCanadianIATACodes.add("ycu");        listOfCanadianIATACodes.add("ycw");        listOfCanadianIATACodes.add("ycy");
        listOfCanadianIATACodes.add("ycz");        listOfCanadianIATACodes.add("yda");        listOfCanadianIATACodes.add("ydb");
        listOfCanadianIATACodes.add("ydc");        listOfCanadianIATACodes.add("yde");        listOfCanadianIATACodes.add("ydf");
        listOfCanadianIATACodes.add("ydg");        listOfCanadianIATACodes.add("ydj");        listOfCanadianIATACodes.add("ydl");
        listOfCanadianIATACodes.add("ydn");        listOfCanadianIATACodes.add("ydo");        listOfCanadianIATACodes.add("ydp");
        listOfCanadianIATACodes.add("ydq");        listOfCanadianIATACodes.add("ydt");        listOfCanadianIATACodes.add("ydu");
        listOfCanadianIATACodes.add("ydv");        listOfCanadianIATACodes.add("ydw");        listOfCanadianIATACodes.add("yea");
        listOfCanadianIATACodes.add("yeb");        listOfCanadianIATACodes.add("yec");        listOfCanadianIATACodes.add("yeg");
        listOfCanadianIATACodes.add("yei");        listOfCanadianIATACodes.add("yek");        listOfCanadianIATACodes.add("yel");
        listOfCanadianIATACodes.add("yem");        listOfCanadianIATACodes.add("yen");        listOfCanadianIATACodes.add("yeo");
        listOfCanadianIATACodes.add("yeq");        listOfCanadianIATACodes.add("yer");        listOfCanadianIATACodes.add("yes");
        listOfCanadianIATACodes.add("yet");        listOfCanadianIATACodes.add("yeu");        listOfCanadianIATACodes.add("yev");
        listOfCanadianIATACodes.add("yey");        listOfCanadianIATACodes.add("yfa");        listOfCanadianIATACodes.add("yfb");
        listOfCanadianIATACodes.add("yfc");        listOfCanadianIATACodes.add("yfe");        listOfCanadianIATACodes.add("yfg");
        listOfCanadianIATACodes.add("yfh");        listOfCanadianIATACodes.add("yfi");        listOfCanadianIATACodes.add("yfj");
        listOfCanadianIATACodes.add("yfl");        listOfCanadianIATACodes.add("yfo");        listOfCanadianIATACodes.add("yfr");
        listOfCanadianIATACodes.add("yfs");        listOfCanadianIATACodes.add("yft");        listOfCanadianIATACodes.add("yfx");
        listOfCanadianIATACodes.add("ygb");        listOfCanadianIATACodes.add("ygc");        listOfCanadianIATACodes.add("yge");
        listOfCanadianIATACodes.add("ygg");        listOfCanadianIATACodes.add("ygh");        listOfCanadianIATACodes.add("ygj");
        listOfCanadianIATACodes.add("ygk");        listOfCanadianIATACodes.add("ygl");        listOfCanadianIATACodes.add("ygm");
        listOfCanadianIATACodes.add("ygn");        listOfCanadianIATACodes.add("ygo");        listOfCanadianIATACodes.add("ygp");
        listOfCanadianIATACodes.add("ygq");        listOfCanadianIATACodes.add("ygr");        listOfCanadianIATACodes.add("ygt");
        listOfCanadianIATACodes.add("ygv");        listOfCanadianIATACodes.add("ygw");        listOfCanadianIATACodes.add("ygx");
        listOfCanadianIATACodes.add("ygz");        listOfCanadianIATACodes.add("yha");        listOfCanadianIATACodes.add("yhb");
        listOfCanadianIATACodes.add("yhc");        listOfCanadianIATACodes.add("yhd");        listOfCanadianIATACodes.add("yhe");
        listOfCanadianIATACodes.add("yhf");        listOfCanadianIATACodes.add("yhg");        listOfCanadianIATACodes.add("yhh");
        listOfCanadianIATACodes.add("yhi");        listOfCanadianIATACodes.add("yhk");        listOfCanadianIATACodes.add("yhm");
        listOfCanadianIATACodes.add("yhn");        listOfCanadianIATACodes.add("yho");        listOfCanadianIATACodes.add("yhp");
        listOfCanadianIATACodes.add("yhr");        listOfCanadianIATACodes.add("yhs");        listOfCanadianIATACodes.add("yht");
        listOfCanadianIATACodes.add("yhu");        listOfCanadianIATACodes.add("yhy");        listOfCanadianIATACodes.add("yhz");
        listOfCanadianIATACodes.add("yia");        listOfCanadianIATACodes.add("yib");        listOfCanadianIATACodes.add("yic");
        listOfCanadianIATACodes.add("yie");        listOfCanadianIATACodes.add("yif");        listOfCanadianIATACodes.add("yig");
        listOfCanadianIATACodes.add("yih");        listOfCanadianIATACodes.add("yik");        listOfCanadianIATACodes.add("yin");
        listOfCanadianIATACodes.add("yio");        listOfCanadianIATACodes.add("yip");        listOfCanadianIATACodes.add("yiv");
        listOfCanadianIATACodes.add("yiw");        listOfCanadianIATACodes.add("yja");        listOfCanadianIATACodes.add("yjf");
        listOfCanadianIATACodes.add("yjn");        listOfCanadianIATACodes.add("yjp");        listOfCanadianIATACodes.add("yjs");
        listOfCanadianIATACodes.add("yjt");        listOfCanadianIATACodes.add("yka");        listOfCanadianIATACodes.add("ykc");
        listOfCanadianIATACodes.add("ykd");        listOfCanadianIATACodes.add("yke");        listOfCanadianIATACodes.add("ykf");
        listOfCanadianIATACodes.add("ykg");        listOfCanadianIATACodes.add("ykh");        listOfCanadianIATACodes.add("ykj");
        listOfCanadianIATACodes.add("ykk");        listOfCanadianIATACodes.add("ykl");        listOfCanadianIATACodes.add("ykm");
        listOfCanadianIATACodes.add("ykn");        listOfCanadianIATACodes.add("yko");        listOfCanadianIATACodes.add("ykq");
        listOfCanadianIATACodes.add("yks");        listOfCanadianIATACodes.add("ykt");        listOfCanadianIATACodes.add("yku");
        listOfCanadianIATACodes.add("ykx");        listOfCanadianIATACodes.add("yky");        listOfCanadianIATACodes.add("ykz");
        listOfCanadianIATACodes.add("ylb");        listOfCanadianIATACodes.add("ylc");        listOfCanadianIATACodes.add("yld");
        listOfCanadianIATACodes.add("yle");        listOfCanadianIATACodes.add("ylg");        listOfCanadianIATACodes.add("ylh");
        listOfCanadianIATACodes.add("yli");        listOfCanadianIATACodes.add("ylj");        listOfCanadianIATACodes.add("ylk");
        listOfCanadianIATACodes.add("yll");        listOfCanadianIATACodes.add("ylm");        listOfCanadianIATACodes.add("yln");
        listOfCanadianIATACodes.add("ylp");        listOfCanadianIATACodes.add("ylq");        listOfCanadianIATACodes.add("ylr");
        listOfCanadianIATACodes.add("yls");        listOfCanadianIATACodes.add("ylt");        listOfCanadianIATACodes.add("ylv");
        listOfCanadianIATACodes.add("ylw");        listOfCanadianIATACodes.add("ylx");        listOfCanadianIATACodes.add("ylz");
        listOfCanadianIATACodes.add("yma");        listOfCanadianIATACodes.add("ymb");        listOfCanadianIATACodes.add("ymd");
        listOfCanadianIATACodes.add("yme");        listOfCanadianIATACodes.add("ymf");        listOfCanadianIATACodes.add("ymg");
        listOfCanadianIATACodes.add("ymh");        listOfCanadianIATACodes.add("ymj");        listOfCanadianIATACodes.add("ymk");
        listOfCanadianIATACodes.add("yml");        listOfCanadianIATACodes.add("ymm");        listOfCanadianIATACodes.add("ymn");
        listOfCanadianIATACodes.add("ymo");        listOfCanadianIATACodes.add("ymp");        listOfCanadianIATACodes.add("ymq");
        listOfCanadianIATACodes.add("yms");        listOfCanadianIATACodes.add("ymt");        listOfCanadianIATACodes.add("ymu");
        listOfCanadianIATACodes.add("ymv");        listOfCanadianIATACodes.add("ymw");        listOfCanadianIATACodes.add("ymx");
        listOfCanadianIATACodes.add("yna");        listOfCanadianIATACodes.add("ynb");        listOfCanadianIATACodes.add("ync");
        listOfCanadianIATACodes.add("ynd");        listOfCanadianIATACodes.add("yne");        listOfCanadianIATACodes.add("yng");
        listOfCanadianIATACodes.add("ynh");        listOfCanadianIATACodes.add("ynj");        listOfCanadianIATACodes.add("ynl");
        listOfCanadianIATACodes.add("ynm");        listOfCanadianIATACodes.add("ynn");        listOfCanadianIATACodes.add("yno");
        listOfCanadianIATACodes.add("ynp");        listOfCanadianIATACodes.add("yns");        listOfCanadianIATACodes.add("ynt");
        listOfCanadianIATACodes.add("ynx");        listOfCanadianIATACodes.add("yny");        listOfCanadianIATACodes.add("ynz");
        listOfCanadianIATACodes.add("yoa");        listOfCanadianIATACodes.add("yoc");        listOfCanadianIATACodes.add("yod");
        listOfCanadianIATACodes.add("yoe");        listOfCanadianIATACodes.add("yog");        listOfCanadianIATACodes.add("yoh");
        listOfCanadianIATACodes.add("yoi");        listOfCanadianIATACodes.add("yoj");        listOfCanadianIATACodes.add("yol");
        listOfCanadianIATACodes.add("yon");        listOfCanadianIATACodes.add("yoo");        listOfCanadianIATACodes.add("yop");
        listOfCanadianIATACodes.add("yos");        listOfCanadianIATACodes.add("yot");        listOfCanadianIATACodes.add("yow");
        listOfCanadianIATACodes.add("ypa");        listOfCanadianIATACodes.add("ypb");        listOfCanadianIATACodes.add("ypc");
        listOfCanadianIATACodes.add("ypd");        listOfCanadianIATACodes.add("ype");        listOfCanadianIATACodes.add("ypg");
        listOfCanadianIATACodes.add("yph");        listOfCanadianIATACodes.add("ypi");        listOfCanadianIATACodes.add("ypj");
        listOfCanadianIATACodes.add("ypl");        listOfCanadianIATACodes.add("ypm");        listOfCanadianIATACodes.add("ypn");
        listOfCanadianIATACodes.add("ypo");        listOfCanadianIATACodes.add("ypq");        listOfCanadianIATACodes.add("ypr");
        listOfCanadianIATACodes.add("yps");        listOfCanadianIATACodes.add("ypt");        listOfCanadianIATACodes.add("ypw");
        listOfCanadianIATACodes.add("ypx");        listOfCanadianIATACodes.add("ypy");        listOfCanadianIATACodes.add("ypz");
        listOfCanadianIATACodes.add("yqa");        listOfCanadianIATACodes.add("yqb");        listOfCanadianIATACodes.add("yqc");
        listOfCanadianIATACodes.add("yqd");        listOfCanadianIATACodes.add("yqf");        listOfCanadianIATACodes.add("yqg");
        listOfCanadianIATACodes.add("yqh");        listOfCanadianIATACodes.add("yqi");        listOfCanadianIATACodes.add("yqj");
        listOfCanadianIATACodes.add("yqk");        listOfCanadianIATACodes.add("yql");        listOfCanadianIATACodes.add("yqm");
        listOfCanadianIATACodes.add("yqn");        listOfCanadianIATACodes.add("yqq");        listOfCanadianIATACodes.add("yqr");
        listOfCanadianIATACodes.add("yqs");        listOfCanadianIATACodes.add("yqt");        listOfCanadianIATACodes.add("yqu");
        listOfCanadianIATACodes.add("yqv");        listOfCanadianIATACodes.add("yqw");        listOfCanadianIATACodes.add("yqx");
        listOfCanadianIATACodes.add("yqy");        listOfCanadianIATACodes.add("yqz");        listOfCanadianIATACodes.add("yra");
        listOfCanadianIATACodes.add("yrb");        listOfCanadianIATACodes.add("yrc");        listOfCanadianIATACodes.add("yrd");
        listOfCanadianIATACodes.add("yrf");        listOfCanadianIATACodes.add("yrg");        listOfCanadianIATACodes.add("yri");
        listOfCanadianIATACodes.add("yrj");        listOfCanadianIATACodes.add("yrl");        listOfCanadianIATACodes.add("yrm");
        listOfCanadianIATACodes.add("yrn");        listOfCanadianIATACodes.add("yro");        listOfCanadianIATACodes.add("yrq");
        listOfCanadianIATACodes.add("yrr");        listOfCanadianIATACodes.add("yrs");        listOfCanadianIATACodes.add("yrt");
        listOfCanadianIATACodes.add("yrv");        listOfCanadianIATACodes.add("ysa");        listOfCanadianIATACodes.add("ysb");
        listOfCanadianIATACodes.add("ysc");        listOfCanadianIATACodes.add("yse");        listOfCanadianIATACodes.add("ysf");
        listOfCanadianIATACodes.add("ysg");        listOfCanadianIATACodes.add("ysh");        listOfCanadianIATACodes.add("ysi");
        listOfCanadianIATACodes.add("ysj");        listOfCanadianIATACodes.add("ysk");        listOfCanadianIATACodes.add("ysl");
        listOfCanadianIATACodes.add("ysm");        listOfCanadianIATACodes.add("ysn");        listOfCanadianIATACodes.add("yso");
        listOfCanadianIATACodes.add("ysp");        listOfCanadianIATACodes.add("ysq");        listOfCanadianIATACodes.add("yst");
        listOfCanadianIATACodes.add("ysu");        listOfCanadianIATACodes.add("ysx");        listOfCanadianIATACodes.add("ysy");
        listOfCanadianIATACodes.add("yta");        listOfCanadianIATACodes.add("ytb");        listOfCanadianIATACodes.add("ytd");
        listOfCanadianIATACodes.add("yte");        listOfCanadianIATACodes.add("ytf");        listOfCanadianIATACodes.add("ytg");
        listOfCanadianIATACodes.add("yth");        listOfCanadianIATACodes.add("ytl");        listOfCanadianIATACodes.add("ytm");
        listOfCanadianIATACodes.add("yto");        listOfCanadianIATACodes.add("ytp");        listOfCanadianIATACodes.add("ytq");
        listOfCanadianIATACodes.add("ytr");        listOfCanadianIATACodes.add("yts");        listOfCanadianIATACodes.add("ytt");
        listOfCanadianIATACodes.add("ytu");        listOfCanadianIATACodes.add("ytx");        listOfCanadianIATACodes.add("yty");
        listOfCanadianIATACodes.add("ytz");        listOfCanadianIATACodes.add("yua");        listOfCanadianIATACodes.add("yub");
        listOfCanadianIATACodes.add("yud");        listOfCanadianIATACodes.add("yue");        listOfCanadianIATACodes.add("yul");
        listOfCanadianIATACodes.add("yum");        listOfCanadianIATACodes.add("yus");        listOfCanadianIATACodes.add("yut");
        listOfCanadianIATACodes.add("yux");        listOfCanadianIATACodes.add("yuy");        listOfCanadianIATACodes.add("yva");
        listOfCanadianIATACodes.add("yvb");        listOfCanadianIATACodes.add("yvc");        listOfCanadianIATACodes.add("yvd");
        listOfCanadianIATACodes.add("yve");        listOfCanadianIATACodes.add("yvg");        listOfCanadianIATACodes.add("yvm");
        listOfCanadianIATACodes.add("yvn");        listOfCanadianIATACodes.add("yvo");        listOfCanadianIATACodes.add("yvp");
        listOfCanadianIATACodes.add("yvq");        listOfCanadianIATACodes.add("yvr");        listOfCanadianIATACodes.add("yvt");
        listOfCanadianIATACodes.add("yvv");        listOfCanadianIATACodes.add("yvz");        listOfCanadianIATACodes.add("ywa");
        listOfCanadianIATACodes.add("ywb");        listOfCanadianIATACodes.add("ywg");        listOfCanadianIATACodes.add("ywh");
        listOfCanadianIATACodes.add("ywj");        listOfCanadianIATACodes.add("ywk");        listOfCanadianIATACodes.add("ywl");
        listOfCanadianIATACodes.add("ywm");        listOfCanadianIATACodes.add("ywp");        listOfCanadianIATACodes.add("ywq");
        listOfCanadianIATACodes.add("ywr");        listOfCanadianIATACodes.add("yws");        listOfCanadianIATACodes.add("ywy");
        listOfCanadianIATACodes.add("yxc");        listOfCanadianIATACodes.add("yxd");        listOfCanadianIATACodes.add("yxe");
        listOfCanadianIATACodes.add("yxh");        listOfCanadianIATACodes.add("yxj");        listOfCanadianIATACodes.add("yxk");
        listOfCanadianIATACodes.add("yxl");        listOfCanadianIATACodes.add("yxn");        listOfCanadianIATACodes.add("yxp");
        listOfCanadianIATACodes.add("yxq");        listOfCanadianIATACodes.add("yxr");        listOfCanadianIATACodes.add("yxs");
        listOfCanadianIATACodes.add("yxt");        listOfCanadianIATACodes.add("yxu");        listOfCanadianIATACodes.add("yxx");
        listOfCanadianIATACodes.add("yxy");        listOfCanadianIATACodes.add("yxz");        listOfCanadianIATACodes.add("yya");
        listOfCanadianIATACodes.add("yyb");        listOfCanadianIATACodes.add("yyc");        listOfCanadianIATACodes.add("yyd");
        listOfCanadianIATACodes.add("yye");        listOfCanadianIATACodes.add("yyf");        listOfCanadianIATACodes.add("yyg");
        listOfCanadianIATACodes.add("yyh");        listOfCanadianIATACodes.add("yyi");        listOfCanadianIATACodes.add("yyj");
        listOfCanadianIATACodes.add("yyl");        listOfCanadianIATACodes.add("yym");        listOfCanadianIATACodes.add("yyn");
        listOfCanadianIATACodes.add("yyq");        listOfCanadianIATACodes.add("yyr");        listOfCanadianIATACodes.add("yyt");
        listOfCanadianIATACodes.add("yyu");        listOfCanadianIATACodes.add("yyw");        listOfCanadianIATACodes.add("yyy");
        listOfCanadianIATACodes.add("yyz");        listOfCanadianIATACodes.add("yza");        listOfCanadianIATACodes.add("yze");
        listOfCanadianIATACodes.add("yzf");        listOfCanadianIATACodes.add("yzg");        listOfCanadianIATACodes.add("yzh");
        listOfCanadianIATACodes.add("yzp");        listOfCanadianIATACodes.add("yzr");        listOfCanadianIATACodes.add("yzs");
        listOfCanadianIATACodes.add("yzt");        listOfCanadianIATACodes.add("yzu");        listOfCanadianIATACodes.add("yzv");
        listOfCanadianIATACodes.add("yzw");        listOfCanadianIATACodes.add("yzx");        listOfCanadianIATACodes.add("yzy");
        listOfCanadianIATACodes.add("yzz");

        StringBuilder canadianDomainNameBuilder = new StringBuilder("ipv4-c");
        boolean serverFoundInCanadaAirportArea;
        int canadaISPCodeLength = 0;

        for (int i = 1; i < 999; i++) {
            String centerToCheck = String.format("%03d", i);
            for (String canadaAirportCode : listOfCanadianIATACodes) {
                serverFoundInCanadaAirportArea = true;
                for (int j = 1; j < 999; j++) {
                    int prevJValue = 1;
                    for (String canadianISPName : listOfCanadianISPAbbr) {
                        if (!serverFoundInCanadaAirportArea)
                            prevJValue = 1;
                        canadaISPCodeLength = canadianISPName.length();
                        canadianDomainNameBuilder.append(centerToCheck).append("-").append(canadaAirportCode).append(String.format("%03d", j)).append("-").append(canadianISPName).append(".1.oca.nflxvideo.net");
                        try {
                            InetAddress netflixDomainName = java.net.InetAddress.getByName(canadianDomainNameBuilder.toString());
                            System.out.println(netflixDomainName.getHostAddress());
                            if (!netflixDomainName.getHostAddress().equals("")) {
                                domainNameIPPairs.add(new Pair(canadianDomainNameBuilder.toString(), netflixDomainName.getHostAddress()));
                                serverFoundInCanadaAirportArea = true;
                                prevJValue = j;
                                canadianDomainNameBuilder.delete(16, 16 + canadaISPCodeLength + 21);
                                canadianDomainNameBuilder.delete(13, 16);
                                canadianDomainNameBuilder.delete(9, 13);
                                canadianDomainNameBuilder.delete(6, 9);
                            }
                        } catch (UnknownHostException e) {
                            if (serverFoundInCanadaAirportArea)
                                j = prevJValue;
                            System.out.println(canadianDomainNameBuilder);
                            serverFoundInCanadaAirportArea = false;

                        }
                        if (canadianDomainNameBuilder.length() > 16) {
                            canadianDomainNameBuilder.delete(16, 16 + canadaISPCodeLength + 21);
                        }
                        if (canadianDomainNameBuilder.length() > 13) {
                            canadianDomainNameBuilder.delete(13, 16);
                        }
                        if (canadianDomainNameBuilder.length() > 9) {
                            canadianDomainNameBuilder.delete(9, 13);
                        }
                        if (canadianDomainNameBuilder.length() > 6) {
                            canadianDomainNameBuilder.delete(6, 9);
                        }
                    }
                    if (!serverFoundInCanadaAirportArea) {
                        break;
                    }
                }
            }
        }
    }
}
