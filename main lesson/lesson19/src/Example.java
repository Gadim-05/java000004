public class Example {

    public static void whichSeason(int number){
//        switch (number){
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("It's winter");
//                break;
//
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("It's spring");
//                break;
//
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("It's summer");
//                break;
//
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("It's autumn");
//        }

        if (number==Month.DECEMBER.value||number==Month.JANUARY.value||number==Month.FEBRUARY.value){
            System.out.println("It's Winter");
        } else if (number==Month.MARCH.value||number==Month.APRIL.value||number==Month.MAY.value) {
            System.out.println("It's Spring");
        } else if (number==Month.JUNE.value||number==Month.JULY.value||number==Month.AUGUST.value) {
            System.out.println("It's Summer");
        } else if (number==Month.SEPTEMBER.value||number==Month.OCTOBER.value||number==Month.NOVEMBER.value) {
            System.out.println("It's Fall");
        }
        else {
            System.err.println("Invalid Month");
        }
    }
}
