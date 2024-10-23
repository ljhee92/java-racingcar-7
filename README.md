# 🏎️ java-racingcar-precourse

## ⭐ 미션에서 지키려고 노력한 것
1. 과제 진행 요구 사항, 기능 요구 사항, 프로그래밍 요구 사항 모두 만족
2. 기능 구현 전 프로그램 진행 순서, 기능 목록 작성
3. 1차 기능 구현 후 기본 테스트 통과 여부 확인
4. 기본 테스트 통과 후 리팩토링, 추가 테스트 목록 작성
5. 리팩토링, 추가 테스트 목록 작성 시 기능 요구 사항 이외에 판단할 수 있는 요구 사항 수립
6. 커밋 메시지를 제목과 내용으로 나누어 기능 단위 커밋
7. class와 method의 역할을 명확히 구분 / 특히 method가 단일 역할을 수행하는지 확인
8. Java Code Convention을 지키며 구현
9. 1주차 공통 피드백을 최대한 반영

## 📁 디렉토리 구조
```
```

## 💻 프로그램 진행 순서
1. 경주할 자동차 이름을 입력 받는다.
    * 쉼표(,) 기준으로 구분하여 입력했는지 검증한다. 
    * 자동차 이름이 5자 이하인지 검증한다.
2. 시도할 횟수를 입력 받는다.
    * 횟수가 숫자인지 검증한다.
3. 시도 횟수만큼 경주를 반복하고, 횟수별 경주 결과를 출력한다.
4. 경주마다 자동차별 0~9 사이 무작위 값을 구한 후, 값이 4 이상이면 전진한다.
5. 마지막 경주 이후 최종 우승자를 출력한다.
    * 단독 우승자와 공동 우승자로 내용을 구분하여 출력한다. 
    * 공동 우승자일 경우 쉼표(,)를 이용하여 구분한다.
6. 실행 결과 예시
    ```
    경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
    pobi,woni,jun
    시도할 횟수는 몇 회인가요?
    5
    
    실행 결과
    pobi : -
    woni :
    jun : -
    
    pobi : --
    woni : -
    jun : --
    
    pobi : ---
    woni : --
    jun : ---
    
    pobi : ----
    woni : ---
    jun : ----
    
    pobi : -----
    woni : ----
    jun : -----
    
    최종 우승자 : pobi, jun
    ```

## 📋 기능 목록
### 사용자 입력
1. 자동차 이름
    - [ ] 경주할 자동차 이름 입력 받기
    - [ ] 이름을 ``,`` 기준으로 구분하여 입력했는지 검증
    - [ ] 이름이 ``5자 이하``인지 검증

2. 시도할 횟수
    - [ ] 횟수가 ``숫자``인지 검증

### 경주 진행
- [ ] 시도 횟수만큼 경주 ``반복``
- [ ] 경주마다 자동차별 0~9 사이 ``무작위 값`` 뽑기
- [ ] 무작위 값이 ``4`` 이상이면 전진

### 출력
1. 경주별 결과 출력
    - [ ] 전진하는 경우 ``-`` 출력

2. 최종 우승자 출력
    - [ ] 단독 우승자, 공동 우승자 구분하여 출력

## 🤔 요구 사항 이외의 추가 기능

## ✅ 테스트 목록