//package Twelveth;
//
//public interface Interface {
//    public int game(Object other, int order);
//
//    interface explorer {
//    }
//
//    interface first {
//        public void job();
//    }
//
//    interface skilltree {
//        public void skill1();
//    }
//
//    interface second {
//        public void job2();
//
//    }
//
//    class Player1 implements explorer, first, second {
//        public void job() {
//            System.out.println("전사");
//        }
//
//
//        public void job2() {
//            System.out.println("워로드");
//        }
//
//
//    }
//
//
//    class Player2 implements explorer, first, second {
//        public void job() {
//            System.out.println("도적");
//        }
//
//
//        public void job2() {
//            System.out.println("어쌔신");
//        }
//
//    }
//
//    class Player3 implements Interface.explorer, Interface.first, Interface.first.second {
//        public void job() {
//            System.out.println("마법사");
//        }
//
//
//        public void job2() {
//            System.out.println("위자드");
//
//        }
//
//    }
//
//
//    public class Interface {
//        public static void main(String[] args) {
//            explorer ep1 = new Player1();
//            explorer ep2 = new Player2();
//            explorer ep3 = new Player3();
//            System.out.println("각 플레이어들의 1차 전직은?");
//            Player2
//                    ((first.Player2) ep2).job();
//            ((first.Player3) ep3).job();
//            System.out.println("각 플레이어들의 2차 전직은?");
//            ((Interface.first.Player1) ep1).job2();
//            ((first.Player2) ep2).job2();
//            ((first.Player3) ep3).job2();
//
//        }
//    }
//}
//
//
//
