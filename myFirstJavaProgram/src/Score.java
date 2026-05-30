public class Score {
    public static void main(String[] args) {
        int[] scores = {75,90,68,54,80};

        int highestScore = findHighestScore(scores);
        System.out.println("Highest score: " + highestScore);

        System.out.println("Grades: ");
        for(int score:scores){
            System.out.println("Score: "+score+", Grade: "+determineGrade(score));
    
        }
    }

    public static int findHighestScore(int[] scores){
        int highest = scores[0];
        for (int score:scores){
            if(score>highest){
                highest = score;
            }
        }
        return highest;
    }

    public static char determineGrade(int score){
        if (score >= 80){
            return 'A';
        }else if(score >= 70){
            return 'B';
        }else if(score >= 60){
            return 'C';
        }else if(score >= 50){
            return 'D';
        }else{
            return 'F';
        }
    }
}
