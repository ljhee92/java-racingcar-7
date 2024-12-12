# java-racingcar-precourse

## 💻 프로그램 진행 순서
1. 경주할 자동차의 이름을 입력 받는다.
2. 시도할 횟수를 입력 받는다.
3. 차수별 실행 결과를 출력한다.
4. 우승자를 선정한다.
5. 최종 우승자를 출력한다.

## 📋 기능 목록
### 사용자 입력
1. 자동차 이름
- [ ] 5자 이하의 자동차 이름을 쉼표(,)로 구분하여 입력한다.

2. 자동차 이동
- [ ] 이동횟수(차수)를 숫자로 입력한다.

3. 잘못된 값 입력 시
- [ ] ``IllegalArgumentException`` 발생 후 프로그램은 종료한다.

### 출력
1. 예외 상황 시 오류 메시지 출력
- [ ] "[ERROR]"로 시작하는 지정된 오류 메시지를 출력한다.

2. 자동차 이동
- [ ] 이름과 함께 차수마다 자동차의 위치를 ``-``로 출력한다.

3. 우승자
- [ ] 우승자가 한 명일 경우 한 명의 이름만 출력한다.
- [ ] 우승자가 여러 명일 경우 쉼표(,)로 구분하여 출력한다.

### 자동차
1. 이름
- [ ] 자동차는 이름을 가진다.
- [ ] 자동차의 이름은 쉼표(,)를 기준으로 구분한다.
- [ ] 자동차의 이름은 5자 이하이다.

2. 이동
- [ ] 자동차는 전진할 수 있다.
- [ ] 자동차는 멈출 수 있다.
- [ ] 전진 조건은 0~9 사이에서 무작위 값을 구한 후, 무작위 값이 4 이상이면 전진한다.
- [ ] 멈추는 조건은 무작위 값이 4 미만이면 멈춘다.

3. 우승자 선정
- [ ] 우승자는 한 명 이상일 수 있다.
- [ ] 전진 후 위치의 숫자가 가장 높은 자동차가 우승자이다.