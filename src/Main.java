public class Main {
    public static void main(String[] args) {
        System.out.println(StringaPariDispari("ciao"));
        System.out.println(AnnoBisestile(2012));
    }

    public static boolean StringaPariDispari (String str) {
        if (str.length()%2==0) {
            return true;
        }   else {
            return false;
        }


    }
    public static boolean AnnoBisestile (int anno) {
        if (anno%4==0) {
        return true;
        } else if ((anno%100==0) && (anno%400==0)) {
            return true;
        } else {
            return false;
        }
        }
    }

