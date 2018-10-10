public class ChallengeList {

    /**
     * retourne la moyenne de a et de b
     */
    public static double moyenne(int a, int b) {
        return (a + b) / 2.0;
    }

    /**
     * retourn le perimetre d'un carre de côté a
     */
    public static int perimetreCarre(int a) {
        // TODO @B
        return (a * 4);
    }

    /**
     * retourne vrai si les 2 lettres du début et de la fin sont les mêmes
     * ex "ABCDDFAB" : true
     */
    public static boolean commenceFini(String mot) {
        // TODO @A
        int longueur = mot.length();
        if (mot.substring(0, 2).equals(mot.substring(longueur - 2, longueur))) {
            return true;
        }
        return false;
    }

    /**
     * retourne vrai si le mot contient des lettres différentes
     * ex "AAAAAA" : false
     * "AAAHAA" : true
     */
    public static boolean nonMonotone(String mot) {
        // TODO @B
        char c = mot.charAt(0);
        for (int i = 1; i < mot.length(); i++) {
            if (mot.charAt(i) != c) {
                return true;
            }
        }
        return false;
    }

    /**
     * retourne le tarif associé à l'âge :
     * "gratuit" pourles moins de 3 ans.
     * "reduit" pour les 3 à 12 ans
     * "plein" pour les autres
     * "erreur" si age négatif
     **/
    public static String tarif(int age) {
        // TODO @A
        if (age < 0) {
            return "erreur";
        }
        if (age <= 3) {
            return "gratuit";
        }
        if (age <= 12) {
            return "reduit";
        }
        return "plein";
    }

    /**
     * retourne un message correspondant à la température :
     * "ça gèle" si la temperature est négative
     * "ça caille" pour une temperature entre 0 et 5
     * "RAS" pour une temperature en 5 et 90
     * "ça bouille" si la température est supérieure à 90
     * "erreur" si la température est inférieure à -274
     **/
    public static String caGele(int temperature) {
        // TODO @B
        if (temperature < -274) {
            return "erreur";
        }
        if (temperature < 0) {
            return "ça gèle";
        }
        if (temperature <= 5) {
            return "ça caille";

        }
        if (temperature <= 90) {
            return "RAS";
        }
        return "ça bouille";
    }

    /**
     * parcourt le tableau de noms et retourne une liste de tous les noms qui ont une longueur > 2
     **/
    public static String[] filtreShort(String[] noms) {
        int compteur = 0;
        for (String n : noms) {
            if (n.length() > 2) {
                compteur++;
            }
        }
        String[] listeFiltree = new String[compteur];
        compteur = 0;
        for (String n : noms) {
            if (n.length() > 2) {
                listeFiltree[compteur] = n;
                compteur++;
            }
        }
        return listeFiltree;
    }

    /**
     * parcourt le tableau de noms et retourne une liste de tous les noms qui commencent par lettre
     **/
    public static String[] filtreLetter(String[] noms, char lettre) {
        // TODO @B
        int compteur = 0;
        for (String n : noms) {
            if (n.charAt(0) == lettre) {
                compteur++;
            }
        }
        String[] listeFiltree = new String[compteur];
        compteur = 0;
        for (String n : noms) {
            if (n.charAt(0) == lettre) {
                listeFiltree[compteur] = n;
                compteur++;
            }
        }
        return listeFiltree;

    }


    /**
     * un exemple
     **/
    public static int squareDigits(int n) {
        String res = "";
        for (char digit : (n + "").toCharArray()) {
            int d = Character.getNumericValue(digit);
            res = res + (d * d);
        }
        return Integer.parseInt(res);
    }


}
