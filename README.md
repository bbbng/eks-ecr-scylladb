실행을 위해서 다음 명령어를 미리 실행하여 테이블을 생성합니다.

도커 서버의 경우 다음 명령어를 실행합니다.

```
docker exec -it <scyllaDB 컨테이너 이름> cqlsh
```

cqlsh에서 다음 cql 문을 입력하여 테이블을 생성합니다.
```
CREATE TABLE IF NOT EXISTS springdemo.student (
  sid uuid PRIMARY KEY,
  name text);
```
