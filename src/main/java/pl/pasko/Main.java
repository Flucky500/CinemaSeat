package pl.pasko;

public class Main {

    public static void main(String[] args) {

        CinemaSeat seat2row3 = new CinemaSeat(2,3,true);
        System.out.println(seat2row3.cinemaSeatChecker(2,3,true));

        CinemaSeat seat31row2 = new CinemaSeat(31,2,true);
        System.out.println(seat31row2.cinemaSeatChecker(31,2,true));

        CinemaSeat seat12row10 = new CinemaSeat(12,10,false);
        System.out.println(seat12row10.cinemaSeatChecker(12,10,false));

        CinemaSeat seat12row21 = new CinemaSeat(30,21,true);
        System.out.println(seat12row10.cinemaSeatChecker(30,21,true));

        CinemaSeat seat10row10 = new CinemaSeat(10,10,true);
        System.out.println(seat12row10.cinemaSeatChecker(10,10,true));

    }

}