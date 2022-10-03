import java.util.Arrays;
import java.util.Random;

//exercism pour s'entrainer :)

public class tri {
    public static void main(String[] args){
        long avantTemps,apresTemps;
        int [] test = {1,3,0,9,6,4,2};
        int [] testInsertion = {1,3,0,9,6,4,2};
        int [] testSection = {1,3,0,9,6,4,2};
        int [] testBulle = {1,3,0,9,6,4,2};
        int [] testCock = {1,3,0,9,6,4,2};
        int [] grandTab = new int [100000];
        int [] grandTabInsertion = new int [100000];
        int [] grandTabSection = new int [100000];
        int [] grandTabBulle = new int [100000];
        int [] grandTabCock = new int [100000];
        int [] grandTabRange = new int [100000];

        genereRandomTab(grandTab);
        genereRandomTab(grandTabInsertion);
        genereRandomTab(grandTabSection);
        genereRandomTab(grandTabBulle);
        genereRandomTab(grandTabCock);

        genereRandomTrie(grandTab);

        avantTemps = System.currentTimeMillis();
        triInsertion(testInsertion);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps Insertion est " + (apresTemps-avantTemps));
        avantTemps = System.currentTimeMillis();
        triInsertion(grandTabInsertion);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps grand Insertion est " + (apresTemps-avantTemps));
        avantTemps = System.currentTimeMillis();
        triInsertion(grandTabRange);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps grandnull Insertion est " + (apresTemps-avantTemps));

        avantTemps = System.currentTimeMillis();
        triSection(testSection);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps Section est " + (apresTemps-avantTemps));
        avantTemps = System.currentTimeMillis();
        triSection(grandTabSection);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps grand Section est " + (apresTemps-avantTemps));
        avantTemps = System.currentTimeMillis();
        triSection(grandTabRange);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps grandnull Section est " + (apresTemps-avantTemps));

        avantTemps = System.currentTimeMillis();
        triBulle(testBulle);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps Bulle est " + (apresTemps-avantTemps));
        avantTemps = System.currentTimeMillis();
        triBulle(grandTabBulle);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps grand Bulle est " + (apresTemps-avantTemps));
        avantTemps = System.currentTimeMillis();
        triBulle(grandTabRange);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps grandnull Bulle est " + (apresTemps-avantTemps));

        avantTemps = System.currentTimeMillis();
        triCock(testCock);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps Cock est " + (apresTemps-avantTemps));
        avantTemps = System.currentTimeMillis();
        triCock(grandTabCock);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps grand Cock est " + (apresTemps-avantTemps));
        avantTemps = System.currentTimeMillis();
        triCock(grandTabRange);
        apresTemps = System.currentTimeMillis();
        System.out.println("Le temps grandnull Cock est " + (apresTemps-avantTemps));

        System.out.println(" ");

        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(testInsertion));
        System.out.println(Arrays.toString(testSection));
        System.out.println(Arrays.toString(testBulle));
        System.out.println(Arrays.toString(testCock));
    }

    public static void triInsertion(int[] france){
        int emmanuel, brigitte, macaron;
        for(brigitte=1; brigitte<france.length;brigitte++){
            macaron = france[brigitte];
            emmanuel=brigitte-1;
            while (0<= emmanuel&&france[emmanuel]>macaron){
                france[emmanuel+1]=france[emmanuel];
                emmanuel-=1;
            }
            france[emmanuel+1]=macaron;
        }
    }
//-----------------------------------------
    public static int minTab (int benala, int[] france){
        int dArmanin, min=benala;
        for(dArmanin=benala+1;dArmanin<france.length;dArmanin++){
            if (france[min]>france[dArmanin]){min=dArmanin;}
        }
        return min;
    }

    public static void triSection (int[] france){
        int emmanuel, macaron, agnes;
        for(emmanuel=0;emmanuel<france.length;emmanuel++){
            macaron=minTab(emmanuel,france);
            agnes=france[emmanuel];
            france[emmanuel]=france[macaron];
            france[macaron]=agnes;
        }
    }
//-----------------------------------------
    public static void triBulle (int[] france){
        int emmanuel, macaron;
        boolean sibeth=false;
        while (!sibeth){
            sibeth=true;
            for(emmanuel=0;emmanuel<france.length-1;emmanuel++){
                if (france[emmanuel]>france[emmanuel+1]){
                    macaron=france[emmanuel];
                    france[emmanuel]=france[emmanuel+1];
                    france[emmanuel+1]=macaron;
                    sibeth=false;
                }
            }
        }
    }
//-----------------------------------------
    public static void genereRandomTab (int[] france){
        Random random = new Random();
        for(int macron=0;macron<france.length;macron++){
            france[macron]=random.nextInt();
        }
    }
//-----------------------------------------
    public static void genereRandomTrie (int[] france){
        for(int macron=0;macron<france.length;macron++){
            france[macron]=macron;
        }
    }
//-----------------------------------------
    public static void triCock (int[] france){
        int emmanuel, macaron;
        boolean sibeth=false;
        while (!sibeth){
            sibeth=true;
            for(emmanuel=0;emmanuel<france.length-1;emmanuel++){
                if (france[emmanuel]>france[emmanuel+1]){
                    macaron=france[emmanuel];
                    france[emmanuel]=france[emmanuel+1];
                    france[emmanuel+1]=macaron;
                    sibeth=false;
                }
            }for(emmanuel=france.length-1;emmanuel>1;emmanuel--){
                if (france[emmanuel]<france[emmanuel-1]){
                    macaron=france[emmanuel];
                    france[emmanuel]=france[emmanuel-1];
                    france[emmanuel-1]=macaron;
                    sibeth=false;
                }
            }
        }
    }
//-----------------------------------------
}
