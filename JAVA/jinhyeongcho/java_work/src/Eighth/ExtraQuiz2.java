package Eighth;

public class ExtraQuiz2 {
    public static void main(String[] args) {
        System.out.printf("여기는 A 사의 B-23 물류창고다.\n" +
                "   이 물류 창고에는 많은 수의 화물이 적재되는데\n" +
                "   화물을 적재하는 기준이 64 개 단위다.\n" +
                "   어떤 수량의 화물이 오던지\n" +
                "   화물을 창고에 저장할 수 있게 프로그래밍 해보자\n" +
                "   (화물의 크기는 균일하다고 가정한다)\n" +
                "   물류 창고로 들어오는 화물의 개수는\n" +
                "   1000 ~ 50000 개 사이로 들어온다 가정한다.\n");
        ContainerManager cm = new ContainerManager();

        cm.manage(64, 1000, 49001);
        int res = cm.processContainer();
        System.out.println(
                "AND NOT 결과 = " + res);

        if(cm.isBaseOf64()) {
            System.out.printf("결과는 %d의 배수가 맞습니다.\n", cm.getBase());
        } else {
            System.out.printf("결과는 %d의 배수가 아닙니다.\n", cm.getBase());
        }

        System.out.println("결과 + 64 = " + (res + 64));

        System.out.println(
                "최종적으로 선적할 컨테이너 개수는 = " +
                        cm.getFinalContainerCount());

        System.out.println("검산 = " +
                cm.getFinalContainerCount() * cm.getBase());
    }
}
