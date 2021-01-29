package Twelfth.TwelfthHomework.TwelfthHomeworkReview;

public interface SkillTree {

    // 인터페이스는 왜 사용할까?
    // SkillTree 인터페이스에서 구현한 가장 큰 '틀'만 있는 메서드의 상세내용을
    // 각각의 목적에 맞게 다르게 적용하기 위해 사용한다.
    // 예를 들어 가장 큰 틀 skill1() 과 skill2() 를 인터페이스에
    // 미리 구현하고 두 메서드를 각각의 쓰임에 맞게 Adventurer 클래스에는
    // Adventurer 의 스킬을 구현하고 Worrior 의 스킬엔 Worrior 의 스킬을
    // 각각 구현하기 위해 만든다.
    public void skill1();
    public void skill2();
}
