<div align="center">

# 💸내네 챌린지 플랫폼

<br>
<img src="readmeImg/nene_challenge.png" width="60%" />

<h3>“참가비를 걸고 함께 도전한다!”</h3>
단순 기록이 아닌, 강력한 <b>동기부여 플랫폼</b>

<br>

</div>

<br>
<br>
<br>


<h2>📋 목차</h2>

- [💰 내돈 네돈 챌린지가 뭐예요?](#-내돈-네돈-챌린지가-뭐예요)
- [✨ 내네 챌린지가 특별한 이유](#-내네-챌린지가-특별한-이유)
- [🎯 내네챌에는 이런 기능이 있어요](#-내네챌에는-이런-기능이-있어요)
- [🛠️ 우리가 사용한 기술들](#-우리가-사용한-기술들)
- [📐 프로젝트 설계](#-프로젝트-설계)
- [🤔 기술 선택](#-기술-선택)
- [🔧 차별화된 기능](#-차별화된-기능)
- [📈 성능 개선](#-성능-개선)
- [🚨 트러블슈팅](#-트러블슈팅)

<br>
<br>
<br>



## 💰 내돈 네돈 챌린지가 뭐예요?

<div align="center">

<br>
<img src="readmeImg/main_page.png" width="400" />
<br>
<br>

**"내일부터 다이어트 해야지..."**  
**"이번엔 정말 운동 꾸준히 할거야!"**

작심삼일, 누구나 겪는 이야기죠.  
우리는 이 <b>__작심삼일의 벽__</b>을 깨트리는 **강력한 동기부여 플랫폼**을 만들었습니다.

<h3>💰 참가비를 걸고 함께 도전하세요!</h3>

</div>

<br>
<br>
<br>


## ✨ 내네 챌린지가 특별한 이유

#### 1. 손실 회피 본능을 통한 강력한 동기 부여
`챌린지 성공 시에는 투자한 포인트를 돌려받고 추가 보상까지 얻지만, 실패 시에는 참가비가 다른 사람에게 귀속됩니다.` <br>
`이러한 '손실 회피' 심리는 사용자가 챌린지를 중도에 포기하지 않고 끝까지 노력하게 만드는 강력한 원동력이 됩니다.`

#### 2. 보상에 대한 기대로 이끄는 더 큰 성취
`포인트와 추가 보상이라는 명확한 보상 구조는 사용자의 '보상 기대' 심리를 자극합니다.` <br>
`이는 챌린지를 성공적으로 마치고 더 큰 성취감을 맛보도록 유도하여, 목표 달성을 긍정적인 경험으로 각인시킵니다.`

#### 3. 함께하는 커뮤니티의 지속성 시너지
`혼자서는 흔들리기 쉬운 목표 달성 여정을, 같은 목표를 가진 사람들과 함께 완주합니다.` <br>
`'커뮤니티'의 존재는 서로에게 긍정적인 자극이 되어 지속성을 높이고, 챌린지 과정 자체를 즐거운 경험으로 만들어 줍니다.`


<br>
<br>
<br>

## 🎯 내네챌에는 이런 기능이 있어요

### 🚀 서비스 플로우

<img src="readmeImg/flow.png" width="100%" />

### 👤 사용자 이용 흐름 (프로젝트 핵심 흐름)
<img src="readmeImg/user_flow.png" width="100%" />

### 🔄 참여 프로세스

- 🔐 **소셜 로그인 시스템**<br>

    - 카카오/네이버 간편 로그인 : 복잡한 회원가입 과정 스킵


- 💳 **토스페이먼츠 포인트 충전**<br>

    - 실제 돈 → 포인트 안전 변환 : 필요한 만큼만 충전하는 스마트한 시작


- 💸 **All Or Nothing** 참가비 시스템 <br>

  - 성공하면 참가비 환급 + 실패자의 참가비 분배, 
  - 실패하면 전액 손실 : 절대 포기할 수 없는 강력한 동기부여


- 🛍️ **리워드 상점 시스템** <br>

    - 챌린지 상금으로 실물 상품 구매 : 노력이 실제 보상으로

<br>
<br>
<br>

## 📐 프로젝트 설계

### 📚 API 명세서
~~API Documentation(swagger)](http://3.36.220.104:8080/swagger-ui/index.html)~~

### 🏗️ 시스템 아키텍처

<img src="readmeImg/architecture.png" width="100%" />


### 🗂️ ERD

<img src="readmeImg/erd.png" width="100%" />

<br>
<br>
<br>


## 🛠️ 우리가 사용한 기술들
<img src="readmeImg/tech-stack.svg" width="100%" />

## 🤔 기술 선택

| 기술                                      | 우리 프로젝트에서 왜 사용했는지                                             | 질문                                                                                                                                                                                                                                                   |
|-----------------------------------------|---------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|                                                                                          |
| **⏱️ Spring Batch**                     | 챌린지 종료 및 달성자 보상 분배 **자동화**, **대량 데이터** 일괄 처리의 **정합성 및 안정성** 보장 | [왜 챌린지 종료와 정산을 배치로 처리했을까?](https://www.notion.so/teamsparta/Spring-Batch-2542dc3ef5148052a44ff177fdb9b89a)                                                                                                                                           |
| **🅰️ Amazon EventBridge + AWS Lambda** | 배치 서버 인스턴스를 **배치가 돌아가는 동안**에만 실행                              | [EC2를 필요할 때만 켜는 다른 방법은 없을까?](https://www.notion.so/teamsparta/Amazon-EventBridge-AWS-Lambda-2582dc3ef514809d9b40f06426c547ae)                                                                                                                        |
<br>
<br>
<br>


## 🔧 차별화된 기능

|    도메인     | 핵심 기능                         | 기술 구현                                                                                                        |
|:----------:|:------------------------------|:-------------------------------------------------------------------------------------------------------------|
| **🎯 챌린지** | 챌린지 참가 동시성 제어<br>챌린지 종료 일괄 처리 | Redisson 분산 락을 통한 동시성 제어<br>Spring Batch를 이용한 챌린지 종료 및 달성자 포인트 분배 자동화                                        |

<br>
<br>
<br>


## 📈 성능 개선
<details>
  <summary>💡 배치 서버 새벽 안에 끝나죠?</summary>

# 🛠️ 배치 프로그램 기능

- 마지막 진행일을 넘어간 챌린지 상태를 `FINISHED`로 변경
- 달성자와 보상 금액 판별
- 달성자에게 보상 지급

# 🎯 문제 정의

- 배치 프로그램은 **새벽 시간 내 작업 완료 필요**
- AWS EC2 인스턴스를 사용 → **배치 프로그램 실행 시간만큼 비용**
- 따라서 **빠르게 끝날수록 좋음**

---

# 📝 성능 개선 과정

## 💾 임의 데이터 생성

- 100만 건의 처리할 챌린지
- 참가자 1-10명 정도
- 1-40일 정도 임의의 진행 기간
- 10%의 달성자 - 100% 인증률, 나머지 사용자 - 10% 인증률

## 🔎 슬로우 쿼리 파악과 인덱싱을 통한 성능 개선

- Step 별로 처리 시간 측정 → 병목 Step 파악
- 프로그램 내부 로깅 + MySQL slow query 로그 확인 → 슬로우 쿼리 식별

    ```sql
    UPDATE point_wallet SET balance = balance + 2251 WHERE user_id = 578531;
    # Time: 2025-08-12T06:01:07.156521Z
    # Query_time: 1.179324  Lock_time: 0.000002 Rows_sent: 0  Rows_examined: 1000000
    ```

    - `point_wallet`: 사용자의 포인트 관련 정보
    - `user_id`: 사용자 식별자
- `EXPLAIN`으로 실행 계획을 파악 → index scan이지만 PK 사용 = Full Table Scan

  | id | select_type | table | partitions | type | possible_keys | key | key_len | ref | rows | filtered | Extra |
  | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
  | 1 | UPDATE | point_wallet |  | index |  | PRIMARY | 8 |  | 997,194 | 100.0 | Using where |

- **`user_id`** 칼럼 → **`WHERE`에 자주 사용**하고 **고유한 칼럼 → 단일 칼럼 고유 인덱스 설정**
- 쿼리 실행 시간 1.5s → 57ms

  <img alt="배치 병목 쿼리 실행시간" src="readmeImg/기존쿼리.png" width="100%" />

  <img alt="인덱스 추가 후 쿼리 실행시간" src="readmeImg/인덱스후쿼리.png" width="100%" />

- 삽입 성능 79ms로 양호

  <img alt="인덱스 추가 후 삽입 쿼리 실행시간" src="readmeImg/삽입쿼리성능.png" width="100%" />

## 🔧 chunk 크기 튜닝

### chunk 크기에 따른 장단점

| 큰 chunk 크기                              | 작은 chunk 크기                                   |
|-----------------------------------------|-----------------------------------------------|
| - 커밋 횟수 감소 → 성능 향상<br>- 네트워크 라운드 트립량 감소 | - 롤백 비용 감소<br>- DB 락 점유 시간 감소<br>- 메모리 소모량 감소 |

- 크기 늘려가며 실행 시간 관찰
- OOM 발생하지 않도록 메모리 사용량 관찰

### 성능 지표 및 측정 방법

- JVM Heap: OOM 방지 위한 메모리 사용량 → JConsole

  <img alt="JConsole을 이용한 JVM 힙 사용량 측정" src="readmeImg/JVM_Heap.png" width="100%" />

- GC 시간: 병목 가능성의 부가 지표 → JConsole

  <img alt="JConsole을 이용한 GC 횟수 및 시간 측정" src="readmeImg/GC_Time.png" width="100%" />

- 디스크 사용량: MySQL IO 처리량 → 윈도우 Perfmon

  <img alt="윈도우 Perfmon을 이용한 디스크 사용량 측정" src="readmeImg/DiskUtil.png" width="100%" />

- 실행 시간 → 배치 프로그램 로그

  <img alt="로그를 통한 실행시간 측정" src="readmeImg/ExecutionTime.png" width="100%" />

### Step 별 측정 결과 및 해석

- 전체 Step 흐름

  <img alt="전체 배치 간략 흐름도" src="readmeImg/배치흐름.png" width="100%" />

1. **FinishChallengeStep**

    | 청크 크기/ Step | 500   | 1000  | 5000  | 10000 |
    |-------------|-------|-------|-------|-------|
    | JVM Heap    | 40mb  | 45mb  | 120mb | 80mb  |
    | GC 시간       | 1.4ms | 1.6ms | 2,6ms | 3.9ms |
    | 소요 시간       | 7m21s | 6m21s | 5m13s | 4m23s |
    | 디스크 사용량     | 95%   | 95%   | 95%   | 95%   |

    - **커밋 횟수 감소** → **시간 감소**

2. **CalculateRewardStep**

    | 청크 크기/ Step | 500    | 1000   | 5000        | 10000       |
    |-------------|--------|--------|-------------|-------------|
    | JVM Heap    | 40mb   | 50mb   | 50-150mb 진동 | 50-100mb 진동 |
    | GC 시간       | 1.4ms  | 1.11ms | 1.89ms      | 2.4ms       |
    | 소요 시간       | 19m29s | 18m5s  | 16m37s      | 14m39s      |
    | 디스크 사용량     | 70%    | 50%    | 10 → 순간적 90 | 10 → 순간적 90 |

    - chunk가 커질수록 **디스크 사용량이 간헐적**으로 **순간적 상승**
    - 어플리케이션 병목 → **멀티스레드** 전환 시 큰 **성능 향상 기대**

3. **DistributeRewardStep**

    | 청크 크기/ Step | 500   | 1000  | 5000  | 10000 |
    |-------------|-------|-------|-------|-------|
    | JVM Heap    | 70mb  | 100mb | 130mb | 140mb |
    | GC 시간       | 1.5ms | 1.5ms | 2.7ms | 15ms  |
    | 소요 시간       | 4m3s  | 3m27s | 2m10s | 2m35s |
    | 디스크 사용량     | 90%   | 90%   | 90%   | 90%   |

    - chunk를 너무 키웠을 시 시간 증가 → **SQL 쿼리 효율 감소**로 추정

### ✅ 결과 정리 및 선택

| 청크 크기/ Step | **FinishChallengeStep** | **CalculateRewardStep** | **DistributeRewardStep** | 총합     |
|-------------|-------------------------|-------------------------|--------------------------|--------|
| 500         | 7m21s                   | 19m29s                  | 4m3s                     | 30m53s |
| 1000        | 6m21s                   | 18m5s                   | 3m27s                    | 27m53s |
| 5000        | 5m13s                   | 16m37s                  | 2m10s                    | 24m0s  |
| 10000       | 4m23s                   | 14m39s                  | 2m35s                    | 21m37s |

- 대체로 chunk 크기와 실행시간은 반비례
- 메모리 충분
- 롤백 비용과 락 점유 시간 고려한 chunk 크기 설정
    - DistributeRewardStep: 읽기 위주 + 큰 chunk 부담 없음 → 10000
    - CalculateRewardStep: 읽기 위주이나 메모리 안정성 고려 → 1000
    - DistributeRewardStep: ****여러 테이블/인덱스에 락 + 값 수정  → 1000

## 🔀 멀티스레딩을 통한 개선

- chunk 크기는 바로 위 설정과 동일하게 설정
- 실행 환경의 논리코어 4개

| 스레드 수/ Step | **FinishChallengeStep** | **CalculateRewardStep** | **DistributeRewardStep** | 총합 |
| --- | --- | --- | --- | --- |
| 싱글 스레드 | 4m23s | 18m 5s | 3m27s | 25m 55s |
| **4 스레드** | **2m27s** | **7m35s** | **1m29s** | **11m31s** |
| 8 스레드 | 1m58s | 7m50s | 1m25s | 11m13s |
- 4 스레드 기준 싱글 스레드 기준에 비해 **약 55.6% 감소**

---

# 💡 기타 고려사항

### 동시성 문제
  - 챌린지 수동 종료 불가 → 중복 처리 불가
  - 챌린지 인증은 기간 내에만 가능 → 달성률 변동 불가

### 성능 차이의 가능성
- 다음 이유로 로컬에서 튜닝 진행
  - 변인 통제의 단순성과 시간
  - 디버깅 및 모니터링 용이
  - 전체적인 방향 검증 가능
  - 반복 테스트 시 RDS 비용 발생
- CPU와 메모리 성능 상이하므로 차이 존재 가능

</details>


<br>
<br>
<br>

## 🚨 트러블슈팅
<details>
  <summary>🚨 멀티스레드 배치 처리 중 데드락 발생</summary>

# 📃 배경

- 기존 챌린지 종료 및 보상 분배 **배치 흐름**과 **데드락 발생 지점**

  ![image.png](readmeImg/데드락.png)

# 🚨 문제 상황

- `DistributeRewardStep`은 **4개 스레드 동시 실행**
- Step 내부 `DistributeRewardWriter`는 다음 SQL 실행
    - **포인트 분배 내역 기록** - `INSERT INTO point_transaction(…) VALUES (…)`
    - 임시 테이블 정리 - `DELETE FROM tmp_reward_info WHERE (user_id, challenge_id) = ?`
    - **사용자 포인트 증가** - `UPDATE point_wallet SET balance = balance + ? WHERE user_id = ?`
- **Writer**에서 **데드락 발생**

    ```text
    org.springframework.dao.CannotAcquireLockException: PreparedStatementCallback; 
    SQL [UPDATE point_wallet SET balance = balance + ? WHERE user_id = ?]; 
    Deadlock found when trying to get lock; try restarting transaction
    ...
    at hello.batch.job.distributerewardstep.DistributeRewardWriter.write
      (DistributeRewardWriter.java:39) ~[main/:na]
    ```


# 🤔 원인 분석

## Innodb 로그 확인

- 위 로그의 **39번 줄은 다음 쿼리** 실행

    ```sql
    UPDATE "point_wallet" SET balance = balance + ? WHERE user_id = ?
    ```

- MySQL의 `show engine innodb status`로 **MySQL 로그 조회**
- 로그 정보 요약

    ```
    *** (1) TRANSACTION:
    UPDATE point_wallet SET balance = balance + 4623 WHERE user_id = 8198
    
    *** (1) HOLDS THE LOCK(S):
    RECORD LOCKS space id 2704 page no 54 n bits 824 index user_id_idx of 
    table `million_performance`.`point_wallet` trx id 260433 lock_mode X
    Record lock, heap no 649 PHYSICAL RECORD: n_fields 2; compact format; info bits 0
    
    *** (1) WAITING FOR THIS LOCK TO BE GRANTED:
    RECORD LOCKS space id 2704 page no 120 n bits 392 index PRIMARY of
    table `million_performance`.`point_wallet` trx id 260433 lock_mode X locks rec but not gap waiting
    Record lock, heap no 199 PHYSICAL RECORD: n_fields 8; compact format; info bits 0
    
    *** (2) TRANSACTION:
    UPDATE point_wallet SET balance = balance + 10914 WHERE user_id = 8198
    
    *** (2) HOLDS THE LOCK(S):
    RECORD LOCKS space id 2704 page no 120 n bits 392 index PRIMARY of 
    table `million_performance`.`point_wallet` trx id 260435 lock mode S locks rec but not gap
    Record lock, heap no 199 PHYSICAL RECORD: n_fields 8; compact format; info bits 0
    
    *** (2) WAITING FOR THIS LOCK TO BE GRANTED:
    RECORD LOCKS space id 2704 page no 54 n bits 824 index user_id_idx of 
    table `million_performance`.`point_wallet` trx id 260435 lock_mode X waiting
    Record lock, heap no 649 PHYSICAL RECORD: n_fields 2; compact format; info bits 0
    
    *** WE ROLL BACK TRANSACTION (2)
    ```

- 1번 트랜잭션
    - **`user_id_idx`**, heap no **649로 X락** 획득
    - **`PK`**, heap no **199 X락**을 요청
- 2번 트랜잭션
    - **`PK`**, heap no **199** **S락**을 획득
    - **`user_id_idx`**, heap no **649**로 **X락** 요청
- **point_wallet 테이블**의 **같은 row**에 대해 **서로 다른 락**을 요청 → **데드락** 발생

## S락의 출처

### `SELECT`와 S락

- S락은 일반적으로 읽기 쿼리에 걸림
- Innodb 기본 트랜잭션 격리수준인 `REPEATABLE READ`에서는 [S락을 걸지 않음](https://dev.mysql.com/doc/refman/8.4/en/innodb-consistent-read.html)

### FK와 S락

- 이외 **point_wallet 테이블과 관련된 쿼리**는 다음뿐

    ```sql
    INSERT INTO "point_transaction"(created_at, deleted_at, updated_at, amount, description, reason, point_wallet_id) VALUES (?, null, ?, ?, '챌린지 보상 지급', 'CHALLENGE_REWARD', ?)
    ```

- `point_wallet_id`를 **FK로 참조**
- InnoDB에서 **`INSERT`는 FK로 참조하는 테이블의 row에 S락**을 획득

- [MySQL 공식문서](https://dev.mysql.com/doc/refman/8.4/en/innodb-locks-set.html)에 다음과 같이 근거
    ```text
    If `FOREIGN KEY` constraint is defined on a table, any insert, update, or delete 
    that requires the constraint condition to be checked 
    sets shared record-level locks on the records that it looks at to check the constraint
    InnoDB also sets these locks in the case where the constraint fails.
    ```


# 🙆‍♀️ 해결 방안

- `user_id`와 `point_wallet_id`는 **일대일 관계** → **트랜잭션(청크)별**로 **`user_id` 값이 겹치지 않으면 문제 해결** 가능
- 청크에 **파티셔닝** 적용 → 각 **스레드별로 `user_id` 처리 범위 분리**, 데드락 해결
</details>

<details>
  <summary>🚨 `@EnableBatchProcessing`으로 인한 Spring Batch 메타데이터 테이블 생성 실패</summary>

# 🚨 문제 상황

- Spring Boot 3.5.3 버전과 spring-boot-starter-batch를 사용하여 데모 프로그램 실행
- 다음 오류 발생

    ```text
    Caused by: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback;
    bad SQL grammar [SELECT JOB_INSTANCE_ID, JOB_NAME
    FROM BATCH_JOB_INSTANCE
    WHERE JOB_NAME = ?
     and JOB_KEY = ?]
    ...
    Caused by: org.h2.jdbc.JdbcSQLSyntaxErrorException:
    Table "BATCH_JOB_INSTANCE" not found (this database is empty); SQL statement:
    SELECT JOB_INSTANCE_ID, JOB_NAME
    FROM BATCH_JOB_INSTANCE
    WHERE JOB_NAME = ?
     and JOB_KEY = ? [42104-232]
    ```

- Spring Batch 메타데이터 테이블 생성 실패

## 🤔 원인 분석

- 검색을 통한 **Spring Boot와 Spring Batch의 통합**을 다룬 [**문서**](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Migration-Guide#spring-batch-changes) 확인
    - Spring Boot와 함께 사용하는 경우 **`@EnableBatchConfig`는 권장되지 않음**
    - 작성하는 경우 Spring Boot의 **자동구성이 제대로 동작하지 않을 수 있음**
- 자동 구성 소스 확인

    ```java
    @AutoConfiguration(
        after = {HibernateJpaAutoConfiguration.class, TransactionAutoConfiguration.class}
    )
    @ConditionalOnClass({JobLauncher.class, DataSource.class, DatabasePopulator.class})
    @ConditionalOnBean({DataSource.class, PlatformTransactionManager.class})
    @ConditionalOnMissingBean(
        value = {DefaultBatchConfiguration.class},
        annotation = {EnableBatchProcessing.class}
    ) // EnableBatchProcessing이 있으면 동작 안 함
    @EnableConfigurationProperties({BatchProperties.class})
    @Import({DatabaseInitializationDependencyConfigurer.class})
    public class BatchAutoConfiguration {
    	...
    
    	 @Configuration(
            proxyBeanMethods = false
        )
        @Conditional({OnBatchDatasourceInitializationCondition.class})
        static class DataSourceInitializerConfiguration {
            DataSourceInitializerConfiguration() {
            }
    
            @Bean
            @ConditionalOnMissingBean
            BatchDataSourceScriptDatabaseInitializer batchDataSourceInitializer(DataSource dataSource, @BatchDataSource ObjectProvider<DataSource> batchDataSource, BatchProperties properties) {
                return new BatchDataSourceScriptDatabaseInitializer((DataSource)batchDataSource.getIfAvailable(() -> dataSource), properties.getJdbc());
            }
        }
    
        static class OnBatchDatasourceInitializationCondition extends OnDatabaseInitializationCondition {
            OnBatchDatasourceInitializationCondition() {
                super("Batch", new String[]{"spring.batch.jdbc.initialize-schema"});
            }
        }
    }
    ```

- `@ConditionalOnMissingBean` → `@EnableBatchProcessing`이 없어야 빈으로 등록
- `BatchDataSourceScriptDatabaseInitializer` → 해당 타입의 상위 클래스인 `AbstractScriptDatabaseInitializer`는 `InitializingBean` 인터페이스를 구현
- `afterPropertiesSet()`에 DB를 초기화
- 해당 부분이 DB 초기화 스크립트를 호출하는 것으로 추정

    ```java
    public abstract class AbstractScriptDatabaseInitializer implements ResourceLoaderAware,
    InitializingBean {
        private static final String OPTIONAL_LOCATION_PREFIX = "optional:";
        private final DatabaseInitializationSettings settings;
        private volatile ResourceLoader resourceLoader;
    
        protected AbstractScriptDatabaseInitializer(DatabaseInitializationSettings settings) {
            this.settings = settings;
        }
    
        public void setResourceLoader(ResourceLoader resourceLoader) {
            this.resourceLoader = resourceLoader;
        }
    
        public void afterPropertiesSet() throws Exception {
            this.initializeDatabase();
        }
    
        public boolean initializeDatabase() {
            ScriptLocationResolver locationResolver = new ScriptLocationResolver(this.resourceLoader);
            boolean initialized = this.applySchemaScripts(locationResolver);
            return this.applyDataScripts(locationResolver) || initialized;
        }
        ...
    }
    ```

- 해당 스크립트는 **스프링 배치 jar 내부의 `schema-h2.sql`을 호출**한다는 검색 결과
- **직접 파일을 확인**

    ```sql
    -- Autogenerated: do not edit this file
    
    CREATE TABLE BATCH_JOB_INSTANCE  (
    	JOB_INSTANCE_ID BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY ,
    	VERSION BIGINT ,
    	JOB_NAME VARCHAR(100) NOT NULL,
    	JOB_KEY VARCHAR(32) NOT NULL,
    	constraint JOB_INST_UN unique (JOB_NAME, JOB_KEY)
    ) ;
    
    ...
    ```

- 검증 위해 jar 파일을 압축 해제 후 **`schema-h2.sql`의 내용을 모두 지우고 실행** → **오류 발생**

    ```java
    Caused by: org.springframework.jdbc.datasource.init.UncategorizedScriptException: Failed to execute database script from resource [class path resource [org/springframework/batch/core/schema-h2.sql]]
    ...
    	at app//org.springframework.boot.sql.init.AbstractScriptDatabaseInitializer.runScripts(AbstractScriptDatabaseInitializer.java:146)
    ...
    Caused by: java.lang.IllegalArgumentException: 'script' must not be null or empty
    ...
    ```

- `AbstractScriptDatabaseInitializer#initializeDatabase` 호출 확인
- `schema-h2.sql`을 불러오는 것 확인

# 🙆‍♀️ 해결 방안

- **`@EnableBatchProcessing`을 제거**
</details>

<br>
<br>
<br>
