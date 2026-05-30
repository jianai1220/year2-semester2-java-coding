public class Family {
    private String familyName;
    private int familySize;

    public Family (String familyName, int familySize){
        this.familyName = familyName;
        this.familySize = familySize;
    }

    public void displayFamilyInfo(){
        System.out.println("Family: "+familyName);
        System.out.println("Number of members: "+familySize);
    }

    public static class Member{
        private String memberName;

        public Member(String memberName){
            this.memberName = memberName;
        }

        public void displayMemberInfo(){
            System.out.println("Member Name: "+memberName);
        }
    }

    public static void main(String[] args) {
        Family myFamily = new Family("Lee", 5);
        myFamily.displayFamilyInfo();

        Family.Member member1 = new Family.Member("Jian Ai");
        Family.Member member2 = new Family.Member("Min");
        Family.Member member3 = new Family.Member("Won");

        member1.displayMemberInfo();
        member2.displayMemberInfo();
        member3.displayMemberInfo();
        
    }
}

