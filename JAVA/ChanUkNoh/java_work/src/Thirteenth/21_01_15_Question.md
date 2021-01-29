# 2021 / 01 / 15 13일차 Question Note

### Question
1. 오늘 과제에서 코드를 조금 더 유연하게 짜고싶었는데 리스트의 크기를 미리 정해놓는 방법을 몰라서 상수를 사용해
   코드를 짯습니다. 유사한 동작의 메서드를 재활용하고 싶었지만 케이스를 나눠서 두 개의 메서드를 작성해
   뭔가 마음속의 불편함이 남았는데, list 는 배열처럼 크기를 정해 놓을 수는 없나요?
   
***
### Study

* HashSet의 주요 메서드  
1. HashSet(Collection c): collection의 요소들을 초기셋팅
2. HashSet(int initialCapacity): 초기 용량
3. HashSet(int initialCapacity, float loadFactor): 보통 용량을 늘릴때 2배로 늘리는데 만약 loadFactor를 0.8로 주면 용량이 80% 찼을때 2배로 용량을 늘림
4. boolean add(Object o): 추가, 이미 같은 값이 있다면 false를 반환한다.
5. boolean addAll(Collection c): Collection c 안의 요소들을 모두 더한다. Set은 중복을 제거하기 때문에 Collection끼리의 합집합을 반환한다.
6. boolean remove(Obect o): 삭제
7. boolean retainAll(Collection c): 교집합
8. void clear(): 모든 요소 삭제
9. boolean contains(Object o): 해당 값이 포함되어 있는지 확인
10. Iterator iterator(): 이터레이터 객체를 반환
11. boolean isEmpty(): Set이 비어있는지 확인
12. int size(): Set의 크기를 반환

* Collection
1. List - 순서 O, 데이터 중복 O  
LinkedList  
   Stack  
   Vector  
   ArrayList  
       
List는 데이터를 순서에 맞게 일렬로 구성하는데, 인덱스가 부여되기에 인덱스로 검색가능.
Set과는 다르게 중복을 허용함.

2. Set - 순서 X, 데이터 중복 X  
HashSet  
   LinkedHashSet  
   TreeSet
   
Set은 중복이 없는 요소들을 포함한다. - 집합