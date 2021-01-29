import java.util.ArrayList;
import java.util.Iterator;

class Ticketing {

    int numOfPerson;
    int numOfTicket;

    ArrayList<Integer> numOfPersonArr;
    ArrayList<Integer> numOfTicketArr;

    public Ticketing(int numOfPerson, int numOfTicket) {
        this.numOfPerson = numOfPerson;
        this.numOfTicket = numOfTicket;

        numOfPersonArr = new ArrayList<>();
        numOfTicketArr = new ArrayList<>();
    }

    public int allocRandPersnNum() {
        boolean isDup = false;
        int randNum;
        do {
            randNum = (int) (Math.random() * 50) + 1;

            if (numOfPersonArr.contains(randNum)) {
                // 포함하지 않기 때문
                isDup = true;
            } else {
                // randNum을 포함하기 때문에 numOfPersonArr에 randNum을 add
                isDup = false;
                numOfPersonArr.add(randNum);
            }
        } while (isDup);
        return randNum;
    }

    public void ticketArr() {
        int personNum;

        for (int i = 0; i < numOfTicket; i++) {
            personNum = allocRandPersnNum();
            numOfTicketArr.add(personNum);
        }
    }

    public void printArr() {
        int ticketNum;
        int cnt = 1;
        Iterator<Integer> e = numOfTicketArr.iterator();

        // hasNext() 순회 할 수 있는 지 묻는 것
        while (e.hasNext()) {
            // 데이터가 있으면 루프 진행한다
            ticketNum = (int) e.next();
            System.out.printf("%4d", ticketNum);
            if (cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }
}

public class Review1 {
    public static void main(String[] args) {
        Ticketing ticketing = new Ticketing(50, 20);
        ticketing.ticketArr();
        ticketing.printArr();
    }
}
