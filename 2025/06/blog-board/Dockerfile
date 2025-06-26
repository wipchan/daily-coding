# 1. 기본 이미지
FROM openjdk:17-jdk-slim

# 2. 시간대 설정 (한국 기준)
ENV TZ=Asia/Seoul

# 3. JAR 파일을 컨테이너에 복사
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# 4. 앱 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]