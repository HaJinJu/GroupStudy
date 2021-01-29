// 랜덤한 개수의 배열 + 랜덤 수
// 이 배열에서 짝수가 몇 개 나왔는지 체크

public class Quiz10To11 {
    public static void main(String[] args) {
        
        // Random method 사용
        Random random = new Random();
        
        random.setArr();
        random.setRandomArr();
        random.printRandomArr();
        System.out.println("짝수의 개수" + random.getRandomArr());
    }
}