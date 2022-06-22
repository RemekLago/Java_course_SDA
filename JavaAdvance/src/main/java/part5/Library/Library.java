package Part5.Library;

public class Library {

//    public static Position[] findTitle(Position[] tableOfPositions, String title) {
//        int counter1 = 0;
//        int x1 = 0;
//        for (int i = 0; i < tableOfPositions.length; i++) {
//            if (title.equals(tableOfPositions[i].getTitle())) {
//                counter1 += 1;
//            }
//        }
//        for (int j = 0; j < tableOfPositions.length; j++) {
//            Position[] result = new Position[counter1];
//            if (title.equals(tableOfPositions[j].getTitle())) {
//                result[x1] = tableOfPositions[j];
//                x1 += 1;
//            }
//            return result;
//        }
//        return Position[0];
//    }

    public static void findAuthor(Position[] tableOfPositions, String author) {
        int counter2 = 0;
        int x2 = 0;
        for (int i = 0; i < tableOfPositions.length; i++) {
            if (author.equals(tableOfPositions[i].author.getSurname())) {
                counter2 += 1;
            }
        }
        for (int j = 0; j < tableOfPositions.length; j++) {
            Position[] result = new Position[counter2];
            if (author.equals(tableOfPositions[j].author.getSurname())) {
                result[x2] = tableOfPositions[j];
                x2 += 1;
            }
        }
    }

//    public static void findAuthorOrTitle(String word) {
//        for (int i = 0; i < tableOfPositions.length; i++) {
//            if (word.equals(tableOfPositions[i].getAuthor()) || word.equals(tableOfPositions[i].getTitle())) {
//                counter3 += 1;
//            }
//        }
//        for (int j = 0; j < tableOfPositions.length; j++) {
//            Position[] result = new Position[counter3];
//            if (word.equals(tableOfPositions[j].getAuthor())) {
//                result[x3] = tableOfPositions[j];
//                x3 += 1;
//            } else if (word.equals(tableOfPositions[j].getTitle())) {
//                result[x3] = tableOfPositions[j];
//                x3 += 1;
//            }
//        }
//    }
//    public static void findAuthorWithMaxPositions() {
//        for (int i = 0; i < tableOfPositions.length; i++) {
//            if (word.equals(tableOfPositions[i].getAuthor()) || word.equals(tableOfPositions[i].getTitle())) {
//                counter3 += 1;
//            }
//        }
//        for (int j = 0; j < tableOfPositions.length; j++) {
//            Position[] result = new Position[counter3];
//            if (word.equals(tableOfPositions[j].getAuthor())) {
//                result[x3] = tableOfPositions[j];
//                x3 += 1;
//            } else if (word.equals(tableOfPositions[j].getTitle())) {
//                result[x3] = tableOfPositions[j];
//                x3 += 1;
//            }
//        }
//    }
}


